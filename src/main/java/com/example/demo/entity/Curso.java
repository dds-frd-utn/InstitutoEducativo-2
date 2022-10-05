package com.example.demo.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="cursos")
@SecondaryTables({
        @SecondaryTable(name="cursos_empresariales",
                pkJoinColumns=@PrimaryKeyJoinColumn(name="id_curso")),
        @SecondaryTable(name="cursos_personales",
                pkJoinColumns=@PrimaryKeyJoinColumn(name="id_curso"))
})
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_tema")
    Tema tema;
    @Column(name="fecha_inicio")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    LocalDate fechaInicio;
    @Column(name="fecha_fin")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    LocalDate fechaFin;
    @OneToOne
    @JoinColumn(name = "id_docente")
    Docente docente;
    @Column(name="nombre")
    String nombre;
    @ManyToOne
    @JoinColumn(name="id_empresa",table = "cursos_empresariales")
    Empresa empresa;
    @Column(name="precio_total",table = "cursos_empresariales")
    Float precioTotal;
    @Column(name="cantidad_alumnos",table = "cursos_empresariales")
    Float cantidadAlumnos;
    @Column(name="precio_por_alumno",table = "cursos_personales")
    Float precioPorAlumno;
    @ManyToOne
    @JoinColumn(name="id_aula",table = "cursos_personales")
    Aula aula;

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Float getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(Float cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public Float getPrecioPorAlumno() {
        return precioPorAlumno;
    }

    public void setPrecioPorAlumno(Float precioPorAlumno) {
        this.precioPorAlumno = precioPorAlumno;
    }



    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Curso() { super(); }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }


    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
