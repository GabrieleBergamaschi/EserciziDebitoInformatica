package parte3;

import java.util.ArrayList;

public class CittaCollezione {

    private ArrayList<Citta> cittaCollezione;

    public CittaCollezione(ArrayList<Citta> cittaCollezione) {
        this.cittaCollezione = cittaCollezione;
    }

    /**
     * il metodo usa una variabile (abitantiTotale) per fare la somma degli abitanti di tutte le città per poi
     * restituire il rapporto tra la variabile e il numero di città presenti nell'array
     * @return abitanti totali diviso dimensione dell'array
     */
    public int getMediaAbitanti() {
        int abitantiTotale = 0;
        for(Citta citta: cittaCollezione) {
            abitantiTotale += citta.getNumAbitanti();
        }
        return abitantiTotale /cittaCollezione.size();
    }

    /**
     * il metodo usa una variabile (superficieTotale) per fare la somma delle superfici di tutte le città per poi
     * restituire il rapporto tra la variabile e il numero di città presenti nell'array
     * @return superficie totale diviso dimensione dell'array
     */
    public int getMediaSuperficie() {
        int superficieTotale = 0;
        for(Citta citta: cittaCollezione) {
            superficieTotale += citta.getSuperficie();
        }
        return superficieTotale /cittaCollezione.size();
    }

    /**
     * il metodo usa due variabili (abitantiTotale e superficieTotale) per fare la somma degli abitanti e delle
     * superfici di tutte le città per poi restituire il rapporto tra abitantiTotale e superficieTotale
     * @return abitanti totali diviso superficie totale
     */
    public float densitaPopolazione() {
        int abitantiTotale = 0;
        int superficieTotale = 0;
        for(Citta citta: cittaCollezione) {
            abitantiTotale += citta.getNumAbitanti();
            superficieTotale += citta.getSuperficie();
        }
        return (float) abitantiTotale /superficieTotale;
    }

    /**
     * il metodo restituisce la cittò con il numero maggiore di abitanti tra le città presenti nell'array, usa una
     * variabile (max) che serve per salvarsi il valore corrente della città massima, e per ogni elemento dell'array
     * ci si chiede se esiste una città più grande
     * @return la città con più abitanti
     */
    public Citta getMaxCitta() {
        Citta max = cittaCollezione.get(0);
        for(int i=1; i<cittaCollezione.size(); i++) {
            if(cittaCollezione.get(i).getNumAbitanti() > max.getNumAbitanti()) {
                max = cittaCollezione.get(i);
            }
        }
        return max;
    }

    /**
     * il metodo restituisce la cittò con il numero minore di abitanti tra le città presenti nell'array, usa una
     * variabile (min) che serve per salvarsi il valore corrente della città minima, e per ogni elemento dell'array
     * ci si chiede se esiste una città più piccola
     * @return la città con meno abitanti
     */
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
