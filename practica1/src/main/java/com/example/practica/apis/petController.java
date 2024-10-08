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

    @CrossOrigin("*")
    @GetMapping("/listado")
    public List<Pet> listado(){
        return _petServices.GetAllPets();
    }

    @CrossOrigin("*")
    @GetMapping("/buscar/{id}")
    public Pet buscar(@PathVariable int id){
        return _petServices.BuscarPets(id);
    }

    @CrossOrigin("*")
    @PostMapping("/guardar")
    public Pet GuardarPet(@RequestBody Pet entity){
        return _petServices.GuardarPet(entity);
    }

    @CrossOrigin("*")
    @PutMapping("/modificar/{id}")
    public Pet ModificarPet(@PathVariable int id,@RequestBody Pet entity){
        return _petServices.ModificarPet(id, entity );
    }

    @CrossOrigin("*")
    @DeleteMapping("/eliminar/{id}")
    public void eliminarPet(@PathVariable Integer id ){
         _petServices.EliminarPet(id);
    }
}
