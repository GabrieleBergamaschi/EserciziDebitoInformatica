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

    }
}
