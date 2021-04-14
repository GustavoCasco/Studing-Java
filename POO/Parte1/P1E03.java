package POO.Parte1;
public class P1E03 {
    public static void main (String [] args)
    {
        double c = 23,
        f,
        k, 
        ra,
        re;

        f = c*1.8 + 32;
        k = c + 273.15;
        re = c* 1.8 + 32+459.67;
        ra = c*0.8;

        System.out.println("A temperatura de celsius informada convertida em fahrenheit é:  " + f);
        System.out.println("A temperatura de celsius informada convertida em Kelvin é:  " + k);
        System.out.println("A temperatura de celsius informada convertida em Réaumur é:  " + re);
        System.out.printf("A temperatura de celsius informada convertida em Rankine é: " + ra);
    }
}
