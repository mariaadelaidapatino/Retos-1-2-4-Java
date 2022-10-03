package co.maria.adelaida.patino.ocampo;
import co.maria.adelaida.patino.ocampo.view.ReportesView;

public class App {    
    public static void main(String[] args) {

    System.out.println("Consulta 1");
    ReportesView reporte = new ReportesView();
    String banco ="Conavi";
    reporte.proyectosFinanciadosPorBanco(banco);

    var reportesView = new ReportesView(); 
    var limiteInferior = 50_000d;
    reportesView.totalAdeudadoPorProyectosSuperioresALimite(limiteInferior);

    var reportesView1 = new ReportesView(); 
    reportesView1. lideresQueMasGastan();

}
}