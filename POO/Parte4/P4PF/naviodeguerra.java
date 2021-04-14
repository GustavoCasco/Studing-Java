package POO.Parte4.P4PF;

public class naviodeguerra extends navio{
    protected double blindagem;
    protected double ataque;

    public naviodeguerra ( String nome ,  int num, double blind, double ataque)
    {
        super(nome, num);
        this.blindagem = blind;
        this.ataque = ataque;
    }

    public double getataque ()
    {
        return ataque;
    }
 
    public void poderdefogo()
    {
        getataque();
    }

    public void exbirarma()
    {
        super.exibeinfo();
        poderdefogo();
    }

}
