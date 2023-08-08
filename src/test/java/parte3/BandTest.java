package parte3;

import java.util.ArrayList;

public class BandTest {

    public static void main(String[] args) {

        ArrayList<String> strumenti1 = new ArrayList<>();
        strumenti1.add("voce");
        strumenti1.add("chitarra");
        strumenti1.add("basso");
        Membro membro1 = new Membro("rossi", "paolo", strumenti1);

        ArrayList<String> strumenti2 = new ArrayList<>();
        strumenti1.add("voce");
        strumenti1.add("chitarra elettrica");
        strumenti1.add("batteria");
        Membro membro2 = new Membro("martini", "franco", strumenti2);

        ArrayList<String> strumenti3 = new ArrayList<>();
        strumenti1.add("chitarra");
        strumenti1.add("batteria");
        strumenti1.add("flauto");
        Membro membro3 = new Membro("rossi", "paolo", strumenti1);

        ArrayList<Membro> membri = new ArrayList<>();
        membri.add(membro1);
        membri.add(membro2);
        membri.add(membro3);

        Band band = new Band(membri);
        band.stampaOrdineAlfabetico();
        band.stampaMembriDatoStrumento("chitarra");
        band.stampaMembriDatoStrumento("voce");
    }
}
