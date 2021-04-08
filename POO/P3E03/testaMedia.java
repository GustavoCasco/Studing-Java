package POO.P3E03;

import java.util.Scanner;

public class testaMedia {
    public static void main(String [] args) {
        //Import do scanner
        Scanner sc = new Scanner(System.in);
      
        //declarando variaveis.
        double nota [];
        
        //Scanner para pegar o id da turma e a quantidade de alunos.
        System.out.println("Digite o id da turma");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Digite a quantidade alunos da sala");
        int qtd = Integer.parseInt(sc.nextLine());
        
        turma tur [] = new turma[qtd];

        //enquanto a variavel i for menor o tamanho do array soma mais uma turma.
        for (int i=0; i < tur.length; i++)
        {
            tur[i] = new turma();
        }


        //Set do id e quantidade
        tur[0].setSala(id, qtd);
        
        //Enquanto o valor da variavel "i" for menor que a quantidade de alunos digitados digite a nota
        for(int i = 0; i < qtd ;i++)
        {
        System.out.println("Digite a primeira nota do aluno " );
        double nota1 = Double.parseDouble(sc.nextLine());
        System.out.println("Digite a segunda nota do aluno " );
        double nota2 = Double.parseDouble(sc.nextLine());
        System.out.println("Digite a terceira nota do aluno " );
        double nota3 = Double.parseDouble(sc.nextLine());
        System.out.println("Digite a quarta nota do aluno " );
        double nota4 = Double.parseDouble(sc.nextLine());
        
        //Set de nota no array
        nota = new double[4];
        nota[0]=nota1; nota[1]=nota2; nota[2]=nota3; nota[3]=nota4;
        tur[i].setNota(nota);

        //Listagem de notas digitadas
             for (int j=0;j<4;j++){
                  System.out.println("nota ["+j+"]="+ nota[j]);
                }
         //realiza o calculo da media
         System.out.println("Media = " + tur[i].mediaSala());
        }

        //Verifica qual é a menor e maior media
        double minimo = 99;
        double maximo = 0;
        for (int i = 0 ; i < tur.length; i++) {
            
            double media = tur[i].mediaSala();
          
            if (media > maximo) {
                    maximo = media;
             }
             if (media < minimo) {
                     minimo = media;
              }
            
            }
            System.out.println("A menor media é: " + minimo);
            System.out.println("A maior media é: " + maximo);


        //realiza a soma listando as notas
        double soma = 0;
             for (turma a: tur){
                soma += (a.mediaSala());
             }
        
        System.out.println("------------------------------");
         //Realiza o calculo da media pegando o valor da soma das medias atraves da lista    
        System.out.println("Media Geral = " + soma/qtd);
        System.out.println("------------------------------");

    }
}
