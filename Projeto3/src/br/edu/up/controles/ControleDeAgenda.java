package br.edu.up.controles;

import br.edu.up.models.*;
import br.edu.up.telas.*;

public class ControleDeAgenda {

    private Ano ano;

    public ControleDeAgenda(Ano ano) {
        this.ano = ano;
    }

    public String addCompromisso(int mes, int dia, int hora, String pessoa, String local, String assunto) {
        ano.addCompromisso(mes, hora, pessoa, local, assunto);
        if (ano.addCompromisso(mes, dia, hora, pessoa, local, assunto) != "ok") {
            return "Compromisso Realizado!!";
        } else {
            return "Compromisso já realizado";
        }
    }

    public String consultarCompromisso(int mes, int dia, int hora) {
        String str = ano.consultarCompromisso(mes, dia, hora);
        if(str != null){
            return str;
        }else{
            return "Compromisso não encontrado!!";
        }
    }
    public String removerCompromisso(int mes, int dia, int hora){
        ano.removerCompromisso(mes, dia, hora);
        if(model.removerCompromisso(mes, dia, hora) != null){
            return "Compromisso excluído com sucesso!";
        }else{
            return "Compromisso não encontrado!";
        }
    }

    

}
