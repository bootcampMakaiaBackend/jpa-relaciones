package com.example.libreria.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "direccion")
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //genera un valor automaticamente (autoincrementa y que sea unico)
    @Column(name = "direccion_id")
    private Long id;
    @Column(name = "calle")
    private String calle;
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "condigo_postal")
    private String codigoPostal;

    public Direccion(){
        //JPA lo requiere
    }

    public Direccion(Long id, String calle, String ciudad, String codigoPostal) {
        this.id = id;
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public Long getId() {
        return id;
    }

    public String getCalle() {
        return calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }
}
