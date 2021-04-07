package POO.projeto7;
import java.util.Scanner;

public class testaMetodosDiversos {
    public static void main(String []args) {
        Scanner lerTeclado = new Scanner(System.in);
        metodosDiversos m = new metodosDiversos();

        System.out.println("Digite o numero do mes que deseja: ");
        int mes = Integer.parseInt(lerTeclado.nextLine());

        System.out.println("Digite o ano que deseja: ");
        int ano = Integer.parseInt(lerTeclado.nextLine());
        boolean biss = (ano % 4 == 0 && ano % 100 != 0 || ano % 400==0 && ano % 3600!= 0);
        int ms = m.diasdomes(mes, biss);
        String mso = m.textoMes(mes);

        System.out.println("Digite o dia da semana que voce quer ou está:");
        int dia = Integer.parseInt(lerTeclado.nextLine());
        String d = m.textoSemana(dia);

        System.out.println("Digite a nota: ");
        char c = lerTeclado.nextLine().charAt(0);
        char n = m.notaConceito(c);

        System.out.println("No mês de " + mso + " tem a quantidade de dias a seguir: " + ms);
        System.out.println("Você está no dia " + dia + " que na semana é " + d);
        System.out.println("A sua nota conceito é " + n);

    }
}
