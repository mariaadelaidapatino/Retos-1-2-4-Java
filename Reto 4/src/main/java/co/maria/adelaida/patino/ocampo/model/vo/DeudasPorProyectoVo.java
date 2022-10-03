package co.maria.adelaida.patino.ocampo.model.vo;

public class DeudasPorProyectoVo {
    private Integer Id;
    private Double valor;
    
    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        Id = id;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return String.format("%3d %,15.1f", Id, valor);
    }
    
        
}
