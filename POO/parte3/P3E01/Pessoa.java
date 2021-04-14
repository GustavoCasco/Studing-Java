package POO.parte3.P3E01;

public class Pessoa {
    private int id;
    private String nomePessoa;
    private double alturaPessoa;

    public Pessoa(int id, String nomePessoa, double alturaPessoa) {
        this.id = id;
        this.nomePessoa = nomePessoa;
        this.alturaPessoa = alturaPessoa;
    }
    
    public static double mediaAltura(double [] altura){
        double soma = 0;
        for (int i = 0; i < altura.length; i++) {
            soma += altura[i];
        }
        return soma / altura.length;
    }
    
    public static double tratarDados(Pessoa[] a1) {
        double soma = 0;
        for (int i = 0; i < a1.length; i++) {
            soma += a1[i].getAlturaPessoa() ;
        }
        return soma / a1.length;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public double getAlturaPessoa() {
        return alturaPessoa;
    }
}
