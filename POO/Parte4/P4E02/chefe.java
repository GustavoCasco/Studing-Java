package POO.Parte4.P4E02;

public class chefe extends funcionario{
    
    protected double conta;
    protected double gastoExtra;
    protected double adicionalChefia;
    
    public chefe (double conta, double gastoExtra, double adicionalChefe, double salario, String nome, String rg)
    {
        super(nome, rg, salario);
        this.conta = conta;
        this.gastoExtra = gastoExtra;
        this.adicionalChefia = adicionalChefe;
    }

    public double pagamentoExtra()
    {
        return super.pagamento() + conta + gastoExtra + adicionalChefia;
    }
}
