package POO.Parte4.P4PF;

public class navio {
    protected int numtripulante;
    protected String nome;

    public navio( String nome, int numtripulante)
    {
        this.nome = nome;
        this.numtripulante = numtripulante;
    }

    public int getTripulante()
    {
        return numtripulante;
    }

    public String getNome()
    {
        return nome;
    }

    public void exibeinfo()
    {
        System.out.println("O nome do navio é: " + getNome());
        System.out.println("O numero de tripulante do navio é: " + getTripulante());
    }
}
