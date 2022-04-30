package com.oesteneumaticos.app.repositories;

import com.oesteneumaticos.app.entities.Neumatico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeumaticoRepository extends JpaRepository<Neumatico, Long> {

}
