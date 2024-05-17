package br.edu.up.models;

import java.util.List;

public class Comissario extends Tripulação  {
    

        private List<String> idiomasFluencia;

        public Comissario(String nome, String rg, Aeronave aeronave, String idAeronautica, String matriculaFuncionario, List<String> idiomasFluencia) {
            super(nome, rg, aeronave, idAeronautica, matriculaFuncionario);
            this.idiomasFluencia = idiomasFluencia;
        }

        public List<String> getIdiomasFluencia() {
            return idiomasFluencia;
        }

        public void setIdiomasFluencia(List<String> idiomasFluencia) {
            this.idiomasFluencia = idiomasFluencia;
        }

        

    
}
