package com.springboot.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.prueba.entity.temas;

public interface temaRepository extends JpaRepository<temas, Integer> {

    @Query("SELECT max(s.id) FROM temas s")
    public Integer findMaxId();
}
