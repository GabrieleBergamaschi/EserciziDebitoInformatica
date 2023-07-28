package parte2;

public class Brano {

    private String titolo;
    private int durata;

    public Brano(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
    }

    public Brano confrontaBrani(Brano brano) {
        if(brano.durata > durata) {
            return brano;
        }
        return this;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
}
