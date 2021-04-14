package POO.Parte02.P2E01;
import java.util.Scanner;

public class folhaSalarial {
    public static void main(String [] args) {
        Scanner lerteclado = new Scanner(System.in);

        System.out.println("Digite o codigo do funcionario");
        int cod = Integer.parseInt(lerteclado.nextLine());

        System.out.println("Digite o nome do funcionario");
        String nome = lerteclado.nextLine();

        System.out.println("Digite o salario mensal do funcionario");
        double salarioAtual = Double.parseDouble(lerteclado.nextLine());

        System.out.println("Digite a porcentagem de aumento para esse funcionario");
        int porce = Integer.parseInt(lerteclado.nextLine());

        funcionario func = new funcionario();
        func.funci(cod, nome);
        func.salarioAno(salarioAtual);
        double sa = func.getSalarioa();
        func.aumentoSlarial(sa, porce);
        
        System.out.println("O salario mensal desse funcionario era de: " + salarioAtual);
        System.out.println("O salario Anual desse funcionario era de: " + func.getSalarioa());
        System.out.printf("O salario Anual desse funcionario com o ajuste é de: " + func.getSalario());      
    }
}
