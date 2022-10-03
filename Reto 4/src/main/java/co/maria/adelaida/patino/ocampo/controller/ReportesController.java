package co.maria.adelaida.patino.ocampo.controller;

import java.sql.SQLException;
import java.util.List;

import co.maria.adelaida.patino.ocampo.model.dao.ComprasDeLiderDao;
import co.maria.adelaida.patino.ocampo.model.dao.DeudasPorProyectoDao;
import co.maria.adelaida.patino.ocampo.model.dao.ProyectoBancoDao;
import co.maria.adelaida.patino.ocampo.model.vo.ComprasDeLiderVo;
import co.maria.adelaida.patino.ocampo.model.vo.DeudasPorProyectoVo;
import co.maria.adelaida.patino.ocampo.model.vo.ProyectoBancoVo;
import co.maria.adelaida.patino.ocampo.view.ReportesView;

public class ReportesController {
    
    private ProyectoBancoDao proyectoBancoDao;
    private ComprasDeLiderDao comprasDeLiderDao;
    private DeudasPorProyectoDao deudasPorProyectoDao;
    
    public ReportesController(){
        this.proyectoBancoDao = new ProyectoBancoDao();
        this.comprasDeLiderDao = new ComprasDeLiderDao();
        this.deudasPorProyectoDao = new DeudasPorProyectoDao();
    }

    public List<ProyectoBancoVo> proyectos(String banco) throws SQLException{
        return proyectoBancoDao.listar(banco);     
    }
     
    public List<DeudasPorProyectoVo> deudas(Double limite) throws SQLException{
        return deudasPorProyectoDao.listar(limite);
    }

    public List<ComprasDeLiderVo> lideres() throws SQLException{
        return  comprasDeLiderDao.listar();
    }

       
    }

    
