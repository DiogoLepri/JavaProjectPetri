package com.example.demo.service;

import com.example.demo.model.Carros;
import com.example.demo.model.Veiculos;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarrosService implements VeiculosService<Carros>{
    @Override
    public List<Carros> listar() {
        return null;
    }

    @Override
    public Carros criar(Carros carros) {
        return null;
    }

    @Override
    public Carros atualizar(Carros carros, Long id) {
        return null;
    }

    @Override
    public boolean deletar(Long id) {
        return false;
    }
}
