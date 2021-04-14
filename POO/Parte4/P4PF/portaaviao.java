package POO.Parte4.P4PF;

public class portaaviao  extends naviodeguerra{
    protected int numAvioes;
    protected double calculo1;


    public portaaviao (String nome, int num, double blind, double ataque, int numAvioes)
    {
        super(nome, num, blind, ataque);
        this.numAvioes = numAvioes;
    }

    @Override
    public void poderdefogo()
    {
        calculo1 = super.ataque * numAvioes;
    }
}
