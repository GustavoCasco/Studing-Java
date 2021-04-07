package POO.projeto8;

public class coordenadageografica {
    private int grau;
    private int minuto;
    private int segundo;

    public double getCoordenadaDecimal( )
    {
        return grau + (1/60)*minuto + (1/3600)*segundo;
    }
    
    public double getCoordenadaRadiano()
    {
        return getCoordenadaDecimal()*(2*Math.PI/360);
    }
    
    
}
