package parte3;

public class Citta {
    private String nome;
    private int numAbitanti;
    private int superficie;

    public Citta(String nome, int numAbitanti, int superficie) {
        this.nome = nome;
        this.numAbitanti = numAbitanti;
        this.superficie = superficie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumAbitanti(int numAbitanti) {
        this.numAbitanti = numAbitanti;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public String getNome() {
        return nome;
    }

    public int getNumAbitanti() {
        return numAbitanti;
    }

    public int getSuperficie() {
        return superficie;
    }

    @Override
    public String toString() {
        return getNome();
    }
}
