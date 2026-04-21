package org.example.sitzung2.part2;

public class Wertebereiche {

    public static void main(String[] args) {
        // P04 - Aufgabe 1: Wertebereiche automatisch ermitteln
        // Anstatt die Zahlen auswendig zu lernen, nutzen wir die "Wrapper-Klassen"

        System.out.println("Datentyp: int");
        System.out.println("von: " + Integer.MIN_VALUE); // Gibt den kleinsten int-Wert
        System.out.println("bis: " + Integer.MAX_VALUE); // Gibt den groessten int-Wert
        System.out.println("Speicherplatz (in Byte): " + Integer.BYTES);

        System.out.println("\n---------------------------------");

        System.out.println("Datentyp: double");
        System.out.println("von: " + Double.MIN_VALUE);
        System.out.println("bis: " + Double.MAX_VALUE);
        System.out.println("Speicherplatz (in Byte): " + Double.BYTES);

        // Hinweis
        // Das Gleiche kann er/sie fuer byte (Byte), short (Short), long (Long) und float (Float) machen.
    }
}