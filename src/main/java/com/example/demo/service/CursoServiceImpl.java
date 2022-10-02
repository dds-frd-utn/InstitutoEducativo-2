package com.example.demo.service;

import com.example.demo.repository.CursoRepository;
import com.example.demo.entity.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {
    @Autowired
    CursoRepository cursoRepository;
    @Override
    public List<Curso> findAllCurso(){
        return cursoRepository.findAll();
    }
}
