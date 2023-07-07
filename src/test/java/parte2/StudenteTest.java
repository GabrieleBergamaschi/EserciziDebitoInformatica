package parte2;

public class StudenteTest {

    public static void main(String[] args) {
        Studente studente = new Studente("gabriele" , 10);

        System.out.println("il voto più alto è: " + studente.maxVoto());
        System.out.println("il voto più basso è: " + studente.minVoto());
        System.out.println("la media di " + studente + " è: " + studente.mediaVoti());
    }
}
