package com.springboot.prueba.controller;

import com.springboot.prueba.entity.temas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.prueba.service.temaService;
import java.util.List;

@RestController

public class temaController {
    @Autowired
    temaService temaService;

    @RequestMapping(value = "readtemas", method = RequestMethod.GET)
    public List<temas> readTemas() {
        return temaService.readTemas();
    }

}
