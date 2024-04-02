package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Motos extends Veiculos{
    private int cilindradas;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    public Motos() {

    }
    public Motos(String marca, String modelo, int ano, String preco, String status, int cilindradas, long id) {
        super(marca, modelo, ano, preco, status);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}


