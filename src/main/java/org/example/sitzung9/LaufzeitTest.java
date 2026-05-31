package org.example.sitzung9;

import java.util.Arrays;
import java.util.Random;

public class LaufzeitTest {

    private long startTime;
    private long duration;

    public void startStopwatch() {
        this.startTime = System.nanoTime();
    }

    public void endStopwatch() {
        this.duration = System.nanoTime() - this.startTime;
    }

    public void printStoppedTime() {
        long ns = this.duration;
        long us = ns / 1000;
        long ms = us / 1000;
        System.out.println(ns + " ns, " + us + " us, " + ms + " ms");
    }

    public void laufzeitTest(int anzahlElemente) {
        // 1. Zufälliges Array generieren
        int[] original = new int[anzahlElemente];
        Random rand = new Random();
        for (int i = 0; i < anzahlElemente; i++) {
            original[i] = rand.nextInt(100000);
        }

        // KLAUSUR-FALLE: Arrays Klonen!
        // Damit beide Algorithmen exakt dieselbe UNSORTIERTE Folge bekommen.
        int[] fürQuicksort = original.clone();
        int[] fürBubblesort = original.clone();

        System.out.println("\n--- Laufzeit für " + anzahlElemente + " Elemente ---");

        // Test Quicksort
        startStopwatch();
        QuicksortRekursiv.quicksort(fürQuicksort, 0, fürQuicksort.length - 1);
        endStopwatch();
        System.out.println("Quicksort:");
        printStoppedTime();

        // Test Bubblesort (wird bei großen Mengen extrem langsam sein!)
        startStopwatch();
        // Hier würdest du deine Bubblesort-Methode aufrufen
        // Bubblesort.bubblesort(fürBubblesort);
        endStopwatch();
        System.out.println("Bubblesort:");
        printStoppedTime();
    }

    public static void main(String[] args) {
        LaufzeitTest test = new LaufzeitTest();
        test.laufzeitTest(100);    // Geht bei beiden schnell
        test.laufzeitTest(50000);  // Hier wird Bubblesort heulen
    }
}