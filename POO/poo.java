package POO;
public class poo {
    private int idCliente;
    private String nomeCliente;
    private String cpfCliente;
    private double limiteCliente;

    //metodo get

    public int getidCliente(){
        return this.idCliente;
    }

    public String getnomeCliente(){
        return this.nomeCliente;
    }

    public String getcpfCliente(){
        return this.cpfCliente;
    }
    public double getlimeteCliente(){
        return this.limiteCliente;
    }


    //metodo set
    public void setidCliente(int idcliente){
        this.idCliente = idcliente;
    }
    public void setNomeCliente(String nome){
        this.nomeCliente = nome;
    }
    public void setCpfCliente(String cpf){
        this.cpfCliente = cpf;
    }
    public void setLimiteCliente(double limiteCliente){
        this.limiteCliente = limiteCliente;
    }
        

    public static void main(String [] args) {
        poo cliente = new poo();

        cliente.setidCliente(1);
        cliente.setNomeCliente("Gustavo Casco");
        cliente.setCpfCliente("12512541523");
        cliente.setLimiteCliente(500);

        System.out.println("O nome do cliente de id " + cliente.idCliente +  " é: " + cliente.nomeCliente);
    }
}
