package br.edu.up;

import br.edu.up.modelos.Pontos;

public class App {

    public static void main(String[] args) {

        Pontos ponto1 = new Pontos();
        Pontos ponto2 = new Pontos();
        Pontos outraCord = new Pontos();
        ponto1.setX(0); 
        ponto1.setY(0);
        ponto2.setX(2);
        ponto2.setY(5);
        outraCord.setX(7);
        outraCord.setY(2);

        Prompt.imprimir("Ponto 1 : X: " + ponto1.getX() + " Y: " + ponto1.getY());
        Prompt.imprimir("Ponto 2 : X: " + ponto2.getX() + " Y: " + ponto2.getY());
        Prompt.imprimir("Ponto 3 : X: " + outraCord.getX() + " Y: " + outraCord.getY());



        double distanciaPonto1Ponto2 = ponto1.calcularDistancia(ponto2);
        Prompt.imprimir("A distância do ponto 1 ao ponto 2 é:" + distanciaPonto1Ponto2);

        double distanciaPonto2OutraCord = ponto2.calcularDistancia(outraCord);
        Prompt.imprimir("A distância do ponto 2 ao ponto as cordenadas é:" + distanciaPonto2OutraCord);

        ponto1.setX(10);
        ponto1.setY(3);

        distanciaPonto1Ponto2 = ponto1.calcularDistancia(ponto2);
        Prompt.imprimir("Ponto 1 = X: " + ponto1.getX() + " Y: " + ponto1.getY() + " E a distância entre o ponto 2 é: "
                + distanciaPonto1Ponto2);

    }
}
