package POO.Parte02.P2E01;

public class funcionario {

        private int idFuncionario;
        private String nomeFuncionario;
        private double salarioMensal;
        private double salarioAnual;
        private double percento;
        private double salarionovo;

        public double getSalario () {
            return this.salarionovo;
        }

        public double getSalarioa () {
            return this.salarioAnual;
        }

        public double salarioAno(double salarioMensal)
        {
            this.salarioMensal = salarioMensal;
            return salarioAnual = salarioMensal*12;
        }

        public double aumentoSlarial (double salarioAnual, double percento)
        {
            this.salarioAnual = salarioAnual;
            this.percento = percento;
            return salarionovo = salarioAnual*(1 + percento/100);
        }

        public void funci (int id, String nome)
        {
            this.idFuncionario = id;
            this.nomeFuncionario = nome;
        }
}
