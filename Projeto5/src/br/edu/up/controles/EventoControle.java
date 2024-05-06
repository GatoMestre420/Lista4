package br.edu.up.controles;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import br.edu.up.models.Evento;

public class EventoControle {

    Scanner lc = new Scanner(System.in);
    List<Evento> eventos = new ArrayList<>();

    void addEvento(Evento evento) {

        eventos.add(evento);
    }

    void listarEventos() {
        for (Evento evento : eventos) {
            System.out.println("Name: " + evento.getNome() + ", Data: " + evento.getData()
                    + ", local: " + evento.getLocal()
                    + ", Ingressos ventidos: " + evento.getQntIngressoVendido()
                    + ", valor do ingresso:" + evento.getValorIngresso());
        }
    }

    void addEvento() {

        //Código para arrumar=========================

        System.out.print("Nome do Evento: ");
        Evento.setNome = lc.nextLine();
        System.out.print("Digite a data do Evento (DD-MM-AAAA) ");
        Evento.setData = lc.nextLine();
        System.out.print("Digite o Local: ");
        Evento.setLocal = lc.nextLine();
        System.out.print("Capacidade Máxima de pessoas: ");
        int lotacaoMax = Integer.parseInt(lc.nextLine());
        System.out.print("Ingressos vendidos: ");
        int qntIngressoVendido = Integer.parseInt(lc.nextLine());
        System.out.print("Valor do Ingresso: ");
        double valorIngresso = Double.parseDouble(lc.nextLine());
        Evento evento = new Evento(nome, data, local, lotacaoMax, qntIngressoVendido, valorIngresso);
        EventoControle.addEvento(evento);
        System.out.println("Event added successfully.");

    }
}
