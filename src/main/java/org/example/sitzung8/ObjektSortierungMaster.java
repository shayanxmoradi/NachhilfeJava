package org.example.sitzung8;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class ObjektSortierungMaster {

    public static void main(String[] args) {
        System.out.println("=== KLAUSUR-THEMA: Objekte sortieren mit Comparable ===");

        // Array von Studenten erstellen
        Studierender s1 = new Studierender("Zebra", 100);
        Studierender s2 = new Studierender("Affe", 300);
        Studierender s3 = new Studierender("Affe", 200);

        Studierender[] studenten = {s1, s2, s3};

        System.out.println("Vor dem Sortieren:");
        System.out.println(Arrays.toString(studenten));

        // Wir nutzen Bubblesort für Objekte!
        bubblesortObjekte(studenten);

        System.out.println("\nNach dem Sortieren (Nach Name, dann Matrikelnummer):");
        System.out.println(Arrays.toString(studenten));
    }

    public static void bubblesortObjekte(Studierender[] folge) {
        boolean vertauscht;
        int n = folge.length;
        do {
            vertauscht = false;
            for (int i = 0; i < n - 1; i++) {
                // KLAUSUR-TIPP: Anstatt '>' nutzen wir compareTo() !
                // Wenn compareTo > 0 zurückgibt, ist das erste Objekt "größer" (muss nach rechts)
                if (folge[i].compareTo(folge[i + 1]) > 0) {
                    Studierender hilf = folge[i];
                    folge[i] = folge[i + 1];
                    folge[i + 1] = hilf;
                    vertauscht = true;
                }
            }
            n--;
        } while (vertauscht);
    }
}

// KLAUSUR-FALLE: Die Klasse MUSS 'implements Comparable' haben!
class Studierender implements Comparable<Studierender> {
    String name;
    int matrikelNr;


    public Studierender(String name, int matrikelNr) {
        this.name = name;
        this.matrikelNr = matrikelNr;
    }

    @Override
    public int compareTo(Studierender anderer) {
        // 1. Zuerst nach Namen sortieren (Alphabetisch)
        int nameVergleich = this.name.compareTo(anderer.name);

        if (nameVergleich != 0) {
            // Wenn die Namen unterschiedlich sind, sind wir hier fertig!
            return nameVergleich;
        } else {
            // 2. Wenn die Namen GLEICH sind (z.B. zweimal "Affe"),
            // sortieren wir nach Matrikelnummer!
            return Integer.compare(this.matrikelNr, anderer.matrikelNr);
        }
    }

    @Override
    public String toString() {
        return name + "(" + matrikelNr + ")";
    }

}