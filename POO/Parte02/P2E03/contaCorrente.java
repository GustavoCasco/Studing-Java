package POO.Parte02.P2E03;

public class contaCorrente {
    private int numContaCorrente;
    private String nomeCliente;
    private double saldocc = 0.0;
    private double novoSaldo;
    private double novoSaldo1;
    private double valor;


    public double getSaldo ()
    {
        return this.saldocc;
    }

    public double getSaldoNovo ()
    {
        return this.novoSaldo;
    }
    public double getSaldoNovo1()
    {
        return this.novoSaldo1;
    }

    public String getNome()
    {
        return this.nomeCliente;
    }

    public int getConta()
    {
        return this.numContaCorrente;
    }

    public void conta(int num, String nome)
    {
        this.numContaCorrente = num;
        this.nomeCliente = nome;
    }

    public double depositar (double valor, double saldo)
    {
        this.valor = valor;
        return novoSaldo = saldocc + valor;
    }
    
    public double sacar (double valor, double saldo)
    {
        this.valor = valor;
        return novoSaldo1 = novoSaldo - valor;
    }
}
