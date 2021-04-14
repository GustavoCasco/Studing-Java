package POO.Parte02.P2E02;
import java.util.Scanner;

public class P2E02 {
    public static void main(String [] args) {

        triangulo trian = new triangulo();
        circulo circ = new circulo();

        Scanner lerTeclado = new Scanner(System.in);

        System.out.println("Digite a altura do triangulo: ");
        double altura = Double.parseDouble(lerTeclado.nextLine());

        System.out.println("Digite a base do triangulo: ");
        Double base = Double.parseDouble(lerTeclado.nextLine());

        System.out.println("Digite o raio do circulo: ");
        double raio = Double.parseDouble(lerTeclado.nextLine());

        trian.calcularArea(base, altura);
        trian.calculaPerimetro(base, altura);
        circ.calcularAreaC(raio);
        circ.calcularPerimetroC(raio);

        System.out.println("A area do triangulo é: " + trian.getArea());
        System.out.println("O perimetro do triangulo é: " + trian.getPerimetro());
        System.out.println("A area do circulo é: " + circ.getAre());
        System.out.println("O perimetro do triangulo é: " + circ.getPeri());
        
    }
}
