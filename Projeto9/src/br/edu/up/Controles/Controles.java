package br.edu.up.Controles;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import br.edu.up.Controles.*;
import br.edu.up.Models.ClienteEmpresa;
import br.edu.up.Models.ClientePessoa;
import br.edu.up.Telas.Telas;

public class Controles {
    private static final String Telas = null;
    private Map<String, ClientePessoa> clientesPessoa;
    private Map<String, ClienteEmpresa> clientesEmpresa;
    private static Telas telas;

    public void Controle(Telas tela) {
        this.clientesPessoa = new HashMap();
        this.clientesEmpresa = new HashMap<>();
        this.telas = telas;
    }

    public static void iniciar() {
        int opcao;
        do {
            opcao = telas.menu();
            switch (opcao) {
                case 1:
                    telas.incluirClientePessoa();
                    break;
                case 2:
                    telas.incluirClienteEmpresa();
                    break;
                case 3:
                    telas.mostrarDadosClientePessoa();
                    break;
                case 4:
                    telas.mostrarDadosClienteEmpresa();
                    break;
                case 5:
                    telas.emprestarParaClientePessoa();
                    break;
                case 6:
                    telas.emprestarParaClienteEmpresa();
                    break;
                case 7:
                    telas.devolverDeClientePessoa();
                    break;
                case 8:
                    telas.devolverDeClienteEmpresa();
                    break;
                case 9:
                    telas.mostrarMensagem("Encerrando o programa.");
                    break;
                default:
                    telas.mostrarMensagem("Opção inválida. Tente novamente.");
            }
        } while (opcao != 9);
    }

    private void incluirClientePessoa() {
        ClientePessoa cliente = telas.incluirClientePessoa();
        clientesPessoa.put(cliente.getCPF(), cliente);
        telas.mostrarMensagem("Cliente pessoa incluído com sucesso.");
    }

    private void incluirClienteEmpresa() {
        ClienteEmpresa cliente = telas.incluirClienteEmpresa();
        clientesEmpresa.put(cliente.getCnpj(), cliente);
        telas.mostrarMensagem("Cliente empresa incluído com sucesso.");
    }

    private void mostrarDadosClientePessoa() {
        telas.mostrarMensagem("Informe o CPF do cliente:");
        String cpf = new Scanner(System.in).nextLine();
        ClientePessoa cliente = clientesPessoa.get(cpf);
        if (cliente != null) {
            telas.mostrarDados(cliente.getDados());
        } else {
            telas.mostrarMensagem("Cliente não encontrado.");
        }
    }

    private void mostratelasosClienteEmpresa() {
        telas.mostrarMensagem("Informe o CNPJ do cliente:");
        String cnpj = new Scanner(System.in).nextLine();
        ClienteEmpresa cliente = clientesEmpresa.get(cnpj);
        if (cliente != null) {
            telas.mostrarDados(cliente.getDados());
        } else {
            telas.mostrarMensagem("Cliente não encontrado.");
        }
    }

    private void emprestarParaClientePessoa() {
        telas.mostrarMensagem("Informe o CPF do cliente:");
        String cpf = new Scanner(System.in).nextLine();
        ClientePessoa cliente = clientesPessoa.get(cpf);
        if (cliente != null) {
            try {
                double valor = telas.solicitarValor("empréstimo");
                cliente.emprestar(valor);
                telas.mostrarMensagem("Empréstimo realizado com sucesso.");
            } catch (IllegalArgumentException e) {
                telas.mostrarMensagem(e.getMessage());
            }
        } else {
            telas.mostrarMensagem("Cliente não encontrado.");
        }
    }

    private void emprestarParaClienteEmpresa() {
        telas.mostrarMensagem("Informe o CNPJ do cliente:");
        String cnpj = new Scanner(System.in).nextLine();
        ClienteEmpresa cliente = clientesEmpresa.get(cnpj);
        if (cliente != null) {
            try {
                double valor = telas.solicitarValor("empréstimo");
                cliente.emprestar(valor);
                telas.mostrarMensagem("Empréstimo realizado com sucesso.");
            } catch (IllegalArgumentException e) {
                telas.mostrarMensagem(e.getMessage());
            }
        } else {
            telas.mostrarMensagem("Cliente não encontrado.");
        }
    }

    private void devolverDeClientePessoa() {
        telas.mostrarMensagem("Informe o CPF do cliente:");
        String cpf = new Scanner(System.in).nextLine();
        ClientePessoa cliente = clientesPessoa.get(cpf);
        if (cliente != null) {
            try {
                double valor = telas.solicitarValor("devolução");
                cliente.devolver(valor);
                telas.mostrarMensagem("Devolução realizada com sucesso.");
            } catch (IllegalArgumentException e) {
                telas.mostrarMensagem(e.getMessage());
            }
        } else {
            telas.mostrarMensagem("Cliente não encontrado.");
        }
    }

    private void devolverDeClienteEmpresa() {
        telas.mostrarMensagem("Informe o CNPJ do cliente:");
        String cnpj = new Scanner(System.in).nextLine();
        ClienteEmpresa cliente = clientesEmpresa.get(cnpj);
        if (cliente != null) {
            try {
                double valor = telas.solicitarValor("devolução");
                cliente.devolver(valor);
                telas.mostrarMensagem("Devolução realizada com sucesso.");
            } catch (IllegalArgumentException e) {
                telas.mostrarMensagem(e.getMessage());
            }
        } else {
            telas.mostrarMensagem("Cliente não encontrado.");
        }
    }
}