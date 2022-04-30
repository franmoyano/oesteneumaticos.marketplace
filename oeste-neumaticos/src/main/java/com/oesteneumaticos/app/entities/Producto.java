package com.oesteneumaticos.app.entities;

import javax.persistence.*;

@MappedSuperclass
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
