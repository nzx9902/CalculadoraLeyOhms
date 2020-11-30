package com.relictasoftwares.calculadoraleydeohms;

public class LeyDeOhms {



    public void getResitencia(Integer  amperios, Integer voltios){
        Integer Ohmios = voltios/amperios;

    }
    public void getCorriente( Integer voltios, Integer ohmios){
        Integer amperios = voltios/ohmios;

    }
    public void getTension(Integer  amperios,  Integer ohmios){
        Integer voltios = ohmios*amperios;

    }


}
