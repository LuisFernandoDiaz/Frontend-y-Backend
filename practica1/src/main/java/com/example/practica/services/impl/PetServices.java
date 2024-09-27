package com.example.practica.services.impl;

import com.example.practica.model.Pet;
import com.example.practica.repository.IPetRespository;
import com.example.practica.services.IPetServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//logica de negocios
//es aqui donde pones tus condiciones para que estos sean utilizados en el controller
@Service
public class PetServices implements IPetServices {

    IPetRespository _perRepository;



    @Autowired
    public PetServices(IPetRespository perRepository){
        this._perRepository =perRepository;
    }



    @Override
    public List<Pet> GetAllPets() {
        return  _perRepository.findAll();
    }

    @Override
    public Pet GuardarPet(Pet entity) {
        Pet petGuardar = _perRepository.save(entity);
        return petGuardar;
    }

    @Override
    public Pet BuscarPets(int id) {
        return  _perRepository.findById(id).get();
    }

    @Override
    public Pet ModificarPet(int id, Pet entity) {
        //Pet buscar = _perRepository.findById(id).get();
        return  _perRepository.save(entity);
    }


    @Override
    public void EliminarPet(Integer id) {
        _perRepository.deleteById(id);
    }

}
