package org.example.sitzung7;

public class RekursionBasis {

    public static void main(String[] args) {
        System.out.println("=== 1. Fakultät (Normale Rekursion) ===");
        System.out.println("5! = " + fakultaet(5));

        System.out.println("\n=== 2. Fakultät (Endrekursion) ===");
        System.out.println("5! = " + fakultaetEndrekursiv(1, 5));

        System.out.println("\n=== 3. Fibonacci (Neuer Java-Switch) ===");
        System.out.println("fib(5) = " + fibS(5));
    }

    // Klassische Rekursion
    public static long fakultaet(int n) {
        if (n <= 0) {
            return 1; // Abbruchbedingung
        } else {
            return n * fakultaet(n - 1); // Rekursiver Aufruf
        }
    }

    // KLAUSUR-THEMA: Endrekursion (Tail Recursion)
    // Der rekursive Aufruf ist die ALLERLETZTE Aktion. Keine Multiplikation danach!
    public static long fakultaetEndrekursiv(long ergebnis, int n) {
        if (n <= 0) {
            return ergebnis;
        } else {
            return fakultaetEndrekursiv(ergebnis * n, n - 1);
        }
    }

    // Fibonacci mit modernem Java-Switch (Aus den Vorlesungsfolien)
    public static int fibS(int n) {

        int ergebnis = switch (n) {
            case 0 -> 1;
            case 1 -> 1;
            default -> fibS(n - 1) + fibS(n - 2);
        };
        return ergebnis;
    }
}