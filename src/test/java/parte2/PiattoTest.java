package parte2;

public class PiattoTest {

    public static void main(String[] args) {

        Piatto piatto = new Piatto("pasta", "al pomodoro con basilico", 12, 450, 1);
        piatto.aggiungiIngrediente("pasta");
        piatto.aggiungiIngrediente("pomodoro");
        piatto.aggiungiIngrediente("olio");
        piatto.aggiungiIngrediente("basilico");
        piatto.aggiungiIngrediente("grana");

        piatto.stampaIngredienti();
        piatto.ingredienteIsPresent("pomodoro");
        piatto.ingredienteIsPresent("insalata");
    }

}
