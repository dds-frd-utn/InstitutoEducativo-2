package com.example.demo.controller;

import com.example.demo.entity.Curso;
import com.example.demo.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CursoController {
    @Autowired
    CursoService cursoService;
    @RequestMapping(value = "/cursos", method = RequestMethod.GET, produces = "application/json")
    public List<Curso> getCursos() {
        return cursoService.findAllCurso();
    }

    @RequestMapping(value = "/cursos", method = RequestMethod.POST, produces = "application/json")
    public Curso addCurso(@RequestBody Curso curso) {
        return cursoService.saveCurso(curso);
    }
}

