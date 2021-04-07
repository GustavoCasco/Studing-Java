package POO.projeto10;
import java.util.Scanner;

public class estatistica {
        private  double soma; 
        private  double maximo; 
        private  double minimo;
        private int quantidade;

        public double getMedia()
        {
            return soma /quantidade;
        }

        public double getSoma()
        {
            return soma;
        }

        public double getMaximo()
        {
            return maximo;
        }

        public double getMinimo()
        {
            return minimo;
        }

        public double getQuantidade()
        {
            return quantidade;
        }

        public estatistica()
        {
            soma = 0.0;
            quantidade = 0;
        }
        
        
        public void solicitaNumero()
        {   
            Scanner lerTeclado = new Scanner(System.in);
            char respostas = 'n';
            do {
                do {
                    System.out.println("Deseja informa um número ? (s/n) ");
                    respostas = lerTeclado.nextLine().toLowerCase().charAt(0);
                } while (respostas != 's'  && respostas != 'n');
                
                if (respostas == 's') {            
                    System.out.println("Digite um número: ");
                    add(Double.parseDouble(lerTeclado.nextLine()));
                }
            } while (respostas == 's');            
        }

        private void add (double valor)
        {
            
            if (valor == 1 ) {
                valor = maximo;
                maximo = minimo;
            }else if (valor > maximo)
            {
                maximo = valor;
            }else  if (valor < minimo) {
                minimo=valor;
            }
            soma = soma + valor;
            quantidade++;
        }

        public void imprimeEstastica()
        {
        System.out.println("=================================================");
        System.out.println("       Estatistica dos numeros informados        ");
        System.out.println("=================================================");
        System.out.println("Quantidade......: " + getQuantidade());
        System.out.println("Media......: " + getMedia() );
        System.out.println("Maior valor......: " + getMaximo());
        System.out.println("Menor valor......: " + getMinimo());
        System.out.println("=================================================");

            
    }
}
