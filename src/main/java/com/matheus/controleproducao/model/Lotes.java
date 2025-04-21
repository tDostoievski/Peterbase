package com.matheus.controleproducao.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Lotes extends Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Data data;
    @Embedded
    private Mescla mescla;
    @Embedded
    private PreMescla premescla;
    
    private String lote;
    private Moinho moinho;
    private double carga;
    private Pigmento pigmento;
    private int revisao;

    // Construtor vazio
    public Lotes() {
    }

    // Construtor com parâmetros
    public Lotes(String nome, Data data, String lote, Moinho moinho, double carga, Mescla mescla, PreMescla premescla, Pigmento pigmento, int revisao) {
        super(nome); // chama o construtor da classe Products
        this.data = data;
        this.lote = lote;
        this.moinho = moinho;
        this.carga = carga;
        this.mescla = mescla;
        this.premescla = premescla;
        this.pigmento = pigmento;
        this.revisao = revisao;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Moinho getMoinho() {
        return moinho;
    }

    public void setMoinho(Moinho moinho) {
        this.moinho = moinho;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public Mescla getMescla() {
        return mescla;
    }

    public void setMescla(Mescla mescla) {
        this.mescla = mescla;
    }

    public PreMescla getPremescla() {
        return premescla;
    }

    public void setPremescla(PreMescla premescla) {
        this.premescla = premescla;
    }

    public Pigmento getPigmento() {
        return pigmento;
    }

    public void setPigmento(Pigmento pigmento) {
        this.pigmento = pigmento;
    }

    public int getRevisao() {
        return revisao;
    }

    public void setRevisao(int revisao) {
        this.revisao = revisao;
    }
}
