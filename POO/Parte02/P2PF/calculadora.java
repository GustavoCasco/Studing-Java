package POO.Parte02.P2PF;

public class calculadora {
   private double memoria = 0;

   public double getMemoria (){
       return this.memoria;
    }

   public void somar (double valor){
      memoria = memoria + valor;
    }
   
    public void subtrair (double valor){
        memoria = memoria - valor;
    }

    
    public void multiplica (double valor){
        memoria = memoria * valor;
    }

    public void divisao (double valor){
        memoria = memoria / valor;
    }
}   
