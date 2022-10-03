package co.maria.adelaida.patino.ocampo.model.vo;

public class ComprasDeLiderVo {
    String lider;   
    Double valor;
    

    public String getLider() {
        return lider;
    }
    public void setLider(String lider) {
        this.lider = lider;
    }

    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }   
    
    @Override
    public String toString() {
        return String.format("%-25s %,15.1f", lider, valor);
    }
         

}
