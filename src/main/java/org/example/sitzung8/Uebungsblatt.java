package org.example.sitzung8;

public class Uebungsblatt {

    public static void main(String[] args) {

        System.out.println("=== AUFGABE 1: O-Notation (Komplexität) ===");
        // TODO: Beantworte als Kommentar:
        // Welche Laufzeitkomplexität (O-Notation) haben Insertionsort, Selectionsort und Bubblesort
        // im SCHLECHTESTEN Fall (Worst Case)? [cite: 5282]
        // Deine Antwort: O(...)


        System.out.println("\n=== AUFGABE 2: Fehler im Selectionsort ===");
        // Der folgende Code soll ein Array sortieren, aber er hat einen logischen Fehler.
        // TODO: Finde den Fehler und repariere ihn!
        int[] zahlen = {5, 1, 4, 2, 8};
        fehlerhafterSelectionsort(zahlen);

        System.out.print("Sollte [1, 2, 4, 5, 8] sein. Ist: ");
        for (int z : zahlen) System.out.print(z + " ");
        System.out.println();


        System.out.println("\n=== AUFGABE 3: Objekte sortieren mit compareTo (P11) ===");
        // Oft sortieren wir keine int-Werte, sondern Objekte, z.B. nach Namen.
        Kunde2 k1 = new Kunde2("Zebra", 3);
        Kunde2 k2 = new Kunde2("Affe", 1);
        Kunde2 k3 = new Kunde2("Vogel", 2);

        Kunde2[] kunden = {k1, k2, k3};

        // TODO: Schreibe eine Bubblesort-Methode, die das Array 'kunden'
        // nach dem Namen alphabetisch sortiert.
        // Tipp: Nutze kunden[i].getName().compareTo(kunden[i+1].getName()) > 0 [cite: 5036-5041]

        // bubblesortKunde2n(kunden);

        // Nach dem Sortieren ausgeben:
        // for (Kunde2 k : kunden) { System.out.println(k.getName()); }
    }

    public static void fehlerhafterSelectionsort(int[] folge) {
        for (int i = 0; i < folge.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < folge.length; j++) {
                if (folge[j] < folge[minIndex]) {
                    minIndex = j;
                }
            }
            // FEHLER IST HIER UNTEN:
            folge[i] = folge[minIndex];
            folge[minIndex] = folge[i];
        }
    }
}

 class Kunde2 {
    private String name;
    private int id;

    public Kunde2(String name, int id) { this.name = name; this.id = id; }
    public String getName() { return name; }
}