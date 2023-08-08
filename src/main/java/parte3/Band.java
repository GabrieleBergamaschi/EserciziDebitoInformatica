package parte3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Band {

    private ArrayList<Membro> band;

    public Band(ArrayList<Membro> band) {
        this.band = band;
    }

    public void stampaOrdineAlfabetico() {
        band.sort(new CognomeComparator());
        for(Membro membro: band) {
            System.out.println(membro.getCognome() + " " + membro.getNome() + " ha suonato: ");
            membro.stampaStrumentiMusicali();
        }
    }

    public void stampaMembriDatoStrumento(String strumento) {
        System.out.println("i membri della band che suonano: " + strumento + " sono: ");
        for(Membro membro: band) {
            if(membro.strumentoIsPresent(strumento)) {
                System.out.println(membro.getCognome());
            }
        }
    }

    public void setBand(ArrayList<Membro> band) {
        this.band = band;
    }

    public ArrayList<Membro> getBand() {
        return band;
    }
}

class CognomeComparator implements Comparator<Membro> {
    @Override
    public int compare(Membro membro1, Membro membro2) {
        return membro1.getCognome().compareTo(membro2.getCognome());
    }
}
