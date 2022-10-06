package com.example.demo.controller;
import com.example.demo.entity.Docente;
import com.example.demo.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DocenteController {
    @Autowired
    DocenteService docenteService;

    @RequestMapping(value = "/docentes", method = RequestMethod.GET, produces = "application/json")
    public List<Docente> getDocentes() {
        return docenteService.findAllDocente();
    }
}