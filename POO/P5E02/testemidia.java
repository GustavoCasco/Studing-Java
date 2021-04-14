package POO.P5E02;

public class testemidia {
    public static void main(String [] args) {
        midia m  = new midia();
        m.inserirDados();
        m.printDados();

        dvd d = new dvd();
        d.inserirDados();
        d.printDados();

        cd cd = new cd();
        cd.inserirDados();
        cd.printDados();
    }
}
