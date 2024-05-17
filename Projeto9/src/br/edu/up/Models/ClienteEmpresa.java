package br.edu.up.Models;

public class ClienteEmpresa extends Cliente {
    private String cnpj;
    private String inscEstadual;
    private int anoFundacao;

    public ClienteEmpresa(String nome, String telefone, String email, Endereco endereco, String cnpj, String inscEstadual, int anoFundacao) {
        super(nome, telefone, email, endereco, 25000.0);
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.anoFundacao = anoFundacao;
    }

    // Getters e Setters
    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }
    public String getInscEstadual() { return inscEstadual; }
    public void setInscEstadual(String inscEstadual) { this.inscEstadual = inscEstadual; }
    public int getAnoFundacao() { return anoFundacao; }
    public void setAnoFundacao(int anoFundacao) { this.anoFundacao = anoFundacao; }

    @Override
    public String getDados() {
        return "Nome: " + nome + "\nTelefone: " + telefone + "\nEmail: " + email + "\nEndereço: " + endereco +
               "\nCNPJ: " + cnpj + "\nInscrição Estadual: " + inscEstadual + "\nAno de Fundação: " + anoFundacao +
               "\nCrédito Máximo: " + vlrMaxCredito + "\nValor Emprestado: " + vlrEmprestado;
    }
}