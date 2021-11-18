ppackage programa;

import direcao.Carro;

public class Program {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.acelerar(10);
        int velocidadeAtingida = c.getVelocidade();
        System.out.println("Velocidade atingida: " + velocidadeAtingida);

        int diferenca = c.acelerar(30);
        velocidadeAtingida = c.getVelocidade();
        System.out.println("Nova velocidade atingida: " + velocidadeAtingida);
        System.out.println("Diferenca para a velocidade anterior: " + diferenca);
    }
}