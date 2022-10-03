package com.mariaadelaida.patino;

public class Computadores {
    private Integer PESO_BASE;
    private Character CONSUMO_W_BASE;
    private Double PRECIO_BASE;
    private Double precioBase;
    private Integer peso;
    private Character consumoW;
    
    public Computadores() {
    }

    public Computadores(Double precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Computadores(Double precioBase, Integer peso, Character consumoW) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = consumoW;
    }

    public void calcularConsumoW(){
        //TODO: Falta implementar método 
    }

    public Double calcularPrecio(){
        getconsumoW();
        Double adicion = 0.0;
        switch(getConsumoW()){
            case 'A':
            adicion += 100;
            break;
            case 'B':
            adicion += 80;
            break;
            case 'C':
            adicion += 60;
            break;
            case 'D':
            adicion += 50;
            break;
            case 'E':
            adicion += 30;
            break;
            case 'F':
            adicion += 10;
            break;
        }
        if (getPeso() >= 0 & getPeso() < 19){
            adicion += 10;
        } 
        else if (getPeso() >= 20 & getPeso() < 49){
            adicion += 50;
        } 
        else if (getPeso() >= 50 & getPeso() < 79){
            adicion += 80;
        }
        else if (getPeso() >= 80 ){
            adicion += 100;
        }  
        
        var precioTotal = getPrecioBase() + adicion;
        return precioTotal;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public Integer getPeso() {
        return peso;
    }

    public Character getConsumoW() {
        return consumoW;
    }
    
}
