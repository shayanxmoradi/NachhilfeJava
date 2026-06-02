package org.example.sitzung10;

public class CallByValueTheorie {

    public static void main(String[] args) {
        System.out.println("=== DER NAIVE TAUSCH  ===");

        int x = 41;
        int y = 42;

        System.out.println("Vorher im main: x = " + x + ", y = " + y);

        // Methodenaufruf
        naiverTausch(x, y);

        // THEORIE: Warum sind x und y immer noch 41 und 42?
        // Weil Java "Call by Value" nutzt. Die Methode hat nur mit KOPIEN im Stack gearbeitet!
        System.out.println("Nachher im main: x = " + x + ", y = " + y);
    }

    public static void naiverTausch(int a, int b) {
        // Diese Variablen a und b sind völlig neue Schubladen im Stack!
        int hilf = a;
        a = b;
        b = hilf;
        System.out.println("   -> IN der Methode getauscht: a = " + a + ", b = " + b);
        // Sobald die Methode endet, werden a, b und hilf aus dem Stack gelöscht.
    }
}