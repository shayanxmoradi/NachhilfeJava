package org.example.sitzung5;

public class Array {

    public static void main(String[] args) {

        System.out.println("=== 1. Arrays erstellen und initialisieren ===");
        // In Java MUSS das Schlüsselwort 'new' verwendet werden! weil die Objekte sind
        int[] zahlen ;


        zahlen = new int[3];



//        int[] zahlen2 = new int[]; muss initializer werden
        zahlen[0] = 42;
        zahlen[1] = 8;
        zahlen[2] = 19;

        int test[];

        int[] arr2 = {1, 2, 3, 4};// kann auch direkt initialisiert werden

        int x = arr2[0]; // Wert von erster Position bekommen

        // KLAUSUR-FALLE 1: length vs length()
        // Arrays haben eine Eigenschaft 'length' (OHNE Klammern!)
        // Strings haben eine Methode 'length()' (MIT Klammern!)
        int laenge = zahlen.length;
        System.out.println("Länge des Arrays: " + laenge);

        //Array durchlaufen
        for (int i = 0; i <= arr2.length-1; i++) {
            System.out.println(arr2[i]);
        }

        // for each
        for (int asdfasdfasdfsad : arr2) {
            System.out.println(asdfasdfasdfsad);
        }

        int[][] matrix = new int[3][3];

        int[][] mat = {
                {1, 2},
                {3, 4}
        };


        //Array kopieren
        int[] copy = arr2.clone();

        System.arraycopy(arr2, 0, copy, 0, arr2.length);

        System.out.println("\n=== 2. KLAUSUR-FALLE: OutOfBoundsException ===");
        // Was passiert, wenn wir auf zahlen[3] zugreifen?
        // Java prüft die Grenzen zur Laufzeit. Das Programm würde abstürzen!
        // System.out.println(zahlen[3]); // Löst ArrayIndexOutOfBoundsException aus!


        System.out.println("\n=== 3. Arrays von Objekten ===");
        // Wir erstellen ein Array für 2 Bücher.
        // ACHTUNG: Die Plätze sind am Anfang leer (null)!
        Buch2[] regal = new Buch2[2];

        // FALLE: regal[0].titel = "Java"; -> Löst NullPointerException aus!
        // Wir müssen erst ein echtes Buch-Objekt in das Array legen:
        regal[0] = new Buch2("Java für Anfänger");
        regal[1] = new Buch2("Clean Code");

        for (int i = 0; i < regal.length; i++) {
            System.out.println("Buch an Index " + i + ": " + regal[i].titel);
        }
    }
}

// Hilfsklasse
class Buch2 {
    String titel;

    public Buch2(String titel) {
        this.titel = titel;
    }
}