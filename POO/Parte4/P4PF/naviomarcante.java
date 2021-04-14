package POO.Parte4.P4PF;

public class naviomarcante extends navio {
    private double capacidadecarga;
    private double carga;

    public naviomarcante(String nome, int num, double capacicarga, double carga)
    {
        super(nome, num);
        this.capacidadecarga = capacicarga;
        this.carga = carga;
    }

    public double getCapacidadeCarga ()
    {
        return capacidadecarga;
    }

    public double getCarga ()
    {
        return carga;
    }

    public void carregamento(int p)
    {
        super.exibeinfo();
        System.out.println("A capacidade de carga é de: " + getCapacidadeCarga());
        System.out.println("A capacidade de carga é de: " + getCarga());
    }
}
