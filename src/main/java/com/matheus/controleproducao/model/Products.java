package com.matheus.controleproducao.model;

public class Products {

    private String nome;

    // Construtor vazio
    public Products() {
    }

    // Construtor com parâmetros
    public Products(String nome) {
        this.nome = nome;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}