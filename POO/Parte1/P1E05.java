package POO.Parte1;
public class P1E05 {
    public static void main(String [] args) {
        
        double dp= 5.5, 
        dg=10,
        pp = 1.5,
        pm, 
        pg = 2.5,
        qtdLitros;

        pm =(pp+pg)/2;
        qtdLitros = dg*dp*pm*785;

        System.out.println("A quantidade de litro para encher essa piscina é de: " + qtdLitros);

    }
}
