package esercizio1;

public class RettangoloTest {

    public static void main(String[] args) {
        //viene creato un oggetto rettangolo e viene chiamato il suo costruttore passando i parametri
        Rettangolo rettangolo = new Rettangolo(5, 6);

        //serie di stampe per chiamare i metodi dell'oggetto rettangolo
        //per chiamare i metodi la sintassi è: rettangolo.nomeDelMetodo()
        System.out.println("il perimetro è: " + rettangolo.perimetro());
        System.out.println("l'area è: " + rettangolo.area());
        System.out.println("la diagonale è: " + rettangolo.diagonale());
    }
}
