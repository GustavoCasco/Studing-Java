package POO.polimorfismo;

public class FazendaFeliz {
    //Teste das classes para verificar se o polimorfismo funciona
    public static void main(String [] args) {
       vaca mimosa = new vaca(1, "Bovina", "Mimosa");
       cachorro cao = new cachorro(2 , "labrador", "Rex");
       gato gato = new gato(3 , "Siames", "Rex");
       galinha coco = new galinha(4 , "galo", "Rex");

       //Chamando classe que emite som
       SonsFazenda sons = new SonsFazenda();
       sons.SonsFazenda(mimosa);
       sons.SonsFazenda(cao);
       sons.SonsFazenda(gato);
       sons.SonsFazenda(coco);

    }
}
