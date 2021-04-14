package POO.Parte02.P2PF;
import java.util.Scanner;

public class minhaCalculadora {
    public static void main( String [] args) {
        Scanner lerTeclado = new Scanner(System.in);

        calculadora cal = new calculadora();

        System.out.println("Digite o numero para acontecer a soma: ");
        cal.somar(Double.parseDouble(lerTeclado.nextLine()));
        
        System.out.println(cal.getMemoria());

        System.out.println("Digite o numero para acontecer a subtração: ");
        cal.subtrair(Double.parseDouble(lerTeclado.nextLine()));
        
        System.out.println(cal.getMemoria());
        
        System.out.println("Digite o numero para acontecer a multiplicação: ");
        cal.multiplica(Double.parseDouble(lerTeclado.nextLine()));
        
        System.out.println(cal.getMemoria());

        System.out.println("Digite o numero para acontecer a divisao: ");
        cal.divisao(Double.parseDouble(lerTeclado.nextLine()));
        
        System.out.println(cal.getMemoria());
    }
}
