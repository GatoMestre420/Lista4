package br.edu.up;
import br.edu.up.Controles.Controles;
import br.edu.up.Telas.Menu;


public class Programa {
        @SuppressWarnings("unused")
        public static void main(String[] args) {
            Menu menu = new Menu();
            Controles controles = new Controles();
            controles.iniciar();
        }
}
