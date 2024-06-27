package com.example.libreria.controlador;

import com.example.libreria.modelo.Libro;
import com.example.libreria.servicio.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/libros")
public class LibroControlador {

    private LibroServicio libroServicio;

    @Autowired
    public LibroControlador(LibroServicio libroServicio) {
        this.libroServicio = libroServicio;
    }

    @PostMapping
    public ResponseEntity<String> crearLibro(@RequestBody Libro libro){
        this.libroServicio.crearLibro(libro);
        return ResponseEntity.ok("Se creo el libro correctamente");
    }
}
