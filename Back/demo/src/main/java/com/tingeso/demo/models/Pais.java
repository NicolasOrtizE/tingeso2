package com.tingeso.demo.models;

public class Pais {
    private int ID_DB;
    private String pais;
    private String capital;
    private int poblacion;

    public Pais(String pais, String capital, int poblacion) {
        this.pais = pais;
        this.capital = capital;
        this.poblacion = poblacion;
    }

    public Integer getId() {
        return ID_DB;
    }

    public void setId(Integer ID_DB) {
        this.ID_DB = ID_DB;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Integer getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Integer poblacion) {
        this.poblacion = poblacion;
    }
}
