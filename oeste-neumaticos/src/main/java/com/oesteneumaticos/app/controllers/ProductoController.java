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

    @GetMapping("/crear/camioneta")
    public void cargarNeumaticoCamioneta(HttpServletResponse response, Optional<Integer> ancho, Optional<Integer> perfil, Optional<Integer> rodado) throws IOException {
        if (ancho.isPresent() && perfil.isPresent() && rodado.isPresent()) {
            Neumatico n = new Neumatico();
            n.setCategoria(2200);
            n.setAncho(ancho.get());
            n.setPerfil(perfil.get());
            n.setRodado(rodado.get());
            neumaticoService.cargarNeumatico(n);
        }
        response.sendRedirect("/products");
    }

    @GetMapping("/crear/auto")
    public void cargarNeumaticoAuto(
            HttpServletResponse response, Optional<Integer> ancho,
            Optional<Integer> perfil, Optional<Integer> rodado,
            Optional<String> marca) throws IOException {
        if (ancho.isPresent() && perfil.isPresent() && rodado.isPresent() && marca.isPresent()) {
            Neumatico n = new Neumatico();
            n.setCategoria(2100);
            n.setAncho(ancho.get());
            n.setPerfil(perfil.get());
            n.setRodado(rodado.get());
            n.setMarca(marca.get());
            neumaticoService.cargarNeumatico(n);
        }
        response.sendRedirect("/products");
    }


}
