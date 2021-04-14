package POO.parte3.P3E04;

public class TestaCosseno {
	public static void main(String [] args) {
		Cosseno cos = new Cosseno();
		cos.setX(1.0);
		cos.calculaParcelas();
		cos.somaParcela();
		System.out.println("Cos( " + cos.getX() + " ) = "+ cos.getCosseno());
	}
}