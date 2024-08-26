package com.example.reniec.servicios.impl;


import com.example.reniec.modelo.Registro;
import com.example.reniec.repository.IRegistroRepository;
import com.example.reniec.servicios.IRegistroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroServices implements IRegistroServices {

    IRegistroRepository _registroRepository;

    @Autowired
    public RegistroServices (IRegistroRepository registroRepository){
        this._registroRepository = registroRepository;
    }

    @Override
    public List<Registro> GetAllRegistro() {
        return _registroRepository.findAll();
    }

    @Override
    public Registro GuardarRegistro(Registro entity) {
        Registro registroGuardar =_registroRepository.save(entity);
        return registroGuardar;
    }

    @Override
    public Registro BuscarRegistro(int id) {
        return _registroRepository.findById(id).get();
    }

    @Override
    public Registro ModificarRegistro(Registro entity) {
        Registro registroModificar =_registroRepository.save(entity);
        return registroModificar;
    }

    @Override
    public void EliminarRegistro(Integer id) {
        _registroRepository.deleteById(id);
    }
}
