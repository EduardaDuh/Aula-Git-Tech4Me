package direcao;

public class Carro {
    private int velocidade;

    public int acelerar(int velocidade) {
        int diferenca = 0;
        
        if (velocidade > this.velocidade) {
            diferenca = velocidade - this.velocidade;
            this.velocidade = velocidade;
        }
        
        return diferenca;
    }

    public int getVelocidade() {
        return this.velocidade;
    }
}