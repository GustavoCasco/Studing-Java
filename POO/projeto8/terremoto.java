package POO.projeto8;

public class terremoto {
    private static int numSequencial;
    private int idTerremoto;
    private int ano ;
    private double intensidade ;
    private coordenadageografica  latitude;
    private coordenadageografica  longitude;
    
    public void terremoto()
    {
        numSequencial++;
        idTerremoto = numSequencial;
        latitude = new coordenadageografica();
        longitude = new coordenadageografica();
    }

    private String getTextoIntensidade ()
    { 
        String texto ="";
       if (intensidade >= 8) {
           texto = "A maioria das estruturas caem";
       }else if ((intensidade >= 7) && (intensidade < 8))
       {
          texto = "Muitos edificios são destruidos";
       }else if((intensidade >=6)&&(intensidade<7))
       {
       texto = "Muitos edificios são consideravelmente denificados, alguns caem";
       }else if ((intensidade>=4.5)&&(intensidade <6)) {
        texto = "Dano a edificios mal construidos";
       } else if ((intensidade >= 3.5)&&(intensidade <4.5))
       {
        texto = "Sentido por muitas pessoas, sem destruição";
       } else if ((intensidade >= 0)&&(intensidade <3.5))
       {
        texto = "Geralmente não sentido por pessoas";
       }else {
        texto = "Numeros negativos não são validos";    
       }
       return texto;
    }

    public double distanciaEntreTerremotos(terremoto t)
    {
        if (this == t) {
            System.out.println("Terremoto invalido");
        }else if( t == null) {
            System.out.println("Terremoto invalido");
        } 

        double latitude1 = latitude.getCoordenadaRadiano();
        double latitude2 = t.latitude.getCoordenadaRadiano();
        double longitude1 = longitude.getCoordenadaRadiano();
        double longitude2 = t.longitude.getCoordenadaRadiano();
        double d = Math.abs(longitude1 - longitude2);

        double cDis = Math.sin(latitude1) * Math.sin(latitude2) + Math.cos(latitude1) 
        + Math.cos(latitude2) * Math.cos(d);
        double distancia = Math.acos(cDis)*6400;

        return distancia;
    }

    public double diferencaEntreTerremotos(terremoto t)
    {
        if (this == t) {
            System.out.println("Terremoto invalido");
        }else if( t == null) {
            System.out.println("Terremoto invalido");
        }
        return Math.abs(this.ano - t.ano);
    }
}   
