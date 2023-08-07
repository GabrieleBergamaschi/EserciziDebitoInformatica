package parte3;

import java.util.ArrayList;
import java.util.Collections;

public class CittaCollezione {

    private ArrayList<Citta> cittaCollezione;

    public CittaCollezione(ArrayList<Citta> cittaCollezione) {
        this.cittaCollezione = cittaCollezione;
    }

    public int getMediaAbitanti() {
        int abitantiTotale = 0;
        for(Citta citta: cittaCollezione) {
            abitantiTotale += citta.getNumAbitanti();
        }
        return abitantiTotale /cittaCollezione.size();
    }

    public int getMediaSuperficie() {
        int superficieTotale = 0;
        for(Citta citta: cittaCollezione) {
            superficieTotale += citta.getSuperficie();
        }
        return superficieTotale /cittaCollezione.size();
    }

    public float densitaPopolazione() {
        int abitantiTotale = 0;
        int superficieTotale = 0;
        for(Citta citta: cittaCollezione) {
            abitantiTotale += citta.getNumAbitanti();
            superficieTotale += citta.getSuperficie();
        }
        return (float) abitantiTotale /superficieTotale;
    }

    public Citta getMaxCitta() {
        Citta max = cittaCollezione.get(0);
        for(int i=1; i<cittaCollezione.size(); i++) {
            if(cittaCollezione.get(i).getNumAbitanti() > max.getNumAbitanti()) {
                max = cittaCollezione.get(i);
            }
        }
        return max;
    }

    public Citta getMinCitta() {
        Citta min = cittaCollezione.get(0);
        for(int i=1; i<cittaCollezione.size(); i++) {
            if(cittaCollezione.get(i).getNumAbitanti() < min.getNumAbitanti()) {
                min = cittaCollezione.get(i);
            }
        }
        return min;
    }

    public void setCittaCollezione(ArrayList<Citta> cittaCollezione) {
        this.cittaCollezione = cittaCollezione;
    }

    public ArrayList<Citta> getCittaCollezione() {
        return cittaCollezione;
    }
}
