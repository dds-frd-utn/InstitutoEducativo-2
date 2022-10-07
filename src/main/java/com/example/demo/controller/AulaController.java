package com.example.demo.controller;

import com.example.demo.entity.Aula;
import com.example.demo.service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AulaController {
    @Autowired
    AulaService aulaService;
    @RequestMapping(value = "/aulas", method = RequestMethod.GET, produces = "application/json")
    public List<Aula> getAulas() {
        return aulaService.findAllAula();
    }
}