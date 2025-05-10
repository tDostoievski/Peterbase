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
public class Dispersor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private int numero;

    private float diametroHelice;
    private float potencia;
    private float distanciaMaximaPiso; 
    private boolean antiexplosao; 
    
    @OneToMany
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
    
    public float getDiametroHelice() {
        return diametroHelice;
    }
    
    public void setDiametroHelice(float diametroHelice) {
        this.diametroHelice = diametroHelice;
    }
    
    public float getPotencia() {
        return potencia;
    }
    
    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }
    
    public float getDistanciaMaximaPiso() {
        return distanciaMaximaPiso;
    }
    
    public void setDistanciaMaximaPiso(float distanciaMaximaPiso) {
        this.distanciaMaximaPiso = distanciaMaximaPiso;
    }
    
    public boolean isAntiexplosao() {
        return antiexplosao;
    }
    
    public void setAntiexplosao(boolean antiexplosao) {
        this.antiexplosao = antiexplosao;
    }
    
    public List<Lotes> getLotes() {
        return lotes;
    }
    
}
