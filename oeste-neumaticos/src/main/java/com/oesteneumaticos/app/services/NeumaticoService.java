package com.oesteneumaticos.app.services;

import com.oesteneumaticos.app.entities.Neumatico;
import com.oesteneumaticos.app.repositories.NeumaticoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NeumaticoService {
    @Autowired
    NeumaticoRepository neumaticoRepository;
}
