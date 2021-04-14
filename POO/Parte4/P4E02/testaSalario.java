package POO.Parte4.P4E02;

public class testaSalario {

    public static void main(String [] args) {
        funcionario fun = new funcionario("gustavo", "1474114714", 2000.00);
        fun.aumento(4000);
        System.out.println("---------------------------------------------");
        System.out.println("----------- Pagamento funcionario -----------");
        System.out.println("---------------------------------------------");
        System.out.println("O seu novo salario é de: " + fun.getAumento());
        System.out.println("O seu pagamento é de: " + fun.pagamento());

        chefe che = new chefe(20, 100, 2000, 2000, "hae", "151515");
        che.aumento(2000);
        System.out.println("---------------------------------------------");
        System.out.println("----------- Pagamento Chefe ------------------");
        System.out.println("---------------------------------------------");
        System.out.println("O seu novo salario é de: " + che.getAumento());
        System.out.println("O seu pagamento é de: " + che.pagamento());
        System.out.println("O total de pagamento a receber junto com os adicionais é de: " + che.pagamentoExtra());
    }

}
