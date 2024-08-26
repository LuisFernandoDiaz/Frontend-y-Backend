package com.example.reniec.apis;


import com.example.reniec.modelo.Registro;
import com.example.reniec.servicios.IRegistroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class registroController {

    IRegistroServices _registroServices;

    @Autowired
    public registroController(IRegistroServices registroServices){
        this._registroServices = registroServices;
    }

    @GetMapping("/lista")
    public List<Registro> listaRegistro(){
        return _registroServices.GetAllRegistro();
    }

    @PostMapping("/guardar")
    public Registro guardarRegistro(@RequestBody Registro entity){
        return _registroServices.GuardarRegistro(entity);
    }

    @GetMapping("/lista/{id}")
    public Registro buscarRegistro(@PathVariable int id){
        return _registroServices.BuscarRegistro(id);
    }

    @PutMapping("/modificar/{id}")
    public Registro modificarRegistro(@PathVariable int id, @RequestBody Registro entity){
        return _registroServices.ModificarRegistro(entity);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarRegistro(@PathVariable Integer id){
        _registroServices.EliminarRegistro(id);
    }

}
