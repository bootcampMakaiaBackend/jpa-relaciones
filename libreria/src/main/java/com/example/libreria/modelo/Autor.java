package com.example.libreria.modelo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "autor")
public class Autor {
    @Id
    @Column(name = "autor_id")
    private Long  id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "nacionalidad")
    private String nacionalidad;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "direccion_id", referencedColumnName = "direccion_id")     //COLUMN
    private Direccion direccion;

    //
    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
    private List<Libro> libros = new ArrayList<>();

    public Autor(){

    }

    public Autor(Long id, String nombre, String nacionalidad) {

    }

    public Autor(Long id, String nombre, String nacionalidad, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
