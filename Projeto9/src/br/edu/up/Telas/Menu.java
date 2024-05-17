package br.edu.up.Telas;

import java.util.Scanner;

import br.edu.up.Models.Cidade;
import br.edu.up.Models.ClienteEmpresa;
import br.edu.up.Models.ClientePessoa;
import br.edu.up.Models.Endereco;

public class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("Menu:");
        System.out.println("1. Incluir cliente pessoa");
        System.out.println("2. Incluir cliente empresa");
        System.out.println("3. Mostrar dados cliente pessoa");
        System.out.println("4. Mostrar dados cliente empresa");
        System.out.println("5. Emprestar para cliente pessoa");
        System.out.println("6. Emprestar para cliente empresa");
        System.out.println("7. Devolução de cliente pessoa");
        System.out.println("8. Devolução de cliente empresa");
        System.out.println("9. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public ClientePessoa incluirClientePessoa() {
        scanner.nextLine(); // Limpar buffer
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Rua: ");
        String rua = scanner.nextLine();
        System.out.print("Número: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer
        System.out.print("Bairro: ");
        String bairro = scanner.nextLine();
        System.out.print("CEP: ");
        String cep = scanner.nextLine();
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();
        System.out.print("UF: ");
        String UF = scanner.nextLine();
        System.out.print("CPF: ");
        String CPF = scanner.nextLine();
        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Altura: ");
        double altura = scanner.nextDouble();
        Cidade cidadeObj = new Cidade(cidade, UF);
        Endereco endereco = new Endereco(rua, numero, bairro, cep, cidadeObj);
        return new ClientePessoa(nome, telefone, email, endereco, CPF, peso, altura);
    }

    public ClienteEmpresa incluirClienteEmpresa() {
        scanner.nextLine(); // Limpar buffer
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Rua: ");
        String rua = scanner.nextLine();
        System.out.print("Número: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer
        System.out.print("Bairro: ");
        String bairro = scanner.nextLine();
        System.out.print("CEP: ");
        String cep = scanner.nextLine();
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();
        System.out.print("UF: ");
        String UF = scanner.nextLine();
        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();
        System.out.print("Inscrição Estadual: ");
        String inscEstadual = scanner.nextLine();
        System.out.print("Ano de Fundação: ");
        int anoFundacao = scanner.nextInt();
        Cidade cidadeObj = new Cidade(cidade, UF);
        Endereco endereco = new Endereco(rua, numero, bairro, cep, cidadeObj);
        return new ClienteEmpresa(nome, telefone, email, endereco, cnpj, inscEstadual, anoFundacao);
    }

    public double solicitarValor(String operacao) {
        System.out.print("Informe o valor para " + operacao + ": ");
        return scanner.nextDouble();
    }

    public void mostrarDados(String dados) {
        System.out.println(dados);
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void iniciar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iniciar'");
    }
}