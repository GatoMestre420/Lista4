package br.edu.up.Controller;
import br.edu.up.Models.Estacionamento;
import br.edu.up.Models.Veiculo;
import br.edu.up.View.Menu;

public class EstacionamentoController {
    private Estacionamento estacionamento;
    private Menu menu;

    public EstacionamentoController() {
        this.estacionamento = new Estacionamento(10); // Configurando 10 vagas
        this.menu = new Menu();
    }

    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            int escolha = menu.mostrarMenu();
            switch (escolha) {
                case 1:
                    entradaVeiculo();
                    break;
                case 2:
                    saidaVeiculo();
                    break;
                case 3:
                    estacionamento.emitirRelatorio();
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void entradaVeiculo() {
        String modelo = menu.solicitarString("Digite o modelo do veículo: ");
        String placa = menu.solicitarString("Digite a placa do veículo: ");
        String cor = menu.solicitarString("Digite a cor do veículo: ");
        Veiculo veiculo = new Veiculo(modelo, placa, cor);
        estacionamento.entradaVeiculo(veiculo);
    }

    private void saidaVeiculo() {
        String placa = menu.solicitarString("Digite a placa do veículo para retirar: ");
        estacionamento.saidaVeiculo(placa);
    }
}