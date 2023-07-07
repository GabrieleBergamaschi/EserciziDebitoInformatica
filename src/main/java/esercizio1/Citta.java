package esercizio1;

import java.util.Scanner;

public class Citta {
    private String nome;
    private float[] temperature;

    public Citta(String nome, int n) {
        this.nome = nome;
        temperature = new float[n];
    }

    public void salvaTemperature() {
        Scanner in = new Scanner(System.in);
        System.out.println("devi inserire " + temperature.length + " temperature");
        for (int i=0; i<temperature.length; i++) {
            System.out.println("inserisci temperatura numero " + (i+1));
            temperature[i] = in.nextFloat();
        }
    }

    public float getTemperaturaMedia() {
        float somma = 0;
        for (int i=0; i<temperature.length; i++) {
            somma += temperature[i];
        }
        return somma/temperature.length;
    }

    public float getTemperaturaMax() {
        float max = temperature[0];
        for (int i=1; i<temperature.length; i++) {
            if(temperature[i] > max)
                max = temperature[i];
        }
        return max;
    }

    public float getTemperaturaMin() {
        float min = temperature[0];
        for (int i=1; i<temperature.length; i++) {
            if(temperature[i] < min)
                min = temperature[i];
        }
        return min;
    }

    public void stampaTemperature() {
        for(int i=0; i<temperature.length; i++) {
            System.out.println("la temperatura " + (i+1) + " è: " + temperature[i]);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTemperature(float[] temperature) {
        this.temperature = temperature;
    }

    public float[] getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return nome;
    }
}
