package POO.megaSena;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.*;

public class megaSena {
    private ArrayList<Set> bolao;
    private int qtdJgoos;
    private int qtdApostas;
    private int qtdQuadra;
    private int qtdQuina;
    private int qtdSena;

    public megaSena(int qtdJ, int qtdA)
    {
        if (qtdJ <=0) {
            qtdJ=1;
        }
        if (qtdA<6) {
            qtdA=6;
        }
        if (qtdA>15) {
            qtdA = 15;
        }

        this.qtdJgoos = qtdJ;
        this.qtdApostas = qtdA;
        bolao = new ArrayList<Set>();
        preencheBolao();
    }

    public void preencheBolao()
    {
        Random numeroAleatorio = new Random();
        numeroAleatorio.setSeed(new Date().getTime());
        for(int i=0 ; i <qtdJgoos ;i++)
        {
            Set<Integer> jogo = new HashSet<Integer>();
            while (jogo.size() < qtdApostas) 
            {
                jogo.add(numeroAleatorio.nextInt(60)+1);
            }
            bolao.add(jogo);
        }
    }

    public void imprimeBolao()
    {
        int tamnho = bolao.size();
        for(int i=0; i<tamnho;i++)
        {
            Set<Integer> jogo =  bolao.get(i);
            System.out.println((i+1) + " = " + jogo);
        }
    }

    public void confereBolao(Integer [] resultado)
    {
        int tamanho = bolao.size();
        for(int i = 0; i < tamanho; i++)
        {
            Set<Integer> jogo = bolao.get(i);
            int contador = 0;

            for(int j=0; j<6;j++)
            {
                if (jogo.contains(resultado[j]))
                 {
                    contador++;
                }
            }
        }
    }

    public void imprimeResultado()
    {
        System.out.println("------------------");
        System.out.println("Resultado do bolão");
        System.out.println("------------------");
        System.out.println("A quantidade de quadra é: " + qtdQuadra);
        System.out.println("------------------");
        System.out.println("A quantidade de quina é: " + qtdQuina);
        System.out.println("------------------");
        System.out.println("A quantidade de sena é: " + qtdSena);    
    }
}
