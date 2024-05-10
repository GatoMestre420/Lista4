package br.edu.up.telas;

import java.util.Scanner;

import br.edu.up.controles.EventoControle;
import br.edu.up.controles.ReservaControle;

public class TelaInicial {

    Scanner lc = new Scanner(System.in);
    EventoControle eventoControle = new EventoControle();
    ReservaControle reservaControle = new ReservaControle();

    public void mostrar(){

            while (true) {
                System.out.println("\n1. Adicionar Evento");
                System.out.println("2. Listar Evento");
                System.out.println("3. Fazer Reserva");
                System.out.println("4. Listar Reservas");
                System.out.println("5. Sair");
                
                System.out.println("Entre com sua escolha: ");
                String escolha = lc.nextLine();


                switch(escolha){
                    case "1":
                        AddEvento();
                        break;
                    case "2":
                        eventoControle.listarEvento();
                        break;
                    case "3":
                        reservaControle.(Evento evento , String nomeResponsavel , int numPessoas);
                        break;
                    case "4":
                    // código para listar reserva
                        break;
                    case "5":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Escolha inválida. ");
            
                }
        }
    }

}
