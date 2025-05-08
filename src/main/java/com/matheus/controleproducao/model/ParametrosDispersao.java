package com.matheus.controleproducao.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class ParametrosDispersao {

    private int velocidade;
    private int tempo;
    private int temperatura;
    private int viscosidade;

    public ParametrosDispersao (){

    }

    public ParametrosDispersao (int velocidade, int tempo, int temperatura, int viscosidade){
        this.velocidade = velocidade;
        this.tempo = tempo;
        this.temperatura = temperatura;
        this.viscosidade = viscosidade;
    }
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
                
    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getViscosidade() {
        return viscosidade;
    }

    public void setViscosidade (int viscosidade){
        this.viscosidade = viscosidade;
    }

    
}
