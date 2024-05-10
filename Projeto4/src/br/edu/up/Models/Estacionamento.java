package br.edu.up.Models;

public class Estacionamento {
    private Veiculo[] veiculos;
    private int totalVagas;
    private int vagasDisponiveis;
    private int entradas;
    private int saidas;
    private double pagamentos;
    private final double valorPeriodo = 5.0;

    public Estacionamento(int totalVagas) {
        this.totalVagas = totalVagas;
        this.vagasDisponiveis = totalVagas;
        this.veiculos = new Veiculo[totalVagas];
        this.entradas = 0;
        this.saidas = 0;
        this.pagamentos = 0.0;
    }

    public boolean entradaVeiculo(Veiculo veiculo) {
        if (vagasDisponiveis > 0) {
            // Encontrar a primeira vaga disponível
            for (int i = 0; i < totalVagas; i++) {
                if (veiculos[i] == null) {
                    veiculos[i] = veiculo;
                    vagasDisponiveis--;
                    entradas++;
                    System.out.println("Veículo com placa " + veiculo.getPlaca() + " entrou.");
                    return true;
                }
            }
        } else {
            System.out.println("Estacionamento cheio!");
            return false;
        }
        return false;
    }

    public boolean saidaVeiculo(String placa) {
        // Procurar o veículo pela placa
        for (int i = 0; i < totalVagas; i++) {
            if (veiculos[i] != null && veiculos[i].getPlaca().equals(placa)) {
                veiculos[i] = null;
                vagasDisponiveis++;
                saidas++;
                pagamentos += valorPeriodo;
                System.out.println("Veículo com placa " + placa + " saiu. Pagamento: R$ " + valorPeriodo);
                return true;
            }
        }
        System.out.println("Veículo com placa " + placa + " não encontrado.");
        return false;
    }

    public void emitirRelatorio() {
        System.out.println("Relatório:");
        System.out.println("Entradas: " + entradas);
        System.out.println("Saídas: " + saidas);
        System.out.println("Pagamentos: R$ " + String.format("%.2f", pagamentos));
    }
}
