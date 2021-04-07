package POO.inter;

public class triangulo implements figura{
    //atributo do triangulo
    private double lado;

    //construtor
    public triangulo (double lado)
    {
        this.lado = lado;
    }

    //metodos 
    public String getNomeFigura()
    {
        return "Triangulo";
    }

    public double getLado()
    {
        return lado;
    }

    public double calculoPerimetro()
    {
        return lado * 3;
    }

    public double calculoArea()
    {
        return lado * lado * 0.433;
    }
}
