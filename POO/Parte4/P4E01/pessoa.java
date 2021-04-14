package POO.Parte4.P4E01;

import java.util.Date;

public class pessoa {
        protected String nome;
        protected String cpf;
        protected Date dataNascimento;
        private double calculo;

        public pessoa (String nome, String cpf, Date dataNascimento){
            this.nome = nome;
            this.cpf = cpf;
            this.dataNascimento = dataNascimento;
        }

        public double getTirarCopiar()
        {
            return calculo;
        }

        public double tirarCopias(int qtd)
        {
            return calculo = qtd * 0.10;
        }
}
