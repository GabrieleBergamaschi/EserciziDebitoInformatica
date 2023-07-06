package classi;

public class PuntoTest {

    public static void main(String[] args) {
        Punto p1 = new Punto(1, 1);
        Punto p2 = new Punto(7, 9);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("il punto medio tra p1 e p2 è: " + p1.getPuntoMedio(p2));
        System.out.println("la distanza tra p1 e p2 è: " + p1.getDistanza(p2));
    }
}
