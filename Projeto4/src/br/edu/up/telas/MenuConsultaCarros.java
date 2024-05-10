package br.edu.up.telas;

import br.edu.up.controles.*;
import br.edu.up.modelos.*;
import br.edu.up.Prompt;

public class MenuConsultaCarros {
    public void mostrar(){

        Prompt.separador();
        Prompt.imprimir("Menu Inicial");
        Prompt.separador();
        Prompt.imprimir("1. Registrar carro;");
        Prompt.imprimir("2.Procurar carro para retirar;");
        Prompt.imprimir("3.Gerar relatório de Turno;");
        Prompt.separador();
        int opcao = Prompt.lerInteiro("Digite a operação desejada: ");


        switch (opcao) {
            case 1:{
            registrarCarro();
                break;
            }

            case 2:{
            retirarVeiculo();
                break;
            }
        
            default:
                break;
        }


    }
    public Veiculo registrarCarro(){
        
        
        String modelo = (Prompt.lerLinha("Digite o modelo do Carro: "));
        String cor = (Prompt.lerLinha("Digite a cor do Carro: "));
        String placa = (Prompt.lerLinha("Digite a Placa do Carro: "));
        return new Veiculo(modelo, placa, cor);
    }

    public void retirarVeiculo(){
        public String receberPlaca() {
        String pl = Prompt.lerLinha("Digite a placa do veículo:");
        for(int i= 0 ; i<10; i++){
            if){

            }
        }
        placa = MenuConsultaCarros.receberPlaca();
        Veiculo veiculo = Estacionamento.saidaVeiculo(placa);
        if (veiculo != null) {
            MenuConsultaCarros.mostrarMensagem("Veículo com placa " + placa + " saiu do estacionamento.");
        } else {
            MenuConsultaCarros.mostrarMensagem("Veículo não encontrado.");
        }
    }
}


    public void gerarRelatorio(){
        
    }


