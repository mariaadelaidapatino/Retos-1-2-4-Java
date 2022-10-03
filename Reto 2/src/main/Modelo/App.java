package com.mariaadelaida.patino;

public class Computadores {
    // Variables base
    // Variables
    // Constructores public Computadores(){
    // Constructor
    public Computadores() {
    }
    public Computadores(Double precioBase, Integer peso) {
    }
    public Computadores(Double precioBase, Integer peso, char consumoW) {
    this.precioBase = precioBase;
    this.peso = peso;
    comprobarconsumoW(consumoW);
    }
    // Metodos
    public void comprobarconsumoW(char consumoW) {
    // Métodos código
    }
    public Double calcularPrecio() {
    Double adicion = 0.0;
    // Código
    }
    // Getter
    public class ComputadoresMesa extends Computadores {
    private final static Integer ALMACENAMIENTO_BASE = 50;
    // Variable
    // Constructor
    public ComputadoresMesa() {
    }
    // Constructor
    public ComputadoresMesa(Double precioBase, Integer peso) {
    }
    // Constructor
    public ComputadoresMesa(Double precioBase, Integer peso, char consumoW, Integer
    almacenamiento) {
    }
    // Métodos
    public Double calcularPrecio() {
        // Código return adicion;
    }
    public Integer getCarga() {
    return almacenamiento;
    }
    }
    public class ComputadoresPortatiles extends Computadores {
    private final static Integer PULGADAS_BASE = 20;
    private Integer pulgadas;
    private boolean camaraITG;
    // Constructor
    public ComputadoresPortatiles() {
    }
    // Constructor
    public ComputadoresPortatiles(Double precioBase, Integer peso) {
    }
    // Constructor
    public ComputadoresPortatiles(Double precioBase, Integer peso, char consumoW, 
    Integer pulgadas,
    boolean camaraITG) {
    }
    // Métodos
    public Double calcularPrecio() {
    // Método Código return adicion;
    }
    }
    public class PrecioTotal {
    private Double totalComputadores = 0.0;
    private Double totalComputadoresPortatiles = 0.0;
    private Double totalComputadoresMesa = 0.0;
    private Computadores[] listaComputadores;
    // Constructor
    PrecioTotal(Computadores[] pComputadores) {
    this.listaComputadores = pComputadores;
    }
    public void mostrarTotales() {
    // Código
    // Mostramos los resultados
    System.out.println("La suma del precio de los computadores es de " +
    totalComputadores);
    System.out.println("La suma del precio de los computadores de mesa es de " + totalComputador);
    System.out.print("La suma del precio de los computadores portatiles es de " + totalComputadoresPortatiles);
    }
    }
    }
    public class Main {
        public static void main(String[] args) {
        // Pruebas Públicas
        Computadores computadores[] = new Computadores[6];
        computadores[0] = new Computadores(150.0, 70, 'A');
        computadores[1] = new ComputadoresMesa(70.0, 40);
        computadores[2] = new ComputadoresPortatiles(600.0, 70, 'D', 50, false);
        computadores[3] = new Computadores();
        computadores[4] = new Computadores(500.0, 60, 'A');
        computadores[5] = new Computadores(700.0, 50, 'D');
        PrecioTotal solucion1 = new PrecioTotal(computadores);
        solucion1.mostrarTotales();
        System.out.println();
        Computadores computadores[] = new Computadores[4];
        computadores[0] = new Computadores(60.0, 10, 'D');
        computadores[1] = new ComputadoresMesa(300.0, 40, 'Z', 40);
        computadores[2] = new ComputadoresPortatiles(50.0, 10, 'A', 70, false);
        computadores[3] = new Computadores(50.0, 10);
        PrecioTotal solucion1 = new PrecioTotal(computadores);
        solucion1.mostrarTotales();
        System.out.println();
        }
        }    

