package com.example.demo.service;


import com.example.demo.model.Motos;
import com.example.demo.repository.MotosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MotosService implements VeiculosService<Motos> {

    @Autowired
    private MotosRepository motosRepository;

    @Override
    public List<Motos> listar() {
        return motosRepository.findAll();
    }

    @Override
    public Motos criar(Motos motos) {
        return motosRepository.save(motos);
    }

    @Override
    public Motos atualizar(Motos motos, Long id) {
        if (motosRepository.existsById(id)) {
            motos.setId(id); // Garante que o carro atualizado terá o ID correto.
            return motosRepository.save(motos);
        }
        return null; // Ou você pode lançar uma exceção se preferir.
    }


    @Override
    public boolean deletar(Long id) {
        if(motosRepository.existsById(id)) {
            motosRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
