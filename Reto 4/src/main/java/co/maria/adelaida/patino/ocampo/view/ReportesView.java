package co.maria.adelaida.patino.ocampo.view;

import java.util.List;

import co.maria.adelaida.patino.ocampo.controller.ReportesContoller;
import co.maria.adelaida.patino.ocampo.controller.ReportesController;
import co.maria.adelaida.patino.ocampo.model.dao.DeudasPorProyectoDao;
import co.maria.adelaida.patino.ocampo.model.dao.ProyectoBancoDao;
import co.maria.adelaida.patino.ocampo.model.vo.ComprasDeLiderVo;
import co.maria.adelaida.patino.ocampo.model.vo.DeudasPorProyectoVo;
import co.maria.adelaida.patino.ocampo.model.vo.ProyectoBancoVo;


public class ReportesView {

        private static ReportesController controlador;

        public ReportesView(){
                controlador = new ReportesController();
        }
        
        private String repitaCaracter(Character caracter, Integer veces) {
                String respuesta = "";
                for (int i = 0; i < veces; i++) {
                        respuesta += caracter;
                        }
                return respuesta;
        }

        public void proyectosFinanciadosPorBanco(String banco) {

                System.out.println(repitaCaracter('=', 36) + " LISTADO DE PROYECTOS POR BANCO "
                + repitaCaracter('=', 37));
                if (banco != null && !banco.isBlank()) {
                        System.out.println(String.format("%3s %-25s %-20s %-15s %7s %-30s",
                        "ID", "CONSTRUCTORA", "CIUDAD", "CLASIFICACION", "ESTRATO", "LIDER"));
                        System.out.println(repitaCaracter('-', 105));
                        try{
                                List<ProyectoBancoVo> proyecto = controlador.proyectos(banco);
                                for (ProyectoBancoVo proyec:proyecto){
                                        System.out.println(proyec);
                                }
                        } catch(Exception ex){
                                System.err.println("Error al conectarse con la base de datos" + ex);
                        }
                }
                        
        }
        public void totalAdeudadoPorProyectosSuperioresALimite(Double limiteInferior) {
                System.out.println(repitaCaracter('=', 1) + " TOTAL DEUDAS POR PROYECTO "
                + repitaCaracter('=', 1));
                if (limiteInferior != null) {
                        System.out.println(String.format("%3s %14s", "ID", "VALOR "));
                        System.out.println(repitaCaracter('-', 29));
                        try{
                                List<DeudasPorProyectoVo> deudas = controlador.deudas(limiteInferior);
                                for (DeudasPorProyectoVo deuda:deudas){
                                        System.out.println(deuda);
                                }
                        } catch(Exception ex){
                                System.err.println("Error al conectarse con la base de datos" + ex);
                        }
                }
        }
        public void lideresQueMasGastan() {
                System.out.println(repitaCaracter('=', 6) + " 10 LIDERES MAS COMPRADORES "
                + repitaCaracter('=', 7));
                System.out.println(String.format("%-25s %14s", "LIDER", "VALOR "));
                System.out.println(repitaCaracter('-', 41));
                try{
                        List<ComprasDeLiderVo> lideres = controlador.lideres();
                        for (ComprasDeLiderVo lider:lideres){
                                System.out.println(lider);
                        }
                } catch(Exception ex){
                        System.err.println("Error al conectarse con la base de datos" + ex);
                }
                }
       }
       

