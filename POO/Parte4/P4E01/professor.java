package POO.Parte4.P4E01;

import java.util.Date;

public class professor extends pessoa {
    private double salario;
    private String disciplinha;

    public professor (double salario, String disciplina, String nome, String cpf, Date dataNascimento)
    {
        super(nome,cpf,dataNascimento);      
        this.disciplinha = disciplina;
        this.salario = salario;
    }
}
