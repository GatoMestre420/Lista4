package br.edu.up.models;

public class Tripulação extends Pessoa {

    private String identificacaoAeronautica;
    private String matriculaFuncionario;

    public Tripulação(String nome, String rg, Aeronave aeronave, String IdAeronautica, String matriculaFuncionario){
        super(nome, rg, aeronave);
        this.matriculaFuncionario = matriculaFuncionario;
        this.identificacaoAeronautica = identificacaoAeronautica;

    }

    public String getIdAeronautica() {
        return identificacaoAeronautica;
    }
    public void setIdAeronautica(String idAeronautica) {
        this.identificacaoAeronautica = idAeronautica;
    }
    public String getMatriculaFuncionario() {
        return matriculaFuncionario;
    }
    public void setMatriculaFuncionario(String matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    
    

    

}
