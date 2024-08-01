package com.example.practica.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//estructuras
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity //para que puedas insertar este codigo necesitas añadirlo el maven (ingresar la conexion co BD desde pom.xml)
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int dni;
    private boolean gey;
}
