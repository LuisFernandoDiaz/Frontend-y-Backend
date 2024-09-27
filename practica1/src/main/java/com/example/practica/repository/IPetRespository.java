package com.example.practica.repository;

import com.example.practica.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//esta jpaRepository sirve para manipular la abse de datos,, tanto como buscar, grabar, modificar  y eliminar
@Repository
public interface IPetRespository extends JpaRepository<Pet, Integer> {
}
