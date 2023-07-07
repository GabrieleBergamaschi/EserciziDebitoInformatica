package parte1;

public class CittaTest {

    public static void main(String[] args) {
        Citta citta = new Citta("Maleo", 10);

        System.out.println("la citta è: " + citta);
        citta.salvaTemperature();

        System.out.println("la temperatura media è: " + citta.getTemperaturaMedia());
        System.out.println("la temperatura massima è: " + citta.getTemperaturaMax());
        System.out.println("la temperatura minima è: " + citta.getTemperaturaMin());
    }
}
