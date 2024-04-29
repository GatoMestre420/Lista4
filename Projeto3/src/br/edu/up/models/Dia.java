package br.edu.up.models;

import br.edu.up.telas.DiaView;

public class Dia {

    private int num;
    private int cont;
    Compromisso compromissos[];
    private Diaview view = new DiaView();

    // Constructors -----------------------------------
    public Dia(int num) {
        this.num = num;
        this.cont = 0;
        this.compromissos = new Compromisso[24];
    }

    public String addCompromisso(int hora, String pessoa, String local, String assunto) {
        if (hora >= 1 && hora < 24) {
            if (compromissos[hora - 1] == null) {
                compromissos[hora - 1] = new Compromisso(pessoa, local, assunto);
                cont++;
            } else {
                return null;
            }
        } else {
            return null;
        }
        return "";
    }

    public String consultarCompromisso(int hora) {
        if (hora >= 1 && hora < 24) {
            if (compromissos[hora - 1] != null) {
                return compromissos[hora - 1] + "Horario: " + hora + " , ";
            } else {
                return "1";
            }
        } else {
            return null;
        }
    }

    public String removerCompromisso(int hora){
        if(hora >= 0 && hora < 24){
            if(compromissos[hora-1] != null){
                compromissos[hora-1] = null;
                cont--;
            }else{
                return null;
            }
        }else {
            return null;
        }
        return " ";
    }

    public String listarCompromisso() {
        String compromissosListados = "";
        for(int i = 0; i < 24; i++){
            if(compromissos[i] != null){
                compromissosListados += "Hora: " + (i+1) + " " + compromissos[i] + "\n";
            }
        }
        return compromissosListados.isEmpty() ? null : compromissosListados;
    }

}
