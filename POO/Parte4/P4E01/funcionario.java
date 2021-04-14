package POO.Parte4.P4E01;

import java.util.Date;

public class funcionario extends pessoa{
    private double salario;
    private Date dataAdmissao;
    private String cargo;

    public funcionario (double salario, String nome, String cpf, Date dataNascimento, Date dataAD, String cargo)
    {
        super(nome,cpf,dataNascimento);      
        this.dataAdmissao = dataAD;
        this.salario = salario;
        this.cargo = cargo;
    }
}
