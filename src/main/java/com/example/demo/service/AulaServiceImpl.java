package com.example.demo.service;

import com.example.demo.entity.Aula;
import com.example.demo.repository.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AulaServiceImpl implements AulaService {
    @Autowired
    AulaRepository aulaRepository;
    @Override
    public List<Aula> findAllAula(){
        return aulaRepository.findAll();
    }
}
