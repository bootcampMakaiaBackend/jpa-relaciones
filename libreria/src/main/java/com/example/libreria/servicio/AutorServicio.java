package com.example.libreria.servicio;

import com.example.libreria.modelo.Autor;
import com.example.libreria.repositorio.AutorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AutorServicio {

    private AutorRepositorio autorRepositorio;

    @Autowired
    public AutorServicio(AutorRepositorio autorRepositorio) {
        this.autorRepositorio = autorRepositorio;
    }

    public void crearAutor(Autor autor){
        this.autorRepositorio.save(autor);
    }

    public Autor obtenerAutorPorId(Long id){
        Optional<Autor>  autorOptional = this.autorRepositorio.findById(id);
        if(autorOptional.isPresent()){
            return autorOptional.get();
        }
        return new Autor();
    }

    public void crearAutores(List<Autor> autor){
        this.autorRepositorio.saveAll(autor);
    }

    public List<Autor> crearAutores(){
        return this.autorRepositorio.findAll();
    }
}
