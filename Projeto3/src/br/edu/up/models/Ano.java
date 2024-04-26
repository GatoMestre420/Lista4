package br.edu.up.models;

public class Ano {

    private int ano;
    private boolean bissexto;
    Mes meses[];


    //Constructors ----------------------------------------
    public Ano() {
    }


    public Ano(int ano, boolean bissexto, Mes[] meses) {
        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = meses;
    }

    //Getters ---------------------------------------------
    public int getAno() {
        return ano;
    }


    public boolean isBissexto() {
        return bissexto;
    }


    public Mes[] getMeses() {
        return meses;
    }

    //Setters --------------------------------------------
    public void setAno(int ano) {
        this.ano = ano;
    }


    public void setBissexto(boolean bissexto) {
        this.bissexto = bissexto;
    }


    public void setMeses(Mes[] meses) {
        this.meses = meses;
    }

    

    

    

    

}
