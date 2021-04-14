package POO.Parte02.P2E03;
import java.util.Scanner;

public class P2E03 {
    public static void main(String [] args) {
        
            Scanner lerTeclado = new Scanner(System.in);

            System.out.println("Bem vindo ao cascoBank, para prosseguir digite seu nome: ");
            String nome = lerTeclado.nextLine();

            System.out.println("Agora o numero da sua conta corrente: ");
            int numConta = Integer.parseInt(lerTeclado.nextLine());

            contaCorrente conta = new contaCorrente();
            conta.conta(numConta, nome);

            System.out.println("Olá " + conta.getNome());
            System.out.println("O seu saldo atual é de:  " + conta.getSaldo());
            double saldo = conta.getSaldo();

            System.out.println("Deposite um valor:");
            double deposito = Double.parseDouble(lerTeclado.nextLine());

            conta.depositar(deposito, saldo);

            System.out.println("O seu saldo atual é de:  " + conta.getSaldoNovo());
            double saldoNovo = conta.getSaldoNovo();

            System.out.println("Digite o valor que deseja sacar:");
            double sacar = Double.parseDouble(lerTeclado.nextLine());

            conta.sacar(sacar, saldoNovo);

            System.out.println("O seu saldo atual é de:  " + conta.getSaldoNovo1());
    }
}
