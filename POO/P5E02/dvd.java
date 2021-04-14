package POO.P5E02;

import java.util.Scanner;

public class dvd extends midia {
    public int faixa;

    public dvd ()
    {
        
    }

    public dvd(int codigo, double preco, String nome, int fa)
    {
        super(codigo, preco, nome);
        this.faixa = fa;
    }

    public String getTipo ()
    {
        return dvd.class.getSimpleName();
    }

    public int getFaixa ()
    {
        return faixa ;
    }

    public int setFaixa (int faixa )
    {
        return this.faixa = faixa ;
    }

    @Override
    public String getDetalhe()
    {
        return super.getDetalhe() + "\n" + "Faixa:" + getFaixa();
    }

    @Override
    public  void inserirDados()
    {
    Scanner sc = new Scanner(System.in);
    super.inserirDados();
    System.out.println("Digiite o numero de faixa");
    int faix = Integer.parseInt(sc.nextLine());

    setFaixa(faix);
    }
}
