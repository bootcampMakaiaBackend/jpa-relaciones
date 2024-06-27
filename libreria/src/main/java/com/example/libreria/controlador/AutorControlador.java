package com.example.libreria.controlador;

import com.example.libreria.modelo.Autor;
import com.example.libreria.servicio.AutorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/autores")
public class AutorControlador {

    private AutorServicio autorServicio;

    @Autowired
    public AutorControlador(AutorServicio autorServicio) {
        this.autorServicio = autorServicio;
    }

    @PostMapping()
    public ResponseEntity<String> crearAutor(@RequestBody Autor autor){
        this.autorServicio.crearAutor(autor);
        return ResponseEntity.ok("Se creo el autor correctamente");
    }

    @GetMapping("/{id_autor}")
    public Autor obtenerAutorPorId(@PathVariable("id_autor") Long id){
        return this.autorServicio.obtenerAutorPorId(id);

    }
}
