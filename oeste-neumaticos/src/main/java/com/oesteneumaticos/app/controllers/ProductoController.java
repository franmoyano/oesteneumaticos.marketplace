package com.oesteneumaticos.app.controllers;

import com.oesteneumaticos.app.entities.Neumatico;
import com.oesteneumaticos.app.entities.Producto;
import com.oesteneumaticos.app.services.NeumaticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductoController {

    @Autowired
    NeumaticoService neumaticoService;

    @GetMapping("")
    public List<Neumatico> findAll(Optional<Integer> categoria) {
        if (categoria.isPresent()) {
            if (categoria.get() == 2100) {
                return neumaticoService.findAllAuto();
            } else if (categoria.get() == 2200) {
                return neumaticoService.findAllCamioneta();
            }
        } else {
            return neumaticoService.findAll();
        }
        return null;
    }

}
