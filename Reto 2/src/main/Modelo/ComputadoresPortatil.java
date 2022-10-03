import com.mariaadelaida.patino.Computadores;

public class ComputadoresPortatil extends Computadores{
    private final static Integer PULGADAS_BASE = 20;
    private Integer pulgadas;
    private Boolean camaraITG;

    public ComputadoresPortatil() {
    }

    public ComputadoresPortatil(Double precioBase, Integer peso) {
        super(precioBase, peso);
    }

    public ComputadoresPortatil(Double precioBase, Integer peso, char consumoW, Integer pulgadas, Boolean camaraITG) {
        super(precioBase, peso, consumoW);
        this.pulgadas = pulgadas;
        this.camaraITG = camaraITG;
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public Boolean getCamaraITG() {
        return camaraITG;
    }

    public Double calcularPrecio(){
        Double adicion = 0.0;
        if (getPulgadas() > 40){
            adicion+= getPrecioBase() * (30/100);
        }
        if (getCamaraITG() == true){
            adicion += 50;
        }
    }
    
}
