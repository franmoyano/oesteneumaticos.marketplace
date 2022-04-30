package com.oesteneumaticos.app.entities;

import javax.persistence.Entity;

@Entity
public class Neumatico extends Producto {
    private Integer ancho;
    private Integer perfil;
    private Integer rodado;

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getPerfil() {
        return perfil;
    }

    public void setPerfil(Integer perfil) {
        this.perfil = perfil;
    }

    public Integer getRodado() {
        return rodado;
    }

    public void setRodado(Integer rodado) {
        this.rodado = rodado;
    }
}
