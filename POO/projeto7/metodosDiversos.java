package POO.projeto7;

public class metodosDiversos {
    public int mes;

    

    public static int diasdomes (int mes, boolean bissexto)
    {
        int diam = -1;
        switch(mes)
        {
            case 1: 
            case 3: 
            case 5:
            case 7: 
            case 8: 
            case 10:
            case 12: 
                diam = 31;
            break;
            case 4:
            case 6: 
            case 9:
            case 11:
                diam = 30;
            break;
            case 2: 
                if (bissexto) {
                    diam = 29;
                }else {
                    diam = 28;
            }
        }
        return diam;
    }

    public static String textoMes(int mes) {
        String texto = "";
        switch (mes) {
            case 1:
            texto = "Janeiro";
                break;

            case 2:
            texto = "Fevereiro";
                break;

            case 3:
                texto = "Março";
                    break;   

            case  4 : 
                texto="Abril";
                break;
            
            case 5: 
                texto="Maio";
                break;

            case 6: 
                texto="Junho";
                break;

            case 7: 
                texto="Julho";
                break;

            case 8: 
                texto="Agosto";
                break;

            case 9: 
                texto="Setembro";
                break;

            case 10: 
                texto="Outubro";
                break;

            case 11: 
                texto="Novembro";
                break;

            case 12: 
                texto="Dezembro";
                break;
            default:
                texto="Mes ivalido";
                break;
        }
        return texto;
    }

    public static String textoSemana (int dia)
    {
        String diasemana = "";

        switch(dia)
        {
            case 1:
                diasemana = "Segunda-feira";
                break;
            
            case 2: 
                diasemana = "Terça-feira";
                break;

            case 3:
                diasemana = "Quarta-feira";
                break;
            
            case 4:
                diasemana = "Quinta-feira";
                break;
            
            case 5:
                diasemana = "Sexta-Feira";
                break;

            case 6:
                diasemana = "Sabado";
                break;

            case 7:
                diasemana ="Domingo";
                break;
            default:
            diasemana = "Dia da semana invalido";
            break;
        }
        return diasemana;
    }

    public static char notaConceito(int nota)
    {
        char nconceito = 0;
        switch (nota/20) {
            case 0:  
                    nconceito = 'F';
                break;
            case 1:
                    nconceito = 'E';
                break;
            case 2: 
                nconceito = 'D';
            break;

            case 3:  
                nconceito = 'C';
            break;

            case 4: 
                nconceito = 'B';
            break;

            case 5: 
                nconceito = 'A';
            break;

            default:
                nconceito = 'Z';
                break;
        }
        return nconceito;
    }



}
