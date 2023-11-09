package com.example.demo.controller;

import com.example.demo.dto.Pieza;
import com.example.demo.services.IPiezaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pieza")
public class PiezaController {
    @Autowired
    private IPiezaService piezaService;

    @GetMapping("/all")
    public List<Pieza> getPiezas() {
        return piezaService.listarPiezas();
    }

    @GetMapping("/{codigo}")
    public Pieza getPiezaPorCodigo(@PathVariable int codigo) {
        return piezaService.obtenerPiezaPorCodigo(codigo);
    }

    @PostMapping("/add")
    public Pieza crearPieza(@RequestBody Pieza pieza) {
        return piezaService.guardarPieza(pieza);
    }

    @PutMapping("/{codigo}")
    public Pieza actualizarPieza(@PathVariable int codigo, @RequestBody Pieza pieza) {
        return piezaService.actualizarPieza(codigo, pieza);
    }

    @DeleteMapping("/{codigo}")
    public void eliminarPieza(@PathVariable int codigo) {
        piezaService.eliminarPieza(codigo);
    }
}