package POO.P5E02;

import java.util.Scanner;

public class cd extends midia{
    private int musica;
    
    public cd ()
    {
        
    }
    public cd(int codigo, double preco, String nome, int mus)
    {
        super(codigo, preco, nome);
        this.musica = musica;
    }

    public int getMusica ()
    {
        return musica;
    }

    public int setMusica (int music)
    {
        return this.musica = music;
    }

    @Override
    public String getDetalhe()
    {
        String s = "Codigo: " + getCodigo() + "\n" + "Nome: " + getNome()+ "\n" + "Preco: " + getPreco();
        return s;
    }

    @Override
    public  void inserirDados()
    {
        Scanner sc = new Scanner(System.in);
        super.inserirDados();
        System.out.println("Digiite o numero da musica");
        int mus = Integer.parseInt(sc.nextLine());

        setMusica(mus);
    }
}
