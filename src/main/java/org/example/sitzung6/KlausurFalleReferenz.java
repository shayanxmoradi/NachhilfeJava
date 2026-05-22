package org.example.sitzung6;

public class KlausurFalleReferenz {

    public static void main(String[] args) {
        System.out.println("=== KLAUSURFALLE: Arrays als Parameter ===");

        int zahl = 10;
        int[] meinArray = {10, 20, 30};

        System.out.println("VORHER: zahl = " + zahl + ", meinArray[0] = " + meinArray[0]);

        // Methoden aufrufen
        ändereWerte(zahl, meinArray);

        // KLAUSUR-FRAGE: Was wird hier ausgedruckt?
        // Antwort: Die primitive 'zahl' bleibt 10.
        // Aber 'meinArray[0]' wird zu 99! (Weil die Referenz übergeben wurde).
        System.out.println("NACHHER: zahl = " + zahl + ", meinArray[0] = " + meinArray[0]);
    }

    public static void ändereWerte(int x, int[] arr) {
        x = 99;         // Ändert nur die lokale Kopie!
        arr[0] = 99;    // Ändert das Original-Array im Speicher!
    }
}