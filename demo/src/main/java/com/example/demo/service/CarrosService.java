package com.example.demo.service;

import com.example.demo.model.Carros;
import com.example.demo.repository.CarrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarrosService {
    @Autowired
    CarrosRepository carrosRepository;
    public List<Carros> listarCarros(){
        return carrosRepository.findAll();
    }
    public Carros criar(Carros carros){
        return carrosRepository.save(carros);
    }
    public Carros atualizar(Carros carros){
        return carrosRepository.save(carros);
    }
    public boolean deletar(Long id){
        if(carrosRepository.existsById(id)){
            carrosRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public int qtdCarros(){
        return carrosRepository.findAll().size();
    }
}
