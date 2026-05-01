package org.example.sitzung3;

import java.util.Scanner;

public class MinMaxTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int ENDE = 999; // Abbruchbedingung

        System.out.print("Bitte eine Zahl eingeben (999 für Ende): ");
        int zahl = scanner.nextInt();

        // KLAUSUR-FALLE: Niemals min und max mit 0 initialisieren!
        // Wir nehmen die allererste Eingabe als unseren Startwert.
        int min = zahl;
        int max = zahl;

        // Schleife läuft, bis der Benutzer 999 eingibt
        while (zahl != ENDE) {

            // Wenn die neue Zahl kleiner als das bisherige Minimum ist -> aktualisieren
            if (zahl < min) {
                min = zahl;
            }

            // Wenn die neue Zahl größer als das bisherige Maximum ist -> aktualisieren
            if (zahl > max) {
                max = zahl;
            }

            // Nächste Zahl einlesen
            zahl = scanner.nextInt();
        }

        System.out.println("Minimum: " + min + ", Maximum: " + max);
        scanner.close();
    }
}