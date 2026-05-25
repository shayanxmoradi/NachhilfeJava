package org.example.sitzung8;

public class SortierTheorie {

    public static void main(String[] args) {
        System.out.println("=== KLAUSUR-WISSEN: Theorie der Algorithmen ===");

        /*
         * 1. Laufzeitkomplexität (O-Notation / Landau-Symbole)
         * - O(1): Konstant (Sehr schnell, unabhängig von der Datenmenge)
         * - O(log n): Logarithmisch (Sehr schnell, z.B. Binäre Suche)
         * - O(n): Linear (Geht jedes Element einmal durch, z.B. Lineare Suche)
         * - O(n^2): Quadratisch (Zwei verschachtelte Schleifen, typisch für einfache Sortieralgorithmen)
         * * WICHTIG FÜR DIE KLAUSUR:
         * Bubblesort, Insertionsort und Selectionsort haben im Worst-Case ALLE O(n^2)!
         */

        /*
         * 2. Stabilität (Stabil)
         * Was bedeutet das? Wenn zwei Elemente gleich sind (z.B. zwei Studenten heißen "Müller"),
         * bleibt ihre ursprüngliche Reihenfolge nach dem Sortieren erhalten?
         * * - Bubblesort: STABIL (Gleiche Elemente überholen sich nicht)
         * - Insertionsort: STABIL
         * - Selectionsort: NICHT STABIL (Das Vertauschen über weite Distanzen zerstört die Reihenfolge!)
         */

        /*
         * 3. Speicherplatz (In-Place / in situ)
         * Was bedeutet das? Braucht der Algorithmus ein komplett neues,
         * zweites Array (viel Speicher), um zu sortieren?
         * * Antwort: Alle drei (Bubble, Insertion, Selection) sind "In-Place" (Ja).
         * Sie sortieren direkt im Original-Array und brauchen nur eine 'hilf'-Variable.
         */

        System.out.println("Lerne diese drei Konzepte auswendig, sie kommen als Theoriefragen vor!");
    }
}