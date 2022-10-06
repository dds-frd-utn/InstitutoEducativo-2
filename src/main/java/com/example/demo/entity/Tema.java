package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "temas")

public class Tema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    Long id;
    @Column(name="nombre")
    String nombre;
    @Column(name="duracion")
    Long duracion;
    public Tema() { super(); }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Long getDuracion() {
        return duracion;
    }
    public void setDuracion(Long duracion) {
        this.duracion = duracion;
    }
}
