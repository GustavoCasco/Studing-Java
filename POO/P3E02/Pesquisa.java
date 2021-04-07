package POO.P3E02;
import java.util.ArrayList;
public class Pesquisa {

 private static int sequencia = 0;
	private int numPesquisa;
	private char sexo;
	private char resposta;
	
		
	public Pesquisa() {
		this.sequencia ++;
		this.numPesquisa = sequencia;
	}
	
	public Pesquisa(char sexo, char resposta) {
		this.sequencia ++;
		this.numPesquisa = sequencia;
		this.sexo = sexo;
		this.resposta = resposta;
	}


	public int getNumPesquisa() {
		return numPesquisa;
	}

	public void setNumPesquisa(int numPesquisa) {
		this.numPesquisa = numPesquisa;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public char getResposta() {
		return resposta;
	}

	public void setResposta(char resposta) {
		this.resposta = resposta;
	}

	public static int qtdeHomemSim(ArrayList<Pesquisa> pesquisas) {
		int soma = 0;
		
		for (int i = 0; i < pesquisas.size(); i++) {
			if (pesquisas.get(i).getSexo() == 'H' && pesquisas.get(i).getResposta() == 'S') {
				soma ++;
			}
		}
		return soma;
	}
	
	public static int qtdeMulherNao(ArrayList<Pesquisa> pesquisas) {
		int soma = 0;
		
		for (int i = 0; i < pesquisas.size(); i++) {
			if (pesquisas.get(i).getSexo() == 'M' && pesquisas.get(i).getResposta() == 'N') {
				soma ++;
			}
		}
		return soma;
	}
	
	
	public static double percHomemSim(ArrayList<Pesquisa> pesquisas) {
		double perc = 0;
		double qtdeHomem = 0;
		double contador = 0;
		
		for (int i = 0; i < pesquisas.size(); i++) {
			if (pesquisas.get(i).getSexo() == 'H') {
				qtdeHomem ++;
				if (pesquisas.get(i).getResposta() == 'S') {
					contador ++;
				}
			}
		}
		if (qtdeHomem == 0 || contador == 0) {
			return 0.0;
		}
		else {
			 perc = (contador /  qtdeHomem) * 100;		 
			return perc;
		}		
	}
	
	
	public static double percMulherNao(ArrayList<Pesquisa> pesquisas) {
		double perc = 0;
		double qtdeMulher = 0;
		double contador = 0;
		
		for (int i = 0; i < pesquisas.size(); i++) {
			if (pesquisas.get(i).getSexo() == 'M') {
				qtdeMulher ++;
				if (pesquisas.get(i).getResposta() == 'N') {
					contador ++;
				}
			}
		}
		if (qtdeMulher == 0 || contador == 0) {
			return 0.0;
		}
		else {
			perc = (contador /  qtdeMulher) * 100;	 
			return perc;
		}
	}
}
