package parte3;

import java.util.ArrayList;
import java.util.Comparator;

public class Membro {

    private String nome;
    private String cognome;
    private ArrayList<String> strumentiMusicali;

    public Membro(String nome, String cognome, ArrayList<String> strumentiMusicali) {
        this.nome = nome;
        this.cognome = cognome;
        this.strumentiMusicali = strumentiMusicali;
    }

    public void stampaStrumentiMusicali() {
        for(String strumento: strumentiMusicali) {
            System.out.println(strumento);
        }
    }

    public boolean strumentoIsPresent(String strumento) {
        return strumentiMusicali.contains(strumento);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setStrumentiMusicali(ArrayList<String> strumentiMusicali) {
        this.strumentiMusicali = strumentiMusicali;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public ArrayList<String> getStrumentiMusicali() {
        return strumentiMusicali;
    }
}