package com.matheus.controleproducao.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Pigmento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int codigo;
    private String lote;

    @OneToMany(mappedBy="pigmento")
    private final List<Lotes> lotes = new ArrayList<>();

    public Pigmento (){

    }

    public Pigmento (int codigo, String lote){
        this.codigo = codigo;
        this.lote = lote;
    }
    
    public Long getId() {
        return id;
    }

    public List<Lotes> getLotes() {
        return lotes;
    }

    public int getCodigo (){
        return codigo;
    }

    public void setCodigo (int codigo){
        this.codigo = codigo;
    }
    
    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    
}

