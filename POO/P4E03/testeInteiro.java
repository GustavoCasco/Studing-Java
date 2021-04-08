package POO.P4E03;
import java.util.*;
public class testeInteiro {
    public static void main(String [] args) {
        try {
            Scanner sc = new Scanner(System.in);
                System.out.println("Digite um numero inteiro");
                Character numero = sc.nextLine().charAt(0);

                if (numero == (int)numero) {
                    System.out.println("Esse numero é inteiro");
                }else{
                    System.out.println("Esse numero nao é inteiro");
                }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
