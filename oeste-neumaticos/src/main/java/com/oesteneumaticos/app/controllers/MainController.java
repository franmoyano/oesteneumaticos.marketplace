package com.oesteneumaticos.app.controllers;

import com.oesteneumaticos.app.entities.Producto;
import com.oesteneumaticos.app.services.NeumaticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    NeumaticoService neumaticoService;

    @GetMapping("")
    public void nada() {
    }
}
