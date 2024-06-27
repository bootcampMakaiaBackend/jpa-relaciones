package com.example.libreria.servicio;

import com.example.libreria.modelo.Libro;
import com.example.libreria.repositorio.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServicio {

    private LibroRepositorio libroRepositorio;

    @Autowired
    public LibroServicio(LibroRepositorio libroRepositorio) {
        this.libroRepositorio = libroRepositorio;
    }

    public void crearLibro(Libro libro) {
        this.libroRepositorio.save(libro);
    }

    public List<Libro> obtenerLibrosPorAutor(Long autorId) {
        return this.libroRepositorio.findByAutorId(autorId);
    }
}
