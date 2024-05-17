package br.edu.up.Models;

public class ClientePessoa extends Cliente {
    private String CPF;
    private double peso;
    private double altura;

    public ClientePessoa(String nome, String telefone, String email, Endereco endereco, String CPF, double peso, double altura) {
        super(nome, telefone, email, endereco, 10000.0);
        this.CPF = CPF;
        this.peso = peso;
        this.altura = altura;
    }

    // Getters e Setters
    public String getCPF() { return CPF; }
    public void setCPF(String CPF) { this.CPF = CPF; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    @Override
    public String getDados() {
        return "Nome: " + nome + "\nTelefone: " + telefone + "\nEmail: " + email + "\nEndereço: " + endereco +
               "\nCPF: " + CPF + "\nPeso: " + peso + "\nAltura: " + altura + "\nCrédito Máximo: " + vlrMaxCredito +
               "\nValor Emprestado: " + vlrEmprestado;
    }
}