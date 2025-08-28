package com.sisterag.robguterdash.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root{
    @JsonProperty("Bolsa")
    public Bolsa bolsa;

    public Bolsa getBolsa() {
        return bolsa;
    }

    public void setBolsa(Bolsa bolsa) {
        this.bolsa = bolsa;
    }
}
