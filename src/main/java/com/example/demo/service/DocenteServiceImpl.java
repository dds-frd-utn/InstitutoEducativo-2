package com.example.demo.service;

import com.example.demo.entity.Docente;
import com.example.demo.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DocenteServiceImpl implements DocenteService {
    @Autowired
    DocenteRepository docenteRepository;
    @Override
    public List<Docente> findAllDocente(){
        return docenteRepository.findAll();
    }
}
