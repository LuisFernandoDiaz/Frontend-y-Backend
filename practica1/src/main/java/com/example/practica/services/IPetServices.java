package com.example.practica.services;

import com.example.practica.model.Pet;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IPetServices {

    List<Pet> GetAllPets();
    Pet GuardarPet(Pet entity);
    Pet BuscarPets(int id);
    Pet ModificarPet(int id, Pet entity) ;
    public void EliminarPet( Integer id);
}
