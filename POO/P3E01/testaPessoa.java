package POO.P3E01;

import java.util.ArrayList;

public class testaPessoa {
    public static void main(String [] args) {
        
        Pessoa p1 = new Pessoa(323, "Guilherme", 1.87);
        
        Pessoa [] a1 = new Pessoa [5];
        
        a1[0] = p1;
        
        Pessoa p2 = new Pessoa(521, "Fabio", 1.74);
        a1[1] = p2;
        
        Pessoa p3 = new Pessoa(554, "Leandro", 2.01);
        a1[2] = p3;
        
        Pessoa p4 = new Pessoa(432, "Gustavo", 1.78);
        a1[3] = p4;
        
        Pessoa p5 = new Pessoa(242, "João", 1.95);
        a1[4] = p5;
        
        //Pessoa.tratarDados(a1);
        System.out.println(Pessoa.tratarDados(a1));
        
        ArrayList myArray = new ArrayList();
        myArray.add("A");
    }
}
