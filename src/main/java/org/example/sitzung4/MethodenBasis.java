package org.example.sitzung4;

public class MethodenBasis {

    public static void main(String[] args) {
        System.out.println("=== 1. Prozedur (void) aufrufen ===");
        // Hier rufen wir eine Methode ohne Rückgabewert auf.
        // '3' und '+' sind die Argumente (aktuelle Parameter).
        druckeMuster(3, '+');

        System.out.println("\n=== 2. Funktion (mit return) aufrufen ===");
        // Hier rufen wir eine Methode auf, die ein Ergebnis liefert.
        double ergebnis = berechneSumme(10.5, 4.5);
        System.out.println("Die Summe ist: " + ergebnis);

        System.out.println("\n=== 3. Überladene Methode (Overloading) ===");
        // Java weiss automatisch, welche Methode gemeint ist,
        // basierend auf den Parametern!
        double ergebnisDreiZahlen = berechneSumme(10.5, 4.5, 5.0);
        System.out.println("Die Summe von 3 Zahlen ist: " + ergebnisDreiZahlen);
    }

    // --- METHODEN-DEFINITIONEN (Ausserhalb der main-Methode!) ---

    /**
     * Eine "Prozedur" in Java (Rückgabetyp 'void').
     * Sie macht etwas, gibt aber keinen Wert zurück.
     * (Ähnlich wie P06 - Aufgabe 1)
     */
    public static void druckeMuster(int anzahl, char zeichen) {
        System.out.print("Muster: ");
        for (int i = 0; i < anzahl; i++) {
            System.out.print(zeichen);
        }
        System.out.println("-");
    }

    /**
     * Eine "Funktion" in Java (Rückgabetyp 'double').
     * Sie berechnet etwas und gibt das Ergebnis mit 'return' zurück.
     * (Ähnlich wie P06 - Aufgabe 3)
     */
    public static double berechneSumme(double zahl1, double zahl2) {
        return zahl1 + zahl2;
    }

    /**
     * KLAUSUR-THEMA: Methoden-Überladung (Overloading)
     * Wir dürfen den gleichen Methodennamen verwenden, solange die
     * Parameterliste (Signatur) anders ist!
     */
    public static double berechneSumme(double zahl1, double zahl2, double zahl3) {
        return zahl1 + zahl2 + zahl3;
    }

    /*
    // KLAUSUR-FALLE: Das hier würde einen Fehler (Compiler Error) werfen!
    // Der Rückgabetyp (int vs double) gehört NICHT zur Signatur!
    public static int berechneSumme(double zahl1, double zahl2) {
        return (int) (zahl1 + zahl2);
    }
    */
}