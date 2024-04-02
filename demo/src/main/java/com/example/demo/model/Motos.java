package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Motos extends Veiculos{
    private int cilindradas;

    private String Kilometragem;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    public Motos() {

    }
    public Motos(long id,String marca, String modelo, int ano, String preco, String cor, int cilindradas, String kilometragem) {
        super(marca, modelo, ano, preco, cor);
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

    public String getKilometragem() {
        return Kilometragem;
    }

    public void setKilometragem(String kilometragem) {
        Kilometragem = kilometragem;
    }
}



