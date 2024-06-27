package com.example.libreria.repositorio;

import com.example.libreria.modelo.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepositorio extends JpaRepository<Libro, Long> {
    List<Libro> findByAutorId(Long autorId); //select * from libro where autor_id = 12;
}
