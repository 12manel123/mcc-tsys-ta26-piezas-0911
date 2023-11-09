package com.example.demo.controller;

import com.example.demo.dto.Suministra;
import com.example.demo.services.ISuministraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suministra")
public class SuministraController {
    @Autowired
    private ISuministraService suministraService;

    @GetMapping("/all")
    public List<Suministra> getSuministros() {
        return suministraService.listarSuministros();
    }

    @GetMapping("/{id}")
    public Suministra getSuministroPorId(@PathVariable int id) {
        return suministraService.obtenerSuministroPorId(id);
    }

    @PostMapping("/add")
    public Suministra crearSuministro(@RequestBody Suministra suministra) {
        return suministraService.guardarSuministro(suministra);
    }

    @PutMapping("/{id}")
    public Suministra actualizarSuministro(@PathVariable int id, @RequestBody Suministra suministra) {
        return suministraService.actualizarSuministro(id, suministra);
    }

    @DeleteMapping("/{id}")
    public void eliminarSuministro(@PathVariable int id) {
        suministraService.eliminarSuministro(id);
    }
}