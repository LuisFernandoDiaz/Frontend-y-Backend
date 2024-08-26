package com.example.reniec.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String nombres;
    public String apellidos;
    public int dni;
    public String posicion;
    public String sexo;
    public boolean donante;

}
