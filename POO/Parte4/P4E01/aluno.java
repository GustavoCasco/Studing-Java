package POO.Parte4.P4E01;

import java.util.Date;

public class aluno extends pessoa{
        private String matricula;
        private double calculo;

        public aluno(String matricula, String cpf, String nome, Date dataNascimento)
        {
            super(nome,cpf,dataNascimento);
            this.matricula = matricula;
        }

        public String getNome()
        {
            return nome;
        }

        public double getTirarCopias()
        {
            return calculo;
        }

        public double tirarCopias(int qtd)
        {
            
            return calculo = qtd * 0.07;
        }
}
