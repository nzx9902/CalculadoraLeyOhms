package com.relictasoftwares.calculadoraleydeohms;

public class LeyDeOhms {
    Integer amperios = null;
    Integer ohmios = null;
    Integer voltios = null;

    public void setAmperios(Integer amperios) {
        this.amperios = amperios;
    }

    public void setOhmios(Integer ohmios) {
        this.ohmios = ohmios;
    }

    public void setVoltios(Integer voltios) {
        this.voltios = voltios;
    }

    public Integer getResitencia(Integer  amperios, Integer voltios){
        this.ohmios = voltios/amperios;
        return ohmios;
    }
    public Integer getCorriente( Integer voltios, Integer ohmios){
        this.amperios = voltios/ohmios;
        return amperios;
    }
    public Integer getTension(Integer  amperios,  Integer ohmios){
        this.voltios = ohmios*amperios;
        return voltios;
    }

    public LeyDeOhms(Integer amperios, Integer ohmios, Integer voltios) {
        this.amperios = amperios;
        this.ohmios = ohmios;
        this.voltios = voltios;
    }
}
