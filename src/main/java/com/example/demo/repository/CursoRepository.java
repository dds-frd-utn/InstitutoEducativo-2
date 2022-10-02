package com.example.demo.repository;
import com.example.demo.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CursoRepository extends JpaRepository<Curso,Long> {
    void save(Optional<Curso> cursoToUpate);
}
