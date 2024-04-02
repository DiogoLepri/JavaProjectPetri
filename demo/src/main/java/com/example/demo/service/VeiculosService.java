package com.example.demo.service;

import com.example.demo.model.Veiculos;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface VeiculosService <T extends Veiculos> {
    List<T> listar();
    T criar(T t);
    T atualizar(T t, Long id);
    boolean deletar(Long id);

}
