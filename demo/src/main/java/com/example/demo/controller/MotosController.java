package com.example.demo.controller;

import com.example.demo.model.Carros;
import com.example.demo.model.Motos;
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


    @GetMapping
    public ResponseEntity<List<Motos>> listar() {
        List<Motos> lista = motosService.listar();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Motos> criar(@RequestBody Motos motos) {
        Motos novoVeiculo = motosService.criar(motos);
        return new ResponseEntity<>(novoVeiculo, HttpStatus.CREATED);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Motos> atualizar(@RequestBody Motos motos, @PathVariable Long id) {
        Motos veiculoAtualizado = motosService.atualizar(motos, id); // Ensure this method returns Carros
        if(veiculoAtualizado == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(veiculoAtualizado, HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        boolean deleted = motosService.deletar(id);
        if(deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/ordenar-por-preco")
    public ResponseEntity<List<Motos>> listarOrdenadoPorPreco() {
        List<Motos> listaOrdenada = motosService.listarOrdenadoPorPreco();
        return new ResponseEntity<>(listaOrdenada, HttpStatus.OK);
    }
}
