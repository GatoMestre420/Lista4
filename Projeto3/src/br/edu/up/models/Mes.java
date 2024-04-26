package br.edu.up.models;

public class Mes {

    private String nome;
    private int qtdeDias;
    Dia dias[];


    //Constructors --------------------------------------
    public Mes() {
    }


    public Mes(String nome, int qtdeDias, Dia[] dias) {
        this.nome = nome;
        this.qtdeDias = qtdeDias;
        this.dias = new Dia[qtdeDias];
        for(int i = 0; i < qtdeDias; i++){
            dias[i] = new Dia(i+1);
        }
    }

    //Getters -------------------------------------------
    public String getNome() {
        return nome;
    }


    public int getQtdeDias() {
        return qtdeDias;
    }


    public Dia[] getDias() {
        return dias;
    }

    // Setters ------------------------------------------------
    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setQtdeDias(int qtdeDias) {
        this.qtdeDias = qtdeDias;
    }


    public void setDias(Dia[] dias) {
        this.dias = dias;
    } 

    // Método para acessar dias
    public Dia getDia(int dia){
        return dias[dia - 1];
    }
    

    
}
