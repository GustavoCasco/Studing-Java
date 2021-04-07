package POO;

public class construtor {
    private String nome;
    private int idade;
    private double altura;
    private String genero;

    public construtor (int idade, double altura, String nome, String genero)
    {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
    }

    public static void main (String [] args)
    {
        construtor pessoa = new construtor(19, 1.72, "Gustavo", "Masculino");

        System.out.println("A pessoa a seguir tem os dados." + " nome: " + pessoa.nome + "; "+" Genero: " + pessoa.genero + "; " + "Altura: " + pessoa.altura+ ";");
    }

}
