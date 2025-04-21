package com.matheus.controleproducao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Moinho {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String moinho;
    private int rotacaoDoMoinho;
    private int rotacaoBomba;
    private double pressao;
    private int tempo;
    private double vazao;
    private int passadas;

    public Moinho (){

    }

    public Moinho(String moinho, int rotacaoDoMoinho, int rotacaoBomba, double pressao, int tempo, double vazao, int passadas) {
        this.moinho = moinho;
        this.rotacaoDoMoinho = rotacaoDoMoinho;
        this.rotacaoBomba = rotacaoBomba;
        this.pressao = pressao;
        this.tempo = tempo;
        this.vazao = vazao;
        this.passadas = passadas;
    }

    public Long getId() {
        return id;
    }

    // Getters e Setters
    public String getMoinho() {
        return moinho;
    }

    public void setMoinho(String moinho) {
        this.moinho = moinho;
    }

    public int getRotacaoDoMoinho() {
        return rotacaoDoMoinho;
    }

    public void setRotacaoDoMoinho(int rotacaoDoMoinho) {
        this.rotacaoDoMoinho = rotacaoDoMoinho;
    }

    public int getRotacaoBomba() {
        return rotacaoBomba;
    }

    public void setRotacaoBomba(int rotacaoBomba) {
        this.rotacaoBomba = rotacaoBomba;
    }

    public double getPressao() {
        return pressao;
    }

    public void setPressao(double pressao) {
        this.pressao = pressao;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public double getVazao() {
        return vazao;
    }

    public void setVazao(double vazao) {
        this.vazao = vazao;
    }

    public int getPassadas() {
        return passadas;
    }

    public void setPassadas(int passadas) {
        this.passadas = passadas;
    }
}

