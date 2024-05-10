package br.edu.up.controles;
import br.edu.up.modelos.*;
import br.edu.up.telas.MenuConsultaCarros;

public class Controller {
    private static final int NUM_VAGAS = 10;
    private Estacionamento estacionamento;
    public MenuConsultaCarros menuConsultaCarros;

    public Controller() {
        estacionamento = new Estacionamento();
        menuConsultaCarros = new MenuConsultaCarros();
    }

    public void entradaVeiculo() {
        Veiculo veiculo = menuConsultaCarros.receberDadosVeiculo();
        if (estacionamento.entrar(veiculo)) {
            System.out.printl("Veículo estacionado com sucesso.");
        } else {
            menuConsultaCarros.mostrarMensagem("Não há vagas disponíveis.");
        }
    }

    public void saidaVeiculo() {
        String placa = ME.receberPlaca();
        Veiculo veiculo = estacionamento.sair(placa);
        if (veiculo != null) {
            view.mostrarMensagem("Veículo com placa " + placa + " saiu do estacionamento.");
        } else {
            view.mostrarMensagem("Veículo não encontrado.");
        }
    }

    public void relatorio() {
        int numEntradas = estacionamento.getNumVeiculosEstacionados();
        int numSaidas = estacionamento.getNumVagasDisponiveis();
        int valorTotal = numSaidas * 5;
        view.mostrarMensagem("Entradas: " + numEntradas + ", Saídas: " + (NUM_VAGAS - numSaidas) + ", Valor Total: R$" + valorTotal);
    }
}
