package POO.Parte4.P4PF;

public class cruzador extends naviodeguerra{ 
    protected int numCanhoes;
    protected  double calculo;
    
    public cruzador (String nome, int num, double blind, double ataque, int numCanhoes)
    {
        super(nome, num, blind, ataque);
        this.numCanhoes = numCanhoes;
    }
    
    @Override
    public void poderdefogo()
    {
        calculo = super.ataque * Math.sqrt(numCanhoes);
    }
}
