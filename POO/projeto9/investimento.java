package POO.projeto9;

public class investimento {
    private double saldo;
    private double taxa;
    private int ano;

    public int getAnos()
    {
        return ano;
    }

    public double getTaxa()
    {
        return taxa;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public investimento ( double saldo, double taxa){
        this.saldo = saldo;
        this.taxa = taxa;
        this.ano = 0;
    }

    public void tempoParaSaldo(double saldoDesejado)
    {
      
        while (saldo < saldoDesejado) {
            double juros = saldo * taxa / 100;
            saldo = saldo + juros;
            ano++;
        }
    }

    public void investirTempo(int tempo)
    {
        
        ano = 0;
        while (ano < tempo) {
            double juros = saldo * taxa / 100;
            saldo = saldo + juros;
            ano++;
        }
    }
}
