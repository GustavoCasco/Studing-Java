package POO.Parte4.P4E03;

public class Veiculo {
    private int velocidade = 0;
    private int velocidadeMax = 100;

    public Veiculo(int velocidade) {
    	this.velocidade = velocidade;
    }
    
    public int getVelocidade(){
       return this.velocidade;
    }

    public int getVelocidadeMax(){
       return this.velocidadeMax;
    }

    public void acelera(int incremento) throws MuitoRapido
    {
        if(velocidade + incremento > velocidadeMax){
        	throw new MuitoRapido("Ta louco Mano!"); 
        }
        else
        {
           velocidade += incremento;
        }
    }

    public void desacelera(int decremento) throws AceleracaoNegativa
    {
        if(velocidade - decremento < 0){
        	throw new AceleracaoNegativa("Einstein... quebrou as leis da Fisica.");
        }
        else
        {
           velocidade -= decremento;
        }
    }
}
