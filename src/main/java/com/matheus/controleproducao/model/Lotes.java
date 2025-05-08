package com.matheus.controleproducao.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Lotes extends Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Data data;
    @Embedded
    @AttributeOverrides({
    @AttributeOverride(name = "velocidade", column = @Column(name = "mescla_velocidade")),
    @AttributeOverride(name = "tempo", column = @Column(name = "mescla_tempo")),
    @AttributeOverride(name = "temperatura", column = @Column(name = "mescla_temperatura")),
    @AttributeOverride(name = "viscosidade", column = @Column(name = "mescla_viscosidade"))
})
    private ParametrosDispersao mescla;
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "velocidade", column = @Column(name = "premescla_velocidade")),
        @AttributeOverride(name = "tempo", column = @Column(name = "premescla_tempo")),
        @AttributeOverride(name = "temperatura", column = @Column(name = "premescla_temperatura")),
        @AttributeOverride(name = "viscosidade", column = @Column(name = "premescla_viscosidade"))
    })
    private ParametrosDispersao premescla;
    
    private String lote;

    @ManyToOne
    @JoinColumn(name = "moinho_id")
    private Moinho moinho;

    private double carga;

    @ManyToOne
    @JoinColumn(name = "pigmento_id")
    private Pigmento pigmento;
    private int revisao;

    // Construtor vazio
    public Lotes() {
    }

    // Construtor com parâmetros
    public Lotes(String nome, Data data, String lote, Moinho moinho, double carga, ParametrosDispersao mescla, ParametrosDispersao premescla, Pigmento pigmento, int revisao) {
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

    public ParametrosDispersao getMescla() {
        return mescla;
    }

    public void setMescla(ParametrosDispersao mescla) {
        this.mescla = mescla;
    }

    public ParametrosDispersao getPremescla() {
        return premescla;
    }

    public void setPremescla(ParametrosDispersao premescla) {
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
