package br.edu.up.models;
import br.edu.up.telas.MesView;

public class Mes {

    private String nome;
    private int qtdeDias;
    private Dia[] dias;
    private Compromisso[] compromissos[];
    private int cont;
    private MesView view = new MesView();

    public Mes(int dias, String nome) {
        this.qtdeDias = dias;
        this.dias = new Dia[dias];
        this.nome = nome;
<<<<<<< HEAD
        this.cont = 0;
=======
        this.qtdeDias = qtdeDias;
        this.dias = new Dia[qtdeDias];
        for(int i = 0; i < qtdeDias; i++){
            dias[i] = new Dia(i+1);
        }
>>>>>>> 3b3354f51727d0d87c3dadc321fe9bfb97122054
    }

    public void addCompromisso(int dia, int hora, String pessoa, String local, String Assunto) {
        if (dia > 0 && dia <= qtdeDias) {
            if (hora >= 1 && hora < 24) {
                if (dias[dia - 1] == null && dias[dia - 1].consultarCompromisso(hora).equals("1")) {
                    if (dias[dia - 1] == null) {
                        dias[dia - 1] = new Dia(dia);
                    }
                    dias[dia - 1].addCompromisso(hora, pessoa, local, Assunto);
                }
            }
        }
    }

    public String consultarCompromisso(int dia, int hora) {
        if (dia > 0 && dia <= this.qtdeDias) {
            if (hora >= 0 && hora < 24) {
                if (dias[dia - 1] != null && dias[dia - 1].consultarCompromisso(hora) != "1") {
                    return dias[dia - 1].consultarCompromisso(hora) + "Dia: " + dia;
                } else {
                    return "1";
                }
            }
        }
        return "";
    }

    public int getQtdeDias() {
        return qtdeDias;
    }

    public String removerCompromisso(int dia, int hora) {
        if (dia > 0 && dia <= qtdeDias) {
            if (hora >= 0 && hora < 24) {
                if (dias[dia - 1] != null) {
                    if (dias[dia - 1].consultarCompromisso(hora) != "1") {
                        dias[dia - 1].removerCompromisso(hora);
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
        return "";
    }

    public boolean temCompromissos() {
        for (Dia dia : dias) {
            if (dia != null) {
                return true;
            }
        }
        return false;
    }

    public String listarTodosCompromissos(){
        StringBuilder compromissosListados = new StringBuilder();
        for(int i = 0; i< dias.length; i++){
            if(dias[i] != null){
                compromissosListados.append("Compromissos do dia").append(i + 1).append(":\n");
                compromissosListados.append(dias[i].listarCompromisso()).append("\n");
             }
        }
        return compromissosListados.toString();
    }
<<<<<<< HEAD
=======


    public void setDias(Dia[] dias) {
        this.dias = dias;
    } 

    // Método para acessar dias
    public Dia getDia(int dia){
        return dias[dia - 1];
    }
    

>>>>>>> 3b3354f51727d0d87c3dadc321fe9bfb97122054
    
    public String getNomeMes(){
        return this.nome;
    }
}


