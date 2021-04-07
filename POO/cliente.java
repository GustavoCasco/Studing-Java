package POO;
public class cliente {

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
}