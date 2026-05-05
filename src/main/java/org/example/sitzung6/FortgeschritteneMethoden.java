package org.example.sitzung6;

public class FortgeschritteneMethoden {

    // ==============================================================
    // FALLE: Variablen-Lebensdauer (Scope) & Zustand speichern
    // ==============================================================

    // KLASSENVARIABLEN (static): Diese leben so lange wie das Programm läuft.
    // Sie "merken" sich ihren Wert auch zwischen verschiedenen Methodenaufrufen!
    private static double s_t1 = 0.0;
    private static double s_t2 = 0.0;

    public static void main(String[] args) {
        System.out.println("=== 1. Der Moving Average Filter (Status speichern) ===");

        // Wir rufen die Methode dreimal auf.
        // Achte darauf, wie sich s_t1 und s_t2 ihre alten Werte merken!
        simuliereFilter(10.0); // 1. Aufruf
        simuliereFilter(20.0); // 2. Aufruf
        simuliereFilter(30.0); // 3. Aufruf


        System.out.println("\n=== 2. Die toString() Methode (Objekte drucken) ===");

        Buch meinBuch = new Buch();
        meinBuch.titel = "Java für Anfänger";
        meinBuch.preis = 29.99;

        // Was passiert, wenn wir das Objekt direkt drucken?
        // OHNE toString() -> org.example.sitzung6.Buch@2a139a55 (Speicheradresse)
        // MIT toString()  -> Buch: Java für Anfänger (Preis: 29.99 Euro)
        System.out.println(meinBuch);
    }

    /**
     * Diese Methode demonstriert, wie man alte Werte behält (P06 - Aufgabe 2).
     */
    public static void simuliereFilter(double s_t0) {
        // Berechnung des Durchschnitts (result = (s_t0 + s_t1 + s_t2) / 3)
        double result = (s_t0 + s_t1 + s_t2) / 3.0;

        System.out.println("Neu: " + s_t0 + " | Alt 1: " + s_t1 + " | Alt 2: " + s_t2 + " -> Schnitt: " + result);

        // UPDATE FÜR DEN NÄCHSTEN DURCHLAUF:
        // Der aktuelle Wert wird für das nächste Mal zum "alten" Wert!
        s_t2 = s_t1; // Erst s_t1 in s_t2 schieben
        s_t1 = s_t0; // Dann den neuen Wert in s_t1 speichern

        // Würden wir 's_t1' und 's_t2' HIER in der Methode als 'double s_t1 = 0;'
        // definieren, würden sie am Ende der Methode gelöscht werden!
    }
}

// ==============================================================
// Hilfsklasse
// ==============================================================
class Buch {
    String titel;
    double preis;

    // KLAUSUR-TIPP: Immer toString() überschreiben, um Objekte schön darzustellen!
    @Override
    public String toString() {
        return "Buch: " + titel + " (Preis: " + preis + " Euro)";
    }
}