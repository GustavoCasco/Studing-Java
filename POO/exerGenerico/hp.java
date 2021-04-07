package POO.exerGenerico;

public class hp {
    public static void main(String [] args) {
        calculadora hp1 = new calculadora();

        System.out.println(hp1.soma(3, 6));
        System.out.println(hp1.soma(2L, 3L));
        System.out.println(hp1.soma(2.5, 3.8));
    }
}
