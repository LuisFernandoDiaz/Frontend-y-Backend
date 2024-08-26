package com.example.reniec.servicios;

import com.example.reniec.modelo.Registro;

import java.util.List;

public interface IRegistroServices {
    List<Registro> GetAllRegistro();
    Registro GuardarRegistro(Registro entity);
    Registro BuscarRegistro(int id);
    Registro ModificarRegistro(Registro entity);
    public void EliminarRegistro(Integer id);
}
