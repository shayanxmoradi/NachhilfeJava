package org.example.part1;

public class Uebung1 {
    public static void main(String[] args) {
        int punkte = 18;
        int maxPunkte = 20;

        // FALSCH: double prozent = (punkte / maxPunkte) * 100; // Ergibt 0.0, da 18/20 = 0

        // RICHTIG: Mindestens ein Operand muss gecastet werden
        double prozent = ((double) punkte / maxPunkte) * 100;

        System.out.println("Erreichte Prozente: " + prozent + " %");
    }
}