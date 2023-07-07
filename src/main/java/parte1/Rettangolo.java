package parte1;

public class Rettangolo {
    private int a;
    private int b;

    /**
     * questo metodo è il costruttore della classe Rettangolo, il costruttore è public e ha lo stesso nome della classe
     * al costruttore vengono passati solitamente dei parametri che andranno ad inizializzare le variabili dell'oggetto
     * in questo caso la variabile a e la variabile b
     * da notare che quando si usa this.a ci si riferisce alla variabile locale, invece quando si usa solo a al parametro
     * @param a lato 1
     * @param b lato 2
     */
    public Rettangolo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * il metodo calcola il perimetro del rettangolo
     * @return restituisce il perimetro (int)
     */
    public int perimetro() {
        int perimetro;
        perimetro = (a+b)*2;
        return perimetro;
    }

    /**
     * il metodo calcola l'area del rettangolo
     * @return restituisce l'area (float)
     */
    public float area() {
        float area;
        area = a*b;
        return area;
    }

    /**
     * il metodo calcola la diagonale del rettangolo
     * @return restituisce la diagonale (double)
     */
    public Double diagonale() {
        double diagonale;
        diagonale = Math.sqrt(a*a + b*b);
        return diagonale;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    /**
     * il metodo toString è di base in tutti gli oggetti java ma è comune fare l'override (riscriverlo) per le proprie
     * esigenze
     * @return ritorna la stringa composta scelta da noi
     */
    @Override
    public String toString() {
        return "il rettangolo con lato 1: " + a + " e lato2: " + b;
    }
}
