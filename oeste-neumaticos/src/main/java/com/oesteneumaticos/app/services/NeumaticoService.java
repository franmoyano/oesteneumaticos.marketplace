package com.oesteneumaticos.app.services;

import com.oesteneumaticos.app.entities.Neumatico;
import com.oesteneumaticos.app.entities.Producto;
import com.oesteneumaticos.app.repositories.NeumaticoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class NeumaticoService {

    @Autowired
    NeumaticoRepository neumaticoRepository;

    public void cargarNeumatico(Neumatico n) {
        neumaticoRepository.save(n);
    }

    public List<Neumatico> findAllAuto() {
        return neumaticoRepository.findAllAuto();
    }

    public List<Neumatico> findAllCamioneta() {
        return neumaticoRepository.findAllCamioneta();
    }

    public List<Neumatico> findAll() {
        return neumaticoRepository.findAll();
    }
}
