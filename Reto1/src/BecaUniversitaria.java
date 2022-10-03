public class BecaUniversitaria {
    int tiempo;
    double interes;
    double monto;

    BecaUniversitaria() {
        this.tiempo = 0;
        this.interes = 0;
        this.monto = 0;
    }

    BecaUniversitaria(int pTiempo, double pMonto, double pInteres){
        this.tiempo = pTiempo;
        this.monto = pMonto;
        this.interes = pInteres;
    }

    public double calcularInteresSimple(){
        double interesSimple = Math.round(this.monto * (this.interes / 100) * this.tiempo);
        return interesSimple;
    }
    
    public double calcularInteresCompuesto(){
        double interesCompuesto = Math.round(this.monto * (Math.pow(( 1 + this.interes /100), this.tiempo) - 1));
        return interesCompuesto;
    }
    
    public String compararInversion (int pTiempo, double pMonto, double pInteres){
        this.tiempo = pTiempo;
        this.monto = pMonto;
        this.interes = pInteres;
        double diferencia = this.calcularInteresCompuesto() - this.calcularInteresSimple();
        if (diferencia != 0) {
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $"+ diferencia;
        } else {
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
    }
    
    public String compararInversion (){
        double diferencia = this.calcularInteresCompuesto() - this.calcularInteresSimple();
        if (diferencia != 0) {
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $"+ diferencia;
        } else {
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
    }
}    
public class BecaUniversitaria {
    // Parametros
    int pTiempo;
    double pMonto;
    double pInteres;
    
    // Constructores
    public BecaUniversitaria(int pTiempo, double pMonto, double pInteres) {
        this.pTiempo = pTiempo;
        this.pMonto = pMonto;
        this.pInteres = pInteres;
    }
    public BecaUniversitaria() {
        this.pTiempo = 0;
        this.pMonto = 0;
        this.pInteres = 0;
    }
    // Métodos
       
    public double calcularInteresSimple(){
        pMonto = this.pMonto;
        pInteres = this.pInteres;
        pTiempo = this.pTiempo;
        double interesSimple = Math.round(pMonto * (pInteres / 100) * pTiempo);
        return interesSimple;
    }    
    
    public double calcularInteresCompuesto( ){
        pMonto = this.pMonto;
        pInteres = this.pInteres;
        pTiempo = this.pTiempo;
        double interesCompuesto = Math.round(pMonto * (Math.pow((1 + pInteres /100), pTiempo) - 1));
        return interesCompuesto;
    }
    
    public String compararInversion (int pTiempo, double pMonto, double pInteres){
        this.pMonto = pMonto;
        this.pTiempo = pTiempo;
        this.pInteres = pInteres;
        var diferencia = calcularInteresCompuesto() - calcularInteresSimple();
        if (diferencia != 0) {
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $"+ diferencia;
        } else {
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
            }
    }
    public String compararInversion (){
        var diferencia = calcularInteresCompuesto() - calcularInteresSimple();
        if (diferencia != 0) {
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $"+ diferencia;
        } else {
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
    }
        
public static void main(String[] args) {
    /*Prueba*/
    BecaUniversitaria becaUniversitaria = new BecaUniversitaria();
    System.out.println(becaUniversitaria.calcularInteresSimple());
    System.out.println(becaUniversitaria.calcularInteresCompuesto());
    System.out.println(becaUniversitaria.compararInversion());    
    }
}
 

