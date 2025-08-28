package com.sisterag.robguterdash.modelo;

import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1

import java.util.ArrayList;
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */

public class Bolsa {
    @JsonProperty("Índices")
    public ArrayList<Indice> índices;
    @JsonProperty("Españolas")
    public ArrayList<Española> españolas;
    public ArrayList<Volatil> volátiles;
    @JsonProperty("Ganadores")
    public ArrayList<Ganador> ganadores;
}

