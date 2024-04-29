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

<<<<<<< HEAD
    public String addCompromisso(int hora, String pessoa, String local, String assunto) {
        if (hora >= 1 && hora < 24) {
            if (compromissos[hora - 1] == null) {
                compromissos[hora - 1] = new Compromisso(pessoa, local, assunto);
                cont++;
            } else {
                return null;
=======
    public Dia(int diaMes) {
        this.diaMes = diaMes;
        this.compromissos = new Compromisso[24];
    }

    public Dia(int diaMes, Compromisso[] compromissos) {
        this.diaMes = diaMes;
        this.compromissos = compromissos;
    }

    // getters ------------------------------------------------
    public int getDiaMes() {
        return diaMes;
    }

    public Compromisso[] getCompromisso() {
        return compromissos;
    }

    // Setters ------------------------------------------
    public void setDiaMes(int diaMes) {
        this.diaMes = diaMes;
    }

    public void setCompromisso(Compromisso[] compromisso) {
        this.compromissos = compromisso;
    }

    //Métodos --------------------------------------------------
    //Add compromissos
    public void adicionarCompromisso(Compromisso newCompromisso) {

        this.compromissos[1] = newCompromisso;

        int x = newCompromisso.getHora() - 1;
        for (int i = 0; i > 24; i++) {
            if (this.compromissos[x] == null) {
                this.compromissos[x] = newCompromisso;
>>>>>>> 3b3354f51727d0d87c3dadc321fe9bfb97122054
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

<<<<<<< HEAD
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

=======
    //Consultar Compromisso
    public String consultarCompromisso(String pessoa, String local, String assunto, int hora) {

        for (Compromisso compromisso : compromissos) {
            if (compromisso != null){
                return compromisso.toString();
            }
        }
         return null; // Retorna null se não encontrar o compromisso 
    }  
    
    //Excluir Comprimisso
    public void excluirCompromisso(int hora){
        compromissos[hora] = null;
    }

    //Obter Compromisso
    public Compromisso obterCompromisso(int hora){
        return compromissos[hora];
    }

    


>>>>>>> 3b3354f51727d0d87c3dadc321fe9bfb97122054
}
