package com.matheus.controleproducao.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Panela {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int numero;
    private float diametroDoTacho;
    private float alturaPanela;
    private float distanciaTacho;
    private boolean resfriamento;
    
    @ManyToOne
    private final List<Lotes> lotes = new ArrayList<>();

    public Long getId() {
        return id;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public float getDiametroDoTacho() {
        return diametroDoTacho;
    }
    
    public void setDiametroDoTacho(float diametroDoTacho) {
        this.diametroDoTacho = diametroDoTacho;
    }
    
    public float getAlturaPanela() {
        return alturaPanela;
    }
    
    public void setAlturaPanela(float alturaPanela) {
        this.alturaPanela = alturaPanela;
    }
    
    public float getDistanciaTacho() {
        return distanciaTacho;
    }
    
    public void setDistanciaTacho(float distanciaTacho) {
        this.distanciaTacho = distanciaTacho;
    }
    
    public boolean isResfriamento() {
        return resfriamento;
    }
    
    public void setResfriamento(boolean resfriamento) {
        this.resfriamento = resfriamento;
    }
    
    public List<Lotes> getLotes() {
        return lotes;
    }
}

