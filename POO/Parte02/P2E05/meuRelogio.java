package POO.Parte02.P2E05;
import java.util.Scanner;

public class meuRelogio {
    public static void main(String [] args) {
        Scanner lerTeclado = new Scanner(System.in);

        System.out.println("Digite a hora entre 00 a 23");
        int hor = Integer.parseInt(lerTeclado.nextLine());

        System.out.println("Digite o minuto entre 00 a 59");
        int minut = Integer.parseInt(lerTeclado.nextLine());

        System.out.println("Digite o segundo entre 00 a 59");
        int segun = Integer.parseInt(lerTeclado.nextLine());

        relogio horario = new relogio(hor, minut, segun);
        System.out.println("Horario: " + horario.getHorario());

        System.out.println("Informe quantos segundos deseja adiantar");
        horario.adiantar(Integer.parseInt(lerTeclado.nextLine()));
        System.out.println("Horario: " + horario.getHorario());
        
        System.out.println("Informe quantos segundos deseja atrasar");
        horario.atrasar(Integer.parseInt(lerTeclado.nextLine()));
        System.out.println("Horario: " + horario.getHorario());

    }
}
