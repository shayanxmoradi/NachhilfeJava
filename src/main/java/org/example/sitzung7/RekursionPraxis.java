package org.example.sitzung7;

public class RekursionPraxis {

    public static void main(String[] args) {
        RekursionPraxis rp = new RekursionPraxis();

        System.out.println("=== 1. Größter gemeinsamer Teiler (ggT) ===");
        System.out.println("ggT(36, 10) = " + rp.ggT(36, 10)); // Sollte 2 sein

        System.out.println("\n=== 2. Palindrom-Test ===");
        System.out.println("Ist 'cocoococ' ein Palindrom? " + rp.istPalindrom("cocoococ")); // true
        System.out.println("Ist 'Anina' ein Palindrom? " + rp.istPalindrom("Anina")); //
    }

    // Aufgabe 1: Euklidischer Algorithmus
    public int ggT(int a, int b) {
        if (b == 0) {
            return a; // Abbruchbedingung: Wenn Rest 0 ist, ist 'a' der ggT
        } else {
            // Neuer Divisor ist b, neuer Dividend ist der Rest von a % b
            return ggT(b, a % b);
        }
    }

    // 36, 10
    // ggt(10,6)
    //ggt(6,4)
    //ggt(4,2)
    //ggt(2,0)
    //Ergebnis: 2

    // Aufgabe 3: Palindrom prüfen
    public boolean istPalindrom(String input) {
        // Abbruchbedingung: String hat Länge 0 oder 1 -> immer
        if (input.length() <= 1) {
            return true;
        }

        // Sind erstes und letztes Zeichen gleich?
        // KLAUSUR-TIPP: Wir nutzen toLowerCase(), damit 'A' und 'a' als gleich gelten!
        char erstesZeichen = Character.toLowerCase(input.charAt(0));
        char letztesZeichen = Character.toLowerCase(input.charAt(input.length() - 1));

        if (erstesZeichen != letztesZeichen) {
            return false;
        } else {
            // Rekursiver Aufruf mit dem Teilstring (ohne erstes und letztes Zeichen
            String teilstring = input.substring(1, input.length() - 1);
           //y
            return istPalindrom(teilstring);
        }
    }
}