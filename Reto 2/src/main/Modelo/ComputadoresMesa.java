import com.mariaadelaida.patino.Computadores;

public class ComputadoresMesa extends Computadores {
    private Integer ALMACENAMIENTO_BASE=50;
    private Integer almacenamiento;

    

    public ComputadoresMesa() {
    }


    public ComputadoresMesa(Double precioBase, Integer peso) {
        super(precioBase, peso);
    }


    public ComputadoresMesa(Double precioBase, Integer peso, char consumoW, Integer almacenamiento) {
        super(precioBase, peso, consumoW);
        this.almacenamiento = almacenamiento;
    }

    
    public Integer getAlmacenamiento() {
        return almacenamiento;
    }


    public Double calcularPrecio(){
        Double adicion=0.0;
        if(getAlmacenamiento()> 100){
            adicion += 50;
        }
        return adicion;

    }
    
}
