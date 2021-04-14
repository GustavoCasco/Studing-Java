package POO.Parte4.P4E03;
public class TestaVeiculo {
	public static void main(String [] args) {
		Veiculo v = new Veiculo(5);
		
		try {
			v.desacelera(10);
			System.out.println("Velocidade atual = " + v.getVelocidade());
		}
		catch(Exception e) {
			System.out.println("Erro--> " + e);
		}
	}
}