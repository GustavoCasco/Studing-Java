package POO.inter;

public class mostrador {
    public void getNome(figura f)
    {
        System.out.println("O nome dessa figura é: " + f.getNomeFigura());
    }

    public void getLado(figura f)
    {
        System.out.println("O lado dessa figura é: " + f.getLado());
    }

    public void calculoPerimetro(figura f)
    {
        System.out.println("O perimetro dessa figura é: " + f.calculoPerimetro());
    }

    public void calculoArea(figura f)
    {
        System.out.println("A area dessa figura é: " + f.calculoArea());
    }

}
