package co.maria.adelaida.patino.ocampo.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.maria.adelaida.patino.ocampo.model.util.JDBCUtilities;
import co.maria.adelaida.patino.ocampo.model.vo.DeudasPorProyectoVo;

public class DeudasPorProyectoDao {

    public List<DeudasPorProyectoVo> listar(Double limite) throws SQLException{
        List<DeudasPorProyectoVo> respuesta = null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rset = null;        

        try{
            connection = JDBCUtilities.getConnection();
            statement = connection.prepareStatement("SELECT c.ID_Proyecto, SUM(c.Cantidad * mc.Precio_Unidad)  as VALOR"
            +" FROM Compra c" 
            +" JOIN MaterialConstruccion mc ON c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion"
            +" WHERE c.Pagado = 'No'"
            +" GROUP BY c.ID_Proyecto"
            +" HAVING VALOR > ?"
            +" ORDER BY VALOR DESC;");
            statement.setDouble(1, limite);
            rset =statement.executeQuery();
            respuesta = new ArrayList<DeudasPorProyectoVo>(); 

            while (rset.next()){
                DeudasPorProyectoVo objeto = new DeudasPorProyectoVo();
                objeto.setId(rset.getInt("ID_Proyecto"));
                objeto.setValor(rset.getDouble("valor"));
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
