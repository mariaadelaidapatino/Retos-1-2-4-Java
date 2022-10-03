package co.maria.adelaida.patino.ocampo.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.maria.adelaida.patino.ocampo.model.util.JDBCUtilities;
import co.maria.adelaida.patino.ocampo.model.vo.ProyectoBancoVo;

public class ProyectoBancoDao {

    public List<ProyectoBancoVo> listar(String banco) throws SQLException{
        List<ProyectoBancoVo> respuesta = null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rset = null;        

        try{
            connection = JDBCUtilities.getConnection();
            statement = connection.prepareStatement("SELECT p.ID_Proyecto as ID, p.Constructora, p.Ciudad, p.Clasificacion, t.Estrato, (l.Nombre ||' '|| l.Primer_Apellido ||' '|| l.Segundo_Apellido) as LIDER"   
            +" FROM Proyecto p"
            +" JOIN Lider l ON (p.ID_Lider = l.ID_Lider)"
            +" JOIN Tipo t ON(p.ID_Tipo = t.ID_Tipo)"
            +" WHERE p.Banco_Vinculado = ?"
            +" ORDER BY p.Fecha_Inicio DESC, p.Ciudad ASC, p.Constructora;");
            statement.setString(1, banco);
            rset =statement.executeQuery();
            respuesta = new ArrayList<ProyectoBancoVo>(); 

            while (rset.next()){
                ProyectoBancoVo objeto = new ProyectoBancoVo();
                objeto.setId(rset.getInt("id"));
                objeto.setCiudad(rset.getString("ciudad"));
                objeto.setConstructora(rset.getString("constructora"));
                objeto.setClasificacion(rset.getString("clasificacion"));
                objeto.setEstrato(rset.getInt("estrato"));
                objeto.setLider(rset.getString("lider"));
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
