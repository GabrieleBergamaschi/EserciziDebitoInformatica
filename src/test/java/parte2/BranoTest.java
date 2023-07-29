package parte2;

import java.util.ArrayList;

public class BranoTest {

    public static void main(String[] args) {

        ArrayList<Brano> disco = new ArrayList<>();
        Brano brano1 = new Brano("song1", 120);
        Brano brano2 = new Brano("song2", 170);
        Brano brano3 = new Brano("song 3", 135);
        disco.add(brano1);
        disco.add(brano2);
        disco.add(brano3);

        System.out.println("il brano più lungo tra " + brano1.getTitolo()  + " e " + brano2.getTitolo() + " è il brano " +
                brano1.confrontaBrani(brano2).getTitolo());
        System.out.println("il brano più lungo del disco è: " + disco.get(0).getBranoMax(disco).getTitolo());
        //un'altra possibilità è quella di mettere una classe in BranoTest o addirittura fare il calcolo all'interno
        //della classe Main
    }
}
