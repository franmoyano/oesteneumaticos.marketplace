package com.oesteneumaticos.app.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @ManyToMany(cascade = CascadeType.ALL)
//    private List<Producto> productos;
}
