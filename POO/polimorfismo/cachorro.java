//Herança da superClasse aulaAbstract
package POO.polimorfismo;

public class cachorro extends aulaAbstract {

    public cachorro (int id, String especie, String nome)
    {
        super(id, especie, nome);
    }

    //Polimorfismo do metodo som
    public void som()
    {
        System.out.println("AuAu");
    }
}
