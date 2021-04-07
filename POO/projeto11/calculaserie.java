package POO.projeto11;
import java.util.Scanner;

public class calculaserie {
    public static void main(String [] args) {
        Scanner lerTeclado = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de parcela");
        int parcela = Integer.parseInt(lerTeclado.nextLine());

        series soma = new series();
        soma.serie1(parcela);
        series soma1 = new series();
        soma1.serie2(parcela);
        System.out.println(soma.getSoma());
        System.out.println(soma1.getMulti());

    }
}
