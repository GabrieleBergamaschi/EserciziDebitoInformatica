package parte1;

public class RettangoloTest {

    public static void main(String[] args) {
        //viene creato un oggetto rettangolo e viene chiamato il suo costruttore passando i parametri
        Rettangolo rettangolo = new Rettangolo(5, 6);

        //chiamo i metodi della classe rettangolo per calcolare tutti i dati richiesti dal problema
        int perimetro = rettangolo.perimetro();
        float area = rettangolo.area();
        double diagonale = rettangolo.diagonale();

        //stampo i dati richiesti dal problema a video
        System.out.println("il perimetro è: " + perimetro);
        System.out.println("l'area è: " + area);
        System.out.println("la diagonale è: " + diagonale);
    }
}
