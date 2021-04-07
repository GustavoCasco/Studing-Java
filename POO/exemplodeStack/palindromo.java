package POO.exemplodeStack;
import java.util.Stack;

import org.w3c.dom.Text;

public class palindromo  {

    private String txt;

    public palindromo(String  a)
    {
        this.txt = a;
    } 

    public boolean palindromo()
    {
        Stack<String> pilha =  new Stack<String>();
        String txtRever;

        for (int i=0; i<txt.length(); i++) {
            pilha.add(txt);
        }

        while (!pilha.empty()) {
            
        }
        return true;
    }
}
