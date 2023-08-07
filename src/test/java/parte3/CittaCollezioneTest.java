package parte3;

import java.util.ArrayList;

public class CittaCollezioneTest {

    public static void main(String[] args) {
        Citta citta1 = new Citta("Maleo", 3000, 20);
        Citta citta2 = new Citta("Pizzighettone", 5000, 50);
        Citta citta3 = new Citta("Codogno", 20000, 120);

        ArrayList<Citta> collezione = new ArrayList<>();
        collezione.add(citta1);
        collezione.add(citta2);
        collezione.add(citta3);

        CittaCollezione cittaCollezione = new CittaCollezione(collezione);

        System.out.println("la media degli abitanti è: " + cittaCollezione.getMediaAbitanti());
        System.out.println("la media della superficie è: " + cittaCollezione.getMediaSuperficie());
        System.out.println("la densità della popolazione è: " + cittaCollezione.densitaPopolazione());
        System.out.println("la città con più abitanti è: " + cittaCollezione.getMaxCitta());
        System.out.println("la città con meno abitanti è: " + cittaCollezione.getMinCitta());
    }
}
