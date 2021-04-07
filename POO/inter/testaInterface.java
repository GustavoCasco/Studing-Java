package POO.inter;

public class testaInterface {
    public static void main(String [] args) {
        figura q = new quadrado(10.0);
        figura t = new triangulo(10.0);

        mostrador get = new mostrador();

        System.out.println("-------------------------");
        get.getNome(q);
        get.getLado(q);
        get.calculoPerimetro(q);
        get.calculoArea(q);
        System.out.println("-------------------------");
        get.getNome(t);
        get.getLado(t);
        get.calculoPerimetro(t);
        get.calculoArea(t);
    }
}
