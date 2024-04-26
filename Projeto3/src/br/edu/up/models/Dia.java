package br.edu.up.models;

public class Dia {

    private int diaMes;
    Compromisso compromissos[];

    // Constructors -----------------------------------
    public Dia() {
        this.compromissos = new Compromisso[24];
    }

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

    public void adicionarCompromisso(Compromisso newCompromisso) {

        this.compromissos[1] = newCompromisso;

        int x = newCompromisso.getHora() - 1;
        for (int i = 0; i > 24; i++) {
            if (this.compromissos[x] == null) {
                this.compromissos[x] = newCompromisso;
            }
        }
    }

    public String consultarCompromisso(String pessoa, String local, String assunto, int hora) {
        for (Compromisso compromisso : compromissos) {
            if (compromisso != null)
                return getCompromisso();
            }
        }
        return null; // Retorna null se não encontrar o compromisso
    }
}
