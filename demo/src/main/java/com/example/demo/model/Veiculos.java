package com.example.demo.model;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class Veiculos {
    private String marca;
    private String modelo;
    private int ano;
    private int preco;
    private String cor;
    public Veiculos() {

    }

    public Veiculos(String marca, String modelo, int ano, int preco, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}

