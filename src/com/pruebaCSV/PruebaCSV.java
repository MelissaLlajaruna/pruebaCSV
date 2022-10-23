package com.pruebaCSV;

public class PruebaCSV {

    public static void main (String[] args){
            LectorCSV milector= new LectorCSV();
            milector.leeCSV("./Datos/pokemon.csv");
    }
}
