package parte2;

import java.util.Scanner;

public class Studente {
    private String nome;
    private int[] voti;

    public Studente(String nome, int n) {
        this.nome = nome;
        voti = new int[n];
        addVoti();
    }

    private void addVoti() {
        Scanner in = new Scanner(System.in);
        System.out.println("inserisci i " + voti.length + " voti");
        for(int i=0; i<voti.length; i++) {
            System.out.println("voto " + (i+1) + ":");
            voti[i] = in.nextInt();
        }
    }

    public int maxVoto() {
        int max = voti[0];
        for (int i=1; i<voti.length; i++) {
            if(voti[i] > max)
                max = voti[i];
        }
        return max;
    }

    public int minVoto() {
        int min = voti[0];
        for (int i=1; i<voti.length; i++) {
            if(voti[i] < min)
                min = voti[i];
        }
        return min;
    }

    public float mediaVoti() {
        int somma = 0;
        for (int voto : voti) {
            somma += voto;
        }
        return (float)somma/voti.length;
    }

    public String getNome() {
        return nome;
    }

    public int[] getVoti() {
        return voti;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVoti(int[] voti) {
        this.voti = voti;
    }

    @Override
    public String toString() {
        return nome;
    }
}
