package org.example.sitzung4;

import java.util.Scanner;

public class Primzahl{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine Zahl ein: ");
        int zahl = scanner.nextInt();

        boolean teilerGefunden = false;

        // --- 1. Die einfache (aber langsamere) Methode ---
        // Läuft ab 2 und prüft jede Zahl.
        /*
        for (int i = 2; (i <= zahl / i) && (!teilerGefunden); i++) {
            if (zahl % i == 0) {
                teilerGefunden = true;
                System.out.println("Keine Primzahl, Teiler ist: " + i);
            }
        }
        */

//        i<= radikal (zahl)
//        i^2 <= zahl
//        i<= zahl/ i

        Math.sqrt(zahl);
        Math.pow(zahl, 0.5);
        Math.abs(zahl);


        // --- 2. Die optimierte (schnellere) Methode  ---
        // Zuerst prüfen, ob die Zahl durch 2 teilbar ist (alle geraden Zahlen außer 2 sind keine Primzahlen)
        teilerGefunden = (zahl % 2 == 0) && (zahl != 2);

        if (!teilerGefunden) {
            // Da wir gerade Zahlen schon ausgeschlossen haben, testen wir nur noch ungerade Zahlen.
            // Wir starten bei 3 und machen Zweierschritte (i = i + 2).
            for (int i = 3; (i <= zahl / i) && (!teilerGefunden); i += 2) {
                if (zahl % i == 0) {
                    teilerGefunden = true;
                    System.out.println("Keine Primzahl, Teiler ist: " + i);
                }
            }
        }

        if (!teilerGefunden && zahl > 1) {
            System.out.println("Die Zahl " + zahl + " ist eine Primzahl!");
        }

        scanner.close();
    }
}