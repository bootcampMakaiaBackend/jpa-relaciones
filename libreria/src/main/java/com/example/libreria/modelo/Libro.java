package com.example.libreria.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "libro")
public class Libro {

    @Id
    @Column(name = "libro_id")
    private Long id;
    @Column(name = "titulo")
    private String titulo;
    @ManyToOne
    @JoinColumn(name = "autor_id") // crear la columna a que autor pertenece
    private Autor autor;

    public Libro(Long id, String titulo, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libro(){

    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }
}
