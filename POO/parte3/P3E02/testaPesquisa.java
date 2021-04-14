package POO.parte3.P3E02;

import java.util.ArrayList;
import java.util.Scanner;

public class testaPesquisa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		ArrayList<Pesquisa> pesquisas = new ArrayList();
		char sexo;
		char resposta;
		
		System.out.println("Informe os dados da pesquisa");
		for (int i=0; i < 2; i++) {
			System.out.print("Sexo..: ");
			sexo = sc.nextLine().toUpperCase().charAt(0);
			System.out.println("O menino Ney merece qual nota? ");
			System.out.print("Sua resposta (S / N)..: ");
			resposta = sc.nextLine().toUpperCase().charAt(0);
			
			pesquisas.add(new Pesquisa(sexo, resposta));		
		}
		
		System.out.println("Quantidade de homens que responderam sim");
		System.out.println("Qtde..: " + Pesquisa.qtdeHomemSim(pesquisas));
		
		System.out.println("Quantidade de mulheres que responderam não");
		System.out.println("Qtde..: " + Pesquisa.qtdeMulherNao(pesquisas));
		
		System.out.println("Percentual de homens que responderam sim");
		System.out.println("Porc. (%)..: " + Pesquisa.percHomemSim(pesquisas));
		
		System.out.println("Percentual de mulheres que responderam nao");
		System.out.println("Porc. (%)..: " + Pesquisa.percMulherNao(pesquisas));
		
		
		sc.close();
		
	}

}