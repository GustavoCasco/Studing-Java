package POO.polimorfismo;

public class vaca extends aulaAbstract {
        public vaca(int id, String especie, String nome)
        {
            super(id, especie, nome);
        }

        public void som(){
            System.out.println("Muuuuuhhhhhhhh !!!!");
        }
}
