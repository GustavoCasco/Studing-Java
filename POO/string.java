package POO;
public class string {
    public static void main(String []args)
    {
        //Operando string e contatenação
        String nome = "Gustavo";
        String sobreNome = "Casco";
        String nomeCompleto = nome + " " + sobreNome;
        System.out.println("Nome completo é: " + nomeCompleto);

        //Tipo de string "Equals" que se serve como comparação
        String senha = "1234Casco";
        String confirmaSenha = "1234Casco";
        System.out.println(senha.equals(confirmaSenha));

        //Tipo de string "Length" que se serve para ver o tamnanho da string
        String a1 = "Hebert Richard";
        System.out.println(a1.length());

        //Tipo string "trim" que serve para retirar os espaços em branco
        String abacate = "     abacate  ";
        System.out.println(abacate);
        System.out.println(abacate.trim().toUpperCase().substring(3 , 5));

        //Tipo string "toLowerCase" e toUpperCase que serve para deixar a frase recebida toda em minusculo ou deixar a frase toda maiuscula
        String mai = "NeLSiNHo sIlVa";
        System.out.println(mai);
        System.out.println(mai.toLowerCase());
        System.out.println(mai.toUpperCase());
        System.out.println(+3 + "java" + +5);
        
    }
}
