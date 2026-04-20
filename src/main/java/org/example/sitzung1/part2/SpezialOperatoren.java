package org.example.sitzung1.part2;


public class SpezialOperatoren {

    public static void main(String[] args) {
        // 1. Modulo-Operator (%) - Gibt den Rest der Division zurück
        int zahl = 26;
        int rest = zahl % 8; // 26 / 8 = 3, Rest: 2
        System.out.println("26 modulo 8 ist: " + rest);

        // Modulo für Gerade/Ungerade prüfen
        int testZahl = 15;
        if (testZahl % 2 == 0) {
            System.out.println(testZahl + " ist eine gerade Zahl.");
        } else {
            System.out.println(testZahl + " ist eine ungerade Zahl.");
        }

        System.out.println("---------------------------------");

        // 2. Kurzschluss-Operatoren (Lazy Evaluation) vs. Normale Operatoren
        int a = 5;

        // && (Kurzschluss): Wenn der erste Teil FALSE ist, wird der zweite ignoriert!
        // Hier ist (a < 0) false. Daher wird (++a > 0) NICHT mehr ausgeführt.
        boolean ergebnis1 = (a < 0) && (++a > 0);
        System.out.println("Ergebnis mit && : " + ergebnis1);
        System.out.println("Wert von a nach && : " + a); // 'a' ist immer noch 5!

        System.out.println("---");

        // & (Nicht-Kurzschluss): Beide Seiten werden IMMER ausgeführt!
        // Auch wenn (a < 0) false ist, wird (++a > 0) trotzdem ausgeführt.
        boolean ergebnis2 = (a < 0) & (++a > 0);
        System.out.println("Ergebnis mit & : " + ergebnis2);
        System.out.println("Wert von a nach & : " + a); // 'a' ist jetzt 6!
    }
}