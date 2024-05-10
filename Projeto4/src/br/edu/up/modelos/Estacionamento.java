package br.edu.up.modelos;


public class Estacionamento {
    private static final int NUM_VAGAS = 10;
    private Veiculo[] vagas;

    public Estacionamento() {
        vagas = new Veiculo[NUM_VAGAS];
    }

    public boolean entrar(Veiculo veiculo) {
        for (int i = 0; i < vagas.length; i++) {
            if (vagas[i] == null) {
                vagas[i] = veiculo;
                return true;
            }
        }
        return false;
    }

    public Veiculo sair(String placa) {
        for (int i = 0; i < vagas.length; i++) {
            if (vagas[i] != null && vagas[i].eiculo.getPlaca.equals(placa)) {
                Veiculo veiculo = vagas[i];
                vagas[i] = null;
                return veiculo;
            }
        }
        return null;
    }

    public int getNumVagasDisponiveis() {
        int numVagasDisponiveis = 0;
        for (Veiculo veiculo : vagas) {
            if (veiculo == null) {
                numVagasDisponiveis++;
            }
        }
        return numVagasDisponiveis;
    }

    public int getNumVeiculosEstacionados() {
        return NUM_VAGAS - getNumVagasDisponiveis();
    }
}
