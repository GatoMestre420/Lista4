package br.edu.up.Models;

public abstract class Cliente {
    protected String nome;
    protected String telefone;
    protected String email;
    protected Endereco endereco;
    protected double vlrMaxCredito;
    protected double vlrEmprestado;

    public Cliente(String nome, String telefone, String email, Endereco endereco, double vlrMaxCredito) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.vlrMaxCredito = vlrMaxCredito;
        this.vlrEmprestado = 0;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }
    public double getVlrMaxCredito() { return vlrMaxCredito; }
    public void setVlrMaxCredito(double vlrMaxCredito) { this.vlrMaxCredito = vlrMaxCredito; }
    public double getVlrEmprestado() { return vlrEmprestado; }

    public void emprestar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
        if ((vlrEmprestado + valor) > vlrMaxCredito) {
            throw new IllegalArgumentException("Valor excede o limite de crédito.");
        }
        vlrEmprestado += valor;
    }

    public void devolver(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
        if ((vlrEmprestado - valor) < 0) {
            throw new IllegalArgumentException("Valor a devolver excede o valor emprestado.");
        }
        vlrEmprestado -= valor;
    }

    public abstract String getDados();
}
