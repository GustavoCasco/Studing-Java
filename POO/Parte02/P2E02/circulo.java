package POO.Parte02.P2E02;

public class circulo extends triangulo{

    private double raioc;
    private double perimetroc;
    private double areac;

    public double getPeri ()
    {
        return this.perimetroc;
    }

    public double getAre ()
    {
        return this.areac;
    }


    public double calcularAreaC (double raio)
    {
        this.raioc = raio;
        return areac = 3.14159*raio*raio;
    }

    
    public double calcularPerimetroC (double raio)
    {
        this.raioc = raio;
        return perimetroc = 2*3.14159*raio;
    }
    
}
