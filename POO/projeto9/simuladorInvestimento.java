package POO.projeto9;
import java.util.Scanner;
public class simuladorInvestimento {

    public static void main(String [] args) {
        Scanner sc =  new Scanner(System.in);
        
        System.out.println("Digite o saldo inicial: ");
        double saldo = Double.parseDouble(sc.nextLine());
        
        System.out.println("Digite o taxa inicial: ");
        double taxa = Double.parseDouble(sc.nextLine());
        
        System.out.println("Multiplicar saldo inicial por: ");
        double multi = Double.parseDouble(sc.nextLine());
        investimento invest = new investimento(saldo, taxa);
        

        invest.tempoParaSaldo(multi * saldo);


        System.out.println("=======================================");
        System.out.println("       Simulador de investimento       ");
        System.out.println("=======================================");
        System.out.println("             investimento 1            ");
        System.out.println("Saldo Inicial......: " + saldo);
        System.out.println("Taxa anual......: " + invest.getTaxa());
        System.out.println("Multiplicar saldo inicial por.....: " + multi);
        System.out.println("O saldo inicial multiplicará por " + multi + " após " + invest.getAnos()+" anos");
        

        System.out.println("=======================================");
        System.out.println("     Agora vamos calcular os anos      ");
        System.out.println("=======================================");

        System.out.println("Digite o saldo inicial: ");
        double saldo1 = Double.parseDouble(sc.nextLine());
        
        System.out.println("Digite o taxa inicial: ");
        double taxa1 = Double.parseDouble(sc.nextLine());
        
        System.out.println("Informe anos para investir: ");
        int ano = Integer.parseInt(sc.nextLine());
        investimento invest2 = new investimento(saldo1, taxa1);

        invest2.investirTempo(ano);

        System.out.println("=======================================");
        System.out.println("       Simulador de investimento       ");
        System.out.println("=======================================");
        System.out.println("             investimento 2            ");
        System.out.println("Saldo Inicial......: " + saldo);
        System.out.println("Taxa anual......: " + taxa1);
        System.out.println("Anos para investir.....: " + ano);
        System.out.println("O saldo após " + ano + " será de R$ " + invest2.getSaldo());



    }

}
