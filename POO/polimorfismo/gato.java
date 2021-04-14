package POO.polimorfismo;

public class gato  extends aulaAbstract{
    public gato (int id, String especie, String nome)
    {
        super(id, especie, nome);
    }

    public void som()
    {
        System.out.println("Miau");
    }
}
