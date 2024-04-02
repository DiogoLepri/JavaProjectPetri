package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Carros extends Veiculos {
    private int numeroPortas;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Carros() {
    }

    public Carros(String marca, String modelo, int ano, double preco, String status, int numeroPortas, long id) {
        super(marca, modelo, ano, preco, status);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroDePortas() {
        return numeroPortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroPortas = numeroDePortas;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
}
