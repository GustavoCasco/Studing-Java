package POO.megaSena;

public class testaBolao {

    public static void main(String [] args) {
            megaSena b = new megaSena(10, 6);
            b.imprimeBolao();
            Integer [] resultado = {12,17,20,23,10,54}; 
            b.confereBolao(resultado);
            b.imprimeResultado();
    }  
}
