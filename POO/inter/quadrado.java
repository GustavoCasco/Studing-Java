package POO.inter;

public class quadrado implements figura{
    //atributos
    private double lado;
    
    //construtor
    public quadrado (double lado)
    {
        this.lado = lado;
    }

    //metodo get - listar o nome da figura
    public String getNomeFigura()
    {
        return "quadrado";
    }

    public double getLado()
    {
        return lado;
    }

    public double calculoPerimetro()
    {
        return lado * 4.0;
    }

    public double calculoArea()
    {
        return lado*lado;
    }
}
