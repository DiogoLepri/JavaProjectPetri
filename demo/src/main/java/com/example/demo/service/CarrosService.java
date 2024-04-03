package com.example.demo.service;

import com.example.demo.model.Carros;
import com.example.demo.model.Veiculos;
import com.example.demo.repository.CarrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


@Service
public class CarrosService implements VeiculosService<Carros> {

    @Autowired
    private CarrosRepository carrosRepository;

    @Override
    public List<Carros> listar() {
        return carrosRepository.findAll();
    }

    @Override
    public Carros criar(Carros carros) {
        return carrosRepository.save(carros);
    }

    @Override
    public Carros atualizar(Carros carros, Long id) {
        if (carrosRepository.existsById(id)) {
            carros.setId(id);
            return carrosRepository.save(carros);
        }
        return null;
    }


    @Override
    public boolean deletar(Long id) {
        if (carrosRepository.existsById(id)) {
            carrosRepository.deleteById(id);
            return true;
        }
        return false;
    }
    public List<Carros> listarOrdenadoPorPreco() {
        List<Carros> listaCarro = carrosRepository.findAll();
        listaCarro.sort(Comparator.comparingInt(Carros::getPreco).reversed());
        return listaCarro;
    }
}
