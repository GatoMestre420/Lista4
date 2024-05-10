package br.edu.up.modelos;

public class Pontos {
    
    private double x;
    private double y;
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public Pontos(){
        this.y=0;
        this.x=0;
    }

    public Pontos(double x, double y){
        this.y=0;
        this.x=0;
    }

    public double calcularDistancia(Pontos outroPonto) {
        double distancia = Math.sqrt(Math.pow((this.x - outroPonto.x), 2) + Math.pow((this.y - outroPonto.y), 2));
        return distancia;
    }
        
        
    

}




