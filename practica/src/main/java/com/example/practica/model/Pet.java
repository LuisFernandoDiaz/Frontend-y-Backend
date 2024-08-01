package com.example.practica.model;


import jakarta.persistence.*;
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
    private String lengPro1;
    private String lengPro2;
    private String lengPro3;
    //@Column(nullable = true)  ==> en caso quieras agregar una columna mas a la base datos, esta linea te ayudara a inplementarlo (validara valores nulos =null)
    private String baseDato;
}
