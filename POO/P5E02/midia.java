package POO.P5E02;

import java.util.Scanner;

public class midia {
    protected int codigo;
    protected double preco;
    protected String nome;


    public midia ()
    {

    }

    public midia (int codigo, double preco, String nome)
    {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public String getTipo ()
    {
        return "O nome da classe é: Midia";
    }

    public int getCodigo  ()
    {
        return this.codigo;
    }

    public String getNome  ()
    {
        return this.nome;
    }

    public double getPreco()
    {
        return this.preco;
    }

    public int setCodigo (int cod)
    {
        return this.codigo = cod;
    }

    public String setNome(String nome)
    {
        return this.nome = nome;
    }
  
    public double setPreco(double preco)
    {
        return this.preco = preco;
    }
    
    public String getDetalhe ()
    {
        return "Codigo: " + getCodigo() +"\n"+ "Nome: " + getNome() +"\n"+ "Preco: " + getPreco();
    }

    public void printDados()
    {     
        String s = getTipo() + "\n" + getDetalhe() + "\n"; 
        System.out.println(s);
    }
  
    public void inserirDados()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo: ");
        int c = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o preco: ");
        double pre = Double.parseDouble(sc.nextLine());

        System.out.println("Digite o nome: ");
        String name = sc.nextLine();

        setCodigo(c);
        setNome(name);
        setPreco(pre);
    }
    
}
