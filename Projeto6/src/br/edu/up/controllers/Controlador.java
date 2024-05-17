package br.edu.up.controllers;

import br.edu.up.View.Menu;

import br.edu.up.models.*;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private List<Pessoa> pessoas;
    private Menu menu;

    public Controlador() {
        pessoas = new ArrayList<>();
        menu = new Menu();
    }

    public void iniciar() {
        while (true) {
            menu.exibirMenuPrincipal();
            int opcao = menu.lerOpcao();
            switch (opcao) {
                case 1:
                    registrarPassageiro();
                    break;
                case 2:
                    registrarTripulacao();
                    break;
                case 3:
                    exibirInformacoes();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void registrarPassageiro() {
        String nome = menu.lerString("Nome: ");
        String rg = menu.lerString("RG: ");
        Aeronave aeronave = criarAeronave();
        String identificadorBagagem = menu.lerString("Identificador de Bagagem: ");
        Passagem passagem = criarPassagem();

        Passageiro passageiro = new Passageiro(nome, rg, aeronave, identificadorBagagem, passagem);
        pessoas.add(passageiro);

        System.out.println("Passageiro registrado com sucesso!");
    }

    private void registrarTripulacao() {
        String nome = menu.lerString("Nome: ");
        String rg = menu.lerString("RG: ");
        Aeronave aeronave = criarAeronave();
        String identificacaoAeronautica = menu.lerString("Identificação Aeronáutica: ");
        String matricula = menu.lerString("Matrícula: ");

        System.out.println("1. Comandante");
        System.out.println("2. Comissário");
        int tipo = menu.lerInt("Tipo de Tripulação (1 para Comandante, 2 para Comissário): ");

        if (tipo == 1) {
            int totalHorasVoo = menu.lerInt("Total de Horas de Voo: ");
            Comandante comandante = new Comandante(nome, rg, aeronave, identificacaoAeronautica, matriculaFuncionario, totalHorasVoo);
            pessoas.add(comandante);
        } else if (tipo == 2) {
            List<String> idiomas = new ArrayList<>();
            while (true) {
                String idioma = menu.lerString("Idioma (digite 'sair' para finalizar): ");
                if (idioma.equalsIgnoreCase("sair")) break;
                idiomas.add(idioma);
            }
            Comissario comissario = new Comissario(nome, rg, aeronave, identificacaoAeronautica, matricula, idiomas);
            pessoas.add(comissario);
        }

        System.out.println("Tripulante registrado com sucesso!");
    }

    private Aeronave criarAeronave() {
        String codigo = menu.lerString("Código da Aeronave: ");
        String tipo = menu.lerString("Tipo da Aeronave: ");
        int quantidadeAssentos = menu.lerInt("Quantidade de Assentos: ");
        return new Aeronave(codigo, tipo, quantidadeAssentos);
    }

    private Passagem criarPassagem() {
        String numeroAssento = menu.lerString("Número do Assento: ");
        String classeAssento = menu.lerString("Classe do Assento: ");
        LocalDateTime dataVoo = menu.lerDataHora("Data e Hora do Voo (yyyy-MM-dd HH:mm): ");
        return new Passagem(numeroAssento, classeAssento, dataVoo);
    }

    private void exibirInformacoes() {
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
    

