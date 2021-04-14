package POO.Parte4.P4E01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class testaImpressao {
    public static void main(String [] args) {
        try {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = formato.parse("31/11/2002");

        SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        Date dataAdmissao = formato1.parse("15/03/2021");

        aluno al = new aluno("123", "12345678998", "Hebert", dataNascimento);
        al.tirarCopias(100);
        System.out.println(String.format("O valor de copias para alunos é de: R$ "+"%.2f", al.getTirarCopias()));

        professor prof = new professor(1000.00, "C#", "JOAO", "12354774189", dataNascimento);
        prof.tirarCopias(100);
        System.out.println(String.format("O valor de copias para professor é de: R$ "+"%.2f", prof.getTirarCopiar()));
        
        funcionario funci = new funcionario(6000.00, "Gustavo", "33647898741", dataNascimento, dataAdmissao, "Programados");
        funci.tirarCopias(200);
        System.out.println(String.format("O valor de copias para funcionario é de: R$ "+"%.2f", funci.getTirarCopiar()));

        pessoa people = new pessoa("hs", "1145221454", dataNascimento);
        people.tirarCopias(300);
        // System.out.println("O valor de copias para essa pessoa é de: R$ "+);

        } catch (Exception e) {
            System.out.println(e);
        } 
        
    }
}
