package com.matheus.controleproducao.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    @Column (unique = true)
    private String nome;

    @Column (unique = true)
    private int codigo;

    @OneToMany
    private final List<Lotes> lotes = new ArrayList<>();  

    // Construtor vazio
    public Products() {
    }

    // Construtor com parâmetros
    public Products(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public Long getId() {
        return id;
    }

    public List<Lotes> getLotes() {
        return lotes;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
}