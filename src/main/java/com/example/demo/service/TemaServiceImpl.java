package com.example.demo.service;

import com.example.demo.entity.Tema;
import com.example.demo.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TemaServiceImpl implements TemaService{
    @Autowired
    TemaRepository temaRepository;

    @Override
    public List<Tema> findAllTema(){
        return temaRepository.findAll();
    }
}
