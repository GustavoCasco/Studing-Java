package POO;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class aulatry {

    public static void main(String [] args) {
        
        long mili = 999295280045L;
        Date agora = new Date();
        Date data = new Date(mili);
        String meuNiver = "31/08/2001";

        SimpleDateFormat form = new SimpleDateFormat("'O dia da semana é:' E 'a hora atual é:' hh:mm:ss 'e o data é:' dd.MM.yyyy");
        System.out.println(form.format(agora));

        //convertendo String para Date;
        SimpleDateFormat ter = new SimpleDateFormat("dd/MM/yyyy");
        Date dete;
        try {
            dete = ter.parse(meuNiver);
            System.out.println("O meu aniversario é: " + dete );

        } catch (ParseException e) {
           System.out.println("o erro aconteceu " + e.getMessage());
        }

    }
}
