package POO.projeto11;

public class series {
    public int quantidadeParcela;
    public double soma;
    public double multi = 1;

    public int getParcela ()
    {
        return quantidadeParcela;
    }

    public double getSoma ()
    {
        return soma;
    }

    public double getMulti ()
    {
        return multi;
    }


    public double serie1 (int qtd)
    {
        this.quantidadeParcela = qtd;
        soma = 0;
        for (int i = 0; i <= qtd; i++) {
            soma = soma + i;
        }
        return soma;
    }

    public double serie2 (int qtd1)
    {
        this.quantidadeParcela = qtd1;
    
        for (int i = 1; i <= qtd1; i++) {
            multi = multi * i;
        }
        return multi;
    }

    public double serie3 (int qtd3)
    {
        this.quantidadeParcela = qtd3;
    
        for (int i = 1; i <= qtd3; i++) {
            multi = multi * i;
        }
        return multi;
    }

    // public double serie4 (int qtd3)
    // {
    //     this.quantidadeParcela = qtd3;
    
    //     for (int i = 1; i <= qtd3; i++) {
    //         div = div / i;
    //     }
    //     return multi;
    // }
}
