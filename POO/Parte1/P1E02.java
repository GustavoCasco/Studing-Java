package POO.Parte1;
public class P1E02 {
    public static void main(String [] args) {
            int q2 = 100,
            q3 = 100,
            q4 = 100, 
            q5 = 100, 
            q6 = 100;
       
            double q1 = 100,
            dolar = 3.307,
            r;

            r = (q1 + 0.5*q2 + 0.25*q3 + 0.1*q4 + 0.05*q5 + 0.01*q6) * dolar;

            System.out.println("O valor total do cofrinho foi: " + r);
    }
}
