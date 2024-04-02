package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public abstract class Motos extends Veiculos{
    private int cilindradas;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    public Motos() {

    }
    public Motos(String marca, String modelo, int ano, double preco, String status, int cilindradas, int id) {
        super(marca, modelo, ano, preco, status);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


