package br.edu.up.controles;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.edu.up.models.Evento;
import br.edu.up.models.Reservas;

public class ReservaControle {

    List<Reservas> reservas = new ArrayList<>();

    void facaReserva(Evento evento, String nomeResponsavel, int numPessoas) {

        double precoTotal = evento.getValorIngresso() * evento.getValorIngresso();
        String dataReserva = LocalDate.now().toString();
        Reservas reservas = new Reservas();
    }

}
