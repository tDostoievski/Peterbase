package com.matheus.controleproducao.model;
import jakarta.persistence.Embeddable;

@Embeddable
public class Mescla extends ParametrosDispersao {
    private int viscosidade;

    public Mescla (){

    }

    public Mescla (int velocidade, int tempo, int temperatura, int viscosidade){
        super (velocidade, tempo, temperatura);
        this.viscosidade = viscosidade;
    }

    public int getViscosidade() {
        return viscosidade;
    }

    public void setViscosidade(int viscosidade) {
        this.viscosidade = viscosidade;
    }
}
