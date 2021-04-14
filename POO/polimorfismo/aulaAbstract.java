package POO.polimorfismo;
public abstract class aulaAbstract {
    //atributos
    private int idAnimal;
    private String especie;
    private String nome;

    //construtor
    public aulaAbstract(int id, String especie, String nome)
    {
        idAnimal = id;
        especie = especie;
        nome = nome;
    }

    //metodo
    public abstract void som();
}
