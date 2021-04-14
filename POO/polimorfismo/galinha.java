package POO.polimorfismo;

public class galinha extends aulaAbstract{

    public galinha (int id, String especie, String nome)
    {
        super(id, especie, nome);
    }

    public void som()
    {
        System.out.println("Cocoricó");
    }
}
