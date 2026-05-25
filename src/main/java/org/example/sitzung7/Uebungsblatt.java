package org.example.sitzung7;

public class Uebungsblatt {

    public static void main(String[] args) {

        System.out.println("=== AUFGABE 1: Papierformate (DIN-A Reihe) ===");
        // Ein DIN-A0 Blatt hat die Abmessungen 841 mm (Breite) x 1189 mm (Länge).
        // Für jedes kleinere Format (z.B. A1) gilt:
        // Die neue Länge ist die alte Breite.
        // Die neue Breite ist die HÄLFTE der alten Länge.

        // TODO: Vervollständige die beiden rekursiven Methoden unten!
        // Wenn du alles richtig gemacht hast, sollte für A4 folgendes rauskommen: 210 x 297
        System.out.println("DIN-A4 Breite: " + breiteA(4) + " mm");
        System.out.println("DIN-A4 Länge: " + laengeA(4) + " mm");


        System.out.println("\n=== AUFGABE 2: Türme von Hanoi (Logik) ===");
        // Das berühmte Spiel "Türme von Hanoi".
        // TODO: Schreibe eine rekursive Methode 'anzahlZuege', die berechnet,
        // wie viele Züge man für 'n' Scheiben braucht.
        // Tipp: Für n=1 braucht man 1 Zug.
        // Für n > 1 braucht man: 2 * anzahlZuege(n - 1) + 1

        // System.out.println("Züge für 3 Scheiben: " + anzahlZuege(3)); // Sollte 7 sein
        // System.out.println("Züge für 4 Scheiben: " + anzahlZuege(4)); // Sollte 15 sein


        System.out.println("\n=== AUFGABE 3: Rekursion zu Iteration (Schleife) umwandeln ===");
        // Jeder rekursive Algorithmus kann auch mit einer Schleife (iterativ) geschrieben werden!
        // Hier ist die rekursive Fakultät:
        // public static long fakultaetRekursiv(int n) {
        //     if (n <= 1) return 1;
        //     return n * fakultaetRekursiv(n - 1);
        // }

        // TODO: Schreibe die Methode 'fakultaetIterativ' (unten), die das Gleiche tut,
        // aber eine 'while' oder 'for' Schleife benutzt, anstatt sich selbst aufzurufen.
        // System.out.println("5! iterativ = " + fakultaetIterativ(5)); // Sollte 120 sein
    }

    // --- Methoden für Aufgabe 1 ---
    public static int breiteA(int i) {
        // Abbruchbedingung (A0)
        if (i == 0) {
            return 841;
        }
        // TODO: Dein Code hier (Siehe Formel in der Aufgabenbeschreibung)
        return 0;
    }

    public static int laengeA(int i) {
        // Abbruchbedingung (A0)
        if (i == 0) {
            return 1189;
        }
        // TODO: Dein Code hier
        return 0;
    }

    // --- Methode für Aufgabe 2 ---
    // public static long anzahlZuege(int n) { ... }

    // --- Methode für Aufgabe 3 ---
    // public static long fakultaetIterativ(int n) { ... }
}