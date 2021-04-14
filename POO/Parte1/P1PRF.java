package POO.Parte1;
public class P1PRF {
    public static void main(String [] args) {

        //Declaração de variaveis do tipo inteiro porque o desejo é retornar numero inteiro
        int a, b, c, d, e, f, g, h, i , j , k, l, mes, dia;
        int ano = 2021; 

        //Formula de calcular o dia da pascoa para o ano estipulado 
        a = ano % 19;
        b = ano / 100;
        c = ano % 100;
        d = b / 4;
        e = b % 4;
        f = (b + 8) / 25;
        g = (b - f + 1) / 3;
        h = (19 * a + b - d - g + 15) % 30;
        i = c / 4;
        j = c % 4;
        k = (32 + 2 * e + 2 * i - h - j ) % 7;
        l = (a + 11 * h + 22 * k) / 451;
        mes = (h + k - 7 * l + 114) / 31;
        dia = ((h + k - 7 * l + 114) %31) + 1;

        System.out.println("A data da páscoa para o ano de " + ano + " é: " + dia + "/" + mes);
    }
}
