package co.maria.adelaida.patino.ocampo.model.dao;

import co.maria.adelaida.patino.ocampo.model.util.JDBCUtilities;
import co.maria.adelaida.patino.ocampo.model.vo.ComprasDeLiderVo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ComprasDeLiderDao {

    public List<ComprasDeLiderVo> listar() throws SQLException{
        List<ComprasDeLiderVo> respuesta = null;
        Connection connection = null;
        Statement statement = null;
        ResultSet rset = null;        

        try{
            connection = JDBCUtilities.getConnection();
            statement = connection.createStatement();            
            rset =statement.executeQuery("SELECT l.Nombre || ' '|| l.Primer_Apellido || ' '|| l.Segundo_Apellido AS LIDER,  SUM(c.Cantidad * mc.Precio_Unidad) as VALOR"
            +" FROM Compra c"
            +" JOIN Proyecto p ON (c.ID_Proyecto  = p.ID_Proyecto)"
            +" JOIN Lider l  ON (p.ID_Lider  = l.ID_Lider)"
            +" JOIN MaterialConstruccion mc ON (c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion)"
            +" GROUP BY l.Nombre || ' '|| l.Primer_Apellido || ' '|| l.Segundo_Apellido"
            +" order by VALOR DESC"
            +" LIMIT 10;");
            respuesta = new ArrayList<ComprasDeLiderVo>(); 

            while (rset.next()){
                ComprasDeLiderVo objeto = new ComprasDeLiderVo();
                objeto.setLider(rset.getString("Lider"));                
                objeto.setValor(rset.getDouble("Valor"));
                respuesta.add(objeto);
            }

        } finally {
            if (rset != null){
                rset.close();
            }
            if (statement != null){
                statement.close();
            }
            if(connection != null){
                connection.close();
            }
        }
    return respuesta;
    }
}
