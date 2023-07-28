package parte2;

import java.util.ArrayList;
import java.util.Collections;

public class Piatto {
    private String nome;
    private String descrizione;
    private int tempoStimato;
    private int numCalorie;
    private int numPorzioni;
    private final ArrayList<String> ingredienti = new ArrayList<>();

    public Piatto(String nome, String descrizione, int tempoStimato, int numCalorie, int numPorzioni) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.tempoStimato = tempoStimato;
        this.numCalorie = numCalorie;
        this.numPorzioni = numPorzioni;
    }

    public void aggiungiIngrediente(String ingrediente) {
        ingredienti.add(ingrediente);
    }

    public void stampaIngredienti() {
        Collections.sort(ingredienti);
        for(String ingrediente: ingredienti) {
            System.out.println(ingrediente);
        }
    }

    public void ingredienteIsPresent(String ingrediente) {
        for(String elemento: ingredienti) {
            if(elemento.equals(ingrediente)) {
                System.out.println(ingrediente + " presente");
                return;
            }
        }
        System.out.println(ingrediente + " non presente");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setTempoStimato(int tempoStimato) {
        this.tempoStimato = tempoStimato;
    }

    public int getTempoStimato() {
        return tempoStimato;
    }

    public void setNumCalorie(int numCalorie) {
        this.numCalorie = numCalorie;
    }

    public int getNumCalorie() {
        return numCalorie;
    }

    public void setNumPorzioni(int numPorzioni) {
        this.numPorzioni = numPorzioni;
    }

    public int getNumPorzioni() {
        return numPorzioni;
    }
}
