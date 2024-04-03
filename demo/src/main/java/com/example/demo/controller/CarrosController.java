package com.example.demo.controller;

import com.example.demo.model.Carros;
import com.example.demo.service.CarrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarrosController {

    @Autowired
    private CarrosService carrosService;

    // List all vehicles
    @GetMapping
    public ResponseEntity<List<Carros>> listar() {
        List<Carros> lista = carrosService.listar();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    // Create a new vehicle
    @PostMapping
    public ResponseEntity<Carros> criar(@RequestBody Carros carros) {
        Carros novoVeiculo = carrosService.criar(carros);
        return new ResponseEntity<>(novoVeiculo, HttpStatus.CREATED);
    }

    // Update an existing vehicle
    @PutMapping("/{id}")
    public ResponseEntity<Carros> atualizar(@RequestBody Carros carros, @PathVariable Long id) {
        Carros veiculoAtualizado = carrosService.atualizar(carros, id);
        if(veiculoAtualizado == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(veiculoAtualizado, HttpStatus.OK);
    }

    // Delete a vehicle
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        boolean deleted = carrosService.deletar(id);
        if(deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/ordenar-por-preco")
    public ResponseEntity<List<Carros>> listarOrdenadoPorPreco() {
        List<Carros> listaOrdenada = carrosService.listarOrdenadoPorPreco();
        return new ResponseEntity<>(listaOrdenada, HttpStatus.OK);
    }
}


