package com.matheus.controleproducao.model;

public class ParametrosDispersao {
    private int velocidade;
    private int tempo;
    private int temperatura;

    public ParametrosDispersao (){

    }

    public ParametrosDispersao (int velocidade, int tempo, int temperatura){
        this.velocidade = velocidade;
        this.tempo = tempo;
        this.temperatura = temperatura;
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

    
}
