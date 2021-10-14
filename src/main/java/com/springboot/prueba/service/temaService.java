package com.springboot.prueba.service;

import com.springboot.prueba.repository.temaRepository;
import com.springboot.prueba.entity.temas;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class temaService {
    @Autowired
    private temaRepository temaRepository;

    public List<temas> readTemas() {
        return temaRepository.findAll();

    }
}
