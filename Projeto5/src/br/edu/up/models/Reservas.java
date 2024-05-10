package br.edu.up.models;

public class Reservas {

    Evento evento;
    public String nomeResponsavel;
    public int numPessoas;
    public String dataReserva;
    public double valorTotal;

    // Constructors ------------------------------------------
    public Reservas(Evento evento, String nomeResponsavel, int numPessoas, String dataReserva, double valorTotal) {
        this.evento = evento;
        this.nomeResponsavel = nomeResponsavel;
        this.numPessoas = numPessoas;
        this.dataReserva = dataReserva;
        this.valorTotal = valorTotal;
    }

}
