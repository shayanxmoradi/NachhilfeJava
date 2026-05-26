package org.example.sitzung8;


public class UebungsblattLoesung {

    public static void main(String[] args) {

        System.out.println("=== LÖSUNG 1: O-Notation ===");
        // Antwort: Alle drei einfachen Sortierverfahren (Insertion, Selection, Bubble)
        // haben im Worst Case eine Komplexität von O(n^2). [cite: 5282]


        System.out.println("\n=== LÖSUNG 2: Fehler im Selectionsort ===");
        int[] zahlen = {5, 1, 4, 2, 8};
        korrigierterSelectionsort(zahlen);
        for (int z : zahlen) System.out.print(z + " ");
        System.out.println();


        System.out.println("\n=== LÖSUNG 3: Objekte sortieren ===");
        Kunde2 k1 = new Kunde2("Zebra", 3);
        Kunde2 k2 = new Kunde2("Affe", 1);
        Kunde2 k3 = new Kunde2("Vogel", 2);

        Kunde2[] kunden = {k1, k2, k3};
        bubblesortKunde2n(kunden);

        for (Kunde2 k : kunden) {
            System.out.println(k.getName());
        }
    }

    public static void korrigierterSelectionsort(int[] folge) {
        for (int i = 0; i < folge.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < folge.length; j++) {
                if (folge[j] < folge[minIndex]) {
                    minIndex = j;
                }
            }
            // KORREKTUR: Man braucht eine Hilfsvariable zum Vertauschen! [cite: 5262-5265]
            int hilf = folge[i];
            folge[i] = folge[minIndex];
            folge[minIndex] = hilf;
        }
    }

    // Lösung für P11 Aufgabe 3 [cite: 5368-5376]
    public static void bubblesortKunde2n(Kunde2[] folge) {
        boolean vertauscht;
        int n = folge.length;
        do {
            vertauscht = false;
            for (int i = 0; i < n - 1; i++) {
                // Bei Strings nutzen wir compareTo. > 0 bedeutet, der erste String ist alphabetisch größer. [cite: 5036-5041]
                if (folge[i].getName().compareTo(folge[i + 1].getName()) > 0) {
                    Kunde2 hilf = folge[i];
                    folge[i] = folge[i + 1];
                    folge[i + 1] = hilf;
                    vertauscht = true;
                }
            }
            n--;
        } while (vertauscht);
    }
}