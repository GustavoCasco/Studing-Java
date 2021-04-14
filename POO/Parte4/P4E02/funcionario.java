package POO.Parte4.P4E02;

public class funcionario {

    protected String nome;
    protected String rg;
    protected Double salarioMensal;
    protected double au;
    protected double pag;

    public funcionario (String nome, String rg, Double salario)
    {
        nome = nome;
        rg = rg;
        salarioMensal = salario;
    }

    public double getAumento()
    {
        return salarioMensal;
    }
    public double getPagamento()
    {
        return pag;
    }

    public void aumento(double valor)
    {
       au = salarioMensal + valor; 
       salarioMensal = au;
    }

    public final double pagamento()
    {
       return pag = salarioMensal * 0.85;
    }
    
}
