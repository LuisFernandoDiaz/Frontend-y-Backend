package com.example.practica.apis;


import com.example.practica.model.Pet;
import com.example.practica.services.IPetServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class petController {

    IPetServices _petServices;

    @Autowired
    public petController(IPetServices petServices){
        this._petServices=petServices;
    }

    @GetMapping("/listado")
    public List<Pet> getAll(){
        return _petServices.GetAllPets();
    }

    @GetMapping("/buscar/{id}")
    public Pet getAll(@PathVariable int id){
        return _petServices.BuscarPets(id);
    }

    @CrossOrigin("*")
    @PostMapping("/guardar")
    public Pet GuardarPet(@RequestBody Pet entity){
        return _petServices.GuardarPet(entity);
    }

    @PutMapping("/modificar/{id}")
    public Pet ModificarPet(@PathVariable int id, @RequestBody Pet entity){
        return _petServices.ModificarPet(entity);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarPet(@PathVariable Integer id ){
         _petServices.EliminarPet(id);
    }
}
