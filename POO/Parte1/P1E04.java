package POO.Parte1;
public class P1E04 {
    public static void main(String [] args) {
        double passaram,
        faltam, 
        hora = 10,
        minuto = 10,
        segundos = 10;

        passaram = hora * 3600 + minuto * 60 + segundos;
        faltam = 86400 - passaram;

        System.out.println("Desde a meia noite se passaram: " + passaram);
        System.out.println("Para chegar na proxima meia noite faltam: " + faltam);
    }
}
