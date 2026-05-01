package org.example.sitzung3;


import java.util.Scanner;

public class Quersumme {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib eine positive Zahl ein: ");
        int zahl = scanner.nextInt();

        int originalZahl = zahl; // Wir speichern die Zahl für die spätere Ausgabe
        int quersumme = 0;

        // Die Schleife läuft, solange die Zahl noch Ziffern hat
        while (zahl > 0) {
            int letzteZiffer = zahl % 10;  // 1. Letzte Ziffer isolieren (z.B. 342 % 10 = 2)
            quersumme += letzteZiffer;     // 2. Ziffer zur Summe addieren
            zahl = zahl / 10;              // 3. Letzte Ziffer abschneiden (z.B. 342 / 10 = 34)
        }

        System.out.println("Die Quersumme von " + originalZahl + " ist: " + quersumme);
        scanner.close();
    }
}