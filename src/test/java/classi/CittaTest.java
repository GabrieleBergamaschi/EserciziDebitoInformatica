package classi;

public class CittaTest {

    public static void main(String[] args) {
        Citta citta = new Citta("Maleo", 10);

        System.out.println("la citta è: " + citta);
        citta.salvaTemperature();
        citta.stampaTemperature();
    }
}
