package com.sisterag.robguterdash.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Española{
    @JsonProperty("Imagen")
    public String imagen;
    @JsonProperty("EMP")
    public String eMP;
    @JsonProperty("Nombre")
    public String nombre;
    @JsonProperty("Precio")
    public String precio;
    @JsonProperty("Varia")
    public String varia;

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String geteMP() {
        return eMP;
    }

    public void seteMP(String eMP) {
        this.eMP = eMP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getVaria() {
        return varia;
    }

    public void setVaria(String varia) {
        this.varia = varia;
    }
}
