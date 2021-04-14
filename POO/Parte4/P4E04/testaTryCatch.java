package POO.Parte4.P4E04;

public class testaTryCatch {
    
	public static void main(String [] args) {
		System.out.println("Inicio do Main");
		metodoA();
		System.out.println("Termino do Main");
	}
	
	public static void metodoA() {
		System.out.println("Inicio do MetodoA");
		try {
			metodoB();
		}
		catch(Exception e) {
			System.out.println("Erro capturado..: "+ e);
		}
		System.out.println("Termino do MetodoA");
	}
	public static void metodoB() {
		System.out.println("Inicio do MetodoB");
		metodoC();
		System.out.println("Termino do MetodoB");
	}
	public static void metodoC() {
		System.out.println("Inicio do MetodoC");
		metodoD();
		System.out.println("Termino do MetodoC");
	}
	public static void metodoD() {
		System.out.println("Inicio do MetodoD");
		int x = 0/0;
		System.out.println("Termino do MetodoD");
	}
}