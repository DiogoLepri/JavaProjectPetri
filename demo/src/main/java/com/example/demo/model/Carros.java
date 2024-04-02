package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Carros extends Veiculos {
    private String Kilometragem;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Carros() {
    }

    public Carros(long id,String marca, String modelo, int ano, String preco, String cor, String Kilometragem) {
        super(marca, modelo, ano, preco, cor);
    }

    public String getKilometragem() {
        return Kilometragem;
    }

    public void setKilometragem(String kilometragem) {
        Kilometragem = kilometragem;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
}
