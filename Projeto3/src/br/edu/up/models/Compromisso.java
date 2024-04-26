package br.edu.up.models;

public class Compromisso {

    private String pessoa;
    private String local;
    private String assunto;
    private int hora;

    // Constructors -----------------------------
    public Compromisso() {
    }

    public Compromisso(String pessoa, String local, String assunto, int hora) {
        this.pessoa = pessoa;
        this.local = local;
        this.assunto = assunto;
        this.hora = hora;
    }

    // getters -----------------------------------
    public String getPessoa() {
        return pessoa;
    }

    public String getLocal() {
        return local;
    }

    public String getAssunto() {
        return assunto;
    }

    public int getHora() {
        return hora;
    }

    // Setters --------------------------------
    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String toString() {
        return "Compromisso com " + pessoa + " em " + local + " às " + hora + "h - " + assunto;

}

}
