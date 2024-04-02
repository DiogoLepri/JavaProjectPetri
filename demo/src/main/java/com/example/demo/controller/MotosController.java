package com.example.demo.controller;

import com.example.demo.model.Veiculos;
import com.example.demo.service.MotosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/motos")
public class MotosController {

    @Autowired
    private MotosService motosService;

    // List all motorcycles
    @GetMapping
    public ResponseEntity<List<Veiculos>> listar() {
        List<Veiculos> lista = motosService.listar();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    // Create a new motorcycle
    @PostMapping
    public ResponseEntity<Veiculos> criar(@RequestBody Veiculos veiculos) {
        Veiculos novaMoto = motosService.criar(veiculos);
        return new ResponseEntity<>(novaMoto, HttpStatus.CREATED);
    }

    // Update an existing motorcycle
    @PutMapping("/{id}")
    public ResponseEntity<Veiculos> atualizar(@RequestBody Veiculos veiculos, @PathVariable Long id) {
        Veiculos motoAtualizada = motosService.atualizar(veiculos, id);
        if(motoAtualizada == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(motoAtualizada, HttpStatus.OK);
    }

    // Delete a motorcycle
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        boolean deleted = motosService.deletar(id);
        if(deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
