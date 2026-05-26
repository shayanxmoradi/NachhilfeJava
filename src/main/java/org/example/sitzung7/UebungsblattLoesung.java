package org.example.sitzung7;

public class UebungsblattLoesung {

    public static void main(String[] args) {

        System.out.println("=== LÖSUNG 1: Papierformate ===");
        System.out.println("DIN-A4 Breite: " + breiteA(4) + " mm"); // 210
        System.out.println("DIN-A4 Länge: " + laengeA(4) + " mm"); // 297

        System.out.println("\n=== LÖSUNG 2: Türme von Hanoi ===");
        System.out.println("Züge für 3 Scheiben: " + anzahlZuege(3)); // 7
        System.out.println("Züge für 4 Scheiben: " + anzahlZuege(4)); // 15

        System.out.println("\n=== LÖSUNG 3: Iteration ===");
        System.out.println("5! iterativ = " + fakultaetIterativ(5)); // 120
    }

    // Lösung Aufgabe 1: Wechselseitige Rekursion (Die Methoden rufen sich gegenseitig auf!)
    public static int breiteA(int i) {
        if (i == 0) return 841;
        return laengeA(i - 1) / 2; // Breite ist die Hälfte der vorherigen Länge
    }

    public static int laengeA(int i) {
        if (i == 0) return 1189;
        return breiteA(i - 1); // Länge ist die exakte vorherige Breite
    }

    // Lösung Aufgabe 2: Türme von Hanoi Züge berechnen
    public static long anzahlZuege(int n) {
        if (n == 1) {
            return 1; // Für eine Scheibe brauchen wir genau 1 Zug
        }
        // Rekursive Formel: 2 * Züge für n-1 Scheiben + 1
        return 2 * anzahlZuege(n - 1) + 1;
    }

    // Lösung Aufgabe 3: Rekursion durch Iteration (Schleife) ersetzen
    public static long fakultaetIterativ(int n) {
        long ergebnis = 1;
        for (int i = 1; i <= n; i++) {
            ergebnis *= i;
        }
        // Alternativ mit while:
        // while(n > 1) { ergebnis *= n; n--; }

        return ergebnis;
    }
}