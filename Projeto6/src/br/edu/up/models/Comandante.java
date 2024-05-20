package br.edu.up.models;

public class Comandante extends Tripulação {

    

    private int totalHorasVoo;

    public Comandante(String nome, String rg, String identificacaoAeronautica, String matriculaFuncionario, int totalHorasVoo, Aeronave aeronave) {
        super(nome, rg, aeronave, identificacaoAeronautica, matriculaFuncionario);
        this.totalHorasVoo = totalHorasVoo;
    }

    
    public int getTotalHorasVoo() {
        return totalHorasVoo;
    }

    public void setTotalHorasVoo(int totalHorasVoo) {
        this.totalHorasVoo = totalHorasVoo;
    }


    
}
