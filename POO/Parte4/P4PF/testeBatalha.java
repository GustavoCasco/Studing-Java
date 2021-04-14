package POO.Parte4.P4PF;

public class testeBatalha {

	public static void main(String[] args) {
		naviomarcante navioMercante = new naviomarcante("titanic", 2000, 3000, 1500);
		navioMercante.carregamento(20000);
		System.out.println("----------------------------------------------------------------");
		cruzador cruzador = new cruzador("Moskva", 80, 5, 7, 6);
		cruzador.exbirarma();
		System.out.println("----------------------------------------------------------------");
		portaaviao p = new portaaviao("ms", 200, 6, 10, 777);
		p.exbirarma();




	}

}
