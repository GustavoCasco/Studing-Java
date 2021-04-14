package POO.Parte02.P2E02;

public class triangulo {
   private double base;
   private double altura;
   private double area;
   private double perimetro;


   public double getArea (){
          return this.area;
     } 

   public double getPerimetro (){
          return this.perimetro;
     } 

   public double calcularArea (double base, double altura)
     {
        this.base = base;
        this.altura = altura;

        return area = (base*altura)/2;
     }

   public double calculaPerimetro (double base, double altura)
     { 
        this.base = base;
        this.altura = altura;

        return perimetro = base + altura + Math.sqrt(base*base + altura*altura);    
     }
}
