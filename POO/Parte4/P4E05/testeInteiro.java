package POO.Parte4.P4E05;
import java.util.*;
public class testeInteiro {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
		int numero;
		boolean sentinela = false;
		do {
			try {
				System.out.println("Digite um numero inteiro:");
				numero = sc.nextInt();
				System.out.println("Voce digitou " + numero);
				sentinela = true;
			} catch(Exception e) {
				System.out.println("Este nao é um inteiro ");
				sc.nextLine();
			}
		}while(sentinela == false);
    }
}
