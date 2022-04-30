package com.oesteneumaticos.app.repositories;

import com.oesteneumaticos.app.entities.Neumatico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NeumaticoRepository extends JpaRepository<Neumatico, Long> {

    @Query("SELECT a FROM Neumatico a WHERE a.categoria = 2100")
    List<Neumatico> findAllAuto();

    @Query("SELECT a FROM Neumatico a WHERE a.categoria = 2200")
    List<Neumatico> findAllCamioneta();
}
