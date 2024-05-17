package br.edu.up.models;

import java.time.LocalDateTime;

public class Passagem {

    public int numAssento;
    public String classeAssento;
    public LocalDateTime dataVoo;

     public Passagem(String numeroAssento, String classeAssento, LocalDateTime dataVoo) {
        this.numAssento = numAssento;
        this.classeAssento = classeAssento;
        this.dataVoo = dataVoo;
     }

    public int getNumAssento() {
        return numAssento;
    }
    public void setNumAssento(int numAssento) {
        this.numAssento = numAssento;
    }
    public String getClasseAssento() {
        return classeAssento;
    }
    public void setClasseAssento(String classeAssento) {
        this.classeAssento = classeAssento;
    }
    public LocalDateTime getDataVoo() {
        return dataVoo;
    }
    public void setDataVoo(LocalDateTime dataVoo) {
        this.dataVoo = dataVoo;
    }

    
    
}
