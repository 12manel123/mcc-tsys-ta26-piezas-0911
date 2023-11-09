package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Suministra;

public interface ISuministraService {
    List<Suministra> listarSuministros();

    Suministra obtenerSuministroPorId(int id);

    Suministra guardarSuministro(Suministra suministra);

    Suministra actualizarSuministro(int id, Suministra suministra);

    void eliminarSuministro(int id);
}