package br.edu.up.models;

public class Evento {

    public static String setData;
    public static String setNome;
    public static String setLocal;
    public String nome;
    public String data;
    public String local;
    public String lotacaoMax;
    public int qntIngressoVendido;
    public double valorIngresso;

    // Constructors
    // -----------------------------------------------------------------
    public Evento(String nome, String data, String local, String lotacaoMax, int qntIngressoVendido,
            double valorIngresso) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.lotacaoMax = lotacaoMax;
        this.qntIngressoVendido = qntIngressoVendido;
        this.valorIngresso = valorIngresso;
    }

    // getters ----------------------------------------------
    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public String getLotacaoMax() {
        return lotacaoMax;
    }

    public int getQntIngressoVendido() {
        return qntIngressoVendido;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    // Setters -------------------------------------------------
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setLotacaoMax(String lotacaoMax) {
        this.lotacaoMax = lotacaoMax;
    }

    public void setQntIngressoVendido(int qntIngressoVendido) {
        this.qntIngressoVendido = qntIngressoVendido;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

}
