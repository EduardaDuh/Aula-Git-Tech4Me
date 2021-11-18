package program;

import direcao.Carro;

public class Program {
    public static void main(String [] args){
        Carro c = new Carro();
        c.acelerar(10);
        int velocidadeAtingida = c.getVelocidade();
        System.out.println("Velocidade atingida: " + velocidadeAtingida );
    }
}