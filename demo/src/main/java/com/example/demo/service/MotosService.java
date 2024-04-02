package com.example.demo.service;

import com.example.demo.model.Veiculos;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MotosService implements VeiculosService<Veiculos>{
    @Override
    public List<Veiculos> listar() {
        return null;
    }

    @Override
    public Veiculos criar(Veiculos veiculos) {
        return null;
    }

    @Override
    public Veiculos atualizar(Veiculos veiculos, Long id) {
        return null;
    }

    @Override
    public boolean deletar(Long id) {
        return false;
    }
}
