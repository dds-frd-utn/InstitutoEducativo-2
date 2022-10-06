package com.example.demo.controller;

import com.example.demo.entity.Tema;
import com.example.demo.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TemaController {
    @Autowired
    TemaService temaService;
    @RequestMapping(value = "/temas", method = RequestMethod.GET, produces = "application/json")
    public List<Tema> getTemas() {
        return temaService.findAllTema();
    }
}