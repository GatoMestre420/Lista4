package br.edu.up.View;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    // Método para mostrar o menu e retornar a opção escolhida
    public int mostrarMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Entrada de veículo");
        System.out.println("2. Saída de veículo");
        System.out.println("3. Emitir relatório");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    // Método para solicitar uma string do usuário
    public String solicitarString(String mensagem) {
        System.out.print(mensagem);
        return scanner.next();
    }
}