package POO.Parte02.P2E04;
import java.util.Scanner;

public class minhaFaculdade {
    public static void main(String []args) {

        //Ler o que o usuario vai digitar
        System.out.println("Digite o id do aluno: ");
        Scanner lerTeclado = new Scanner(System.in);
        int idAlu = Integer.parseInt(lerTeclado.nextLine());

        System.out.println("Digite o nome do aluno: ");
        Scanner nomeAlu = new Scanner(System.in);
        String nomeAlu1 = nomeAlu.nextLine();

        System.out.println("Digite o id da Disciplina: ");
        Scanner lerTeclado1 = new Scanner(System.in);
        int idDisc = Integer.parseInt(lerTeclado1.nextLine());

        System.out.println("Digite o nome da Disciplina: ");
        Scanner nomeDis = new Scanner(System.in);
        String nomeDis1 = nomeDis.nextLine();

        System.out.println("Digite a primeira nota do aluno: ");
        Scanner lerTeclado2 = new Scanner(System.in);
        double nota1 = Double.parseDouble(lerTeclado2.nextLine());

        System.out.println("Digite a segunda nota do aluno: ");
        Scanner lerTeclado3 = new Scanner(System.in);
        double nota2 = Double.parseDouble(lerTeclado3.nextLine());
        
        //Instanciando o objeto
        alunoDisciplina aluno = new alunoDisciplina();
        aluno.exibeAlunoDisciplina(idDisc,nomeDis1, idAlu, nomeAlu1);
        double media = aluno.mediaAritmetica(nota1, nota2);
        double mediaP = aluno.mediaPonderada(nota1, nota2);

        //Mostrando na tela os valores
        System.out.println("O nome do aluno com o id "+ aluno.getIdAluno() + " é: "+ aluno.getnomeAluno());
        System.out.println("Na materia de "+ aluno.getNomeDisciplina() + " (id: "+ aluno.getIdDisciplina()+")"+ " teve a media aritmetica de: "+
        media + " e ficou com a media ponderada: " + mediaP);
    }
}
