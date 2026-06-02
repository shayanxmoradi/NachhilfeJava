package org.example.sitzung9;

import static org.example.sitzung8.EinfacheSortierverfahren.bubblesort;
import static org.example.sitzung9.QuicksortRekursiv.quicksort;

public class Uebungsblatt {

    public static void main(String[] args) {

        System.out.println("=== AUFGABE 1: Schreibtischtest (Partition) ===");
        // Gegeben ist folgendes Array für den ERSTEN Aufruf der Methode partition():
        // int[] A = {8, 2, 7, 4, 9, 3, 5};
        // Unser Pivot-Element ist das letzte Element: 5

        // TODO a: Geh den Partition-Algorithmus (Variante 1) im Kopf oder auf Papier durch.
        // Wie sieht das Array AUS, NACHDEM die Partition-Methode einmal komplett durchgelaufen ist?
        // Deine Antwort: Array = [...]

        // TODO b: Welchen 'teilungsIndex' gibt die Methode am Ende zurück?
        // Deine Antwort: teilungsIndex = ...


        System.out.println("\n=== AUFGABE 2: Theorie-Fallen ===");
        // TODO: Beantworte die folgenden 2 Klausurfragen mit kurzen Sätzen:
        // Frage A: Ist Quicksort ein "stabiles" (stabil) Sortierverfahren? Warum ist das wichtig?
        // Deine Antwort: ...

        // Frage B: Warum ist es klüger, das Pivot-Element aus der MITTE des Arrays zu wählen,
        // anstatt immer das erste oder letzte Element zu nehmen?
        // Deine Antwort: ...


        System.out.println("\n=== AUFGABE 3: Laufzeitvergleich Bugfix ===");
        // Ein Student will die Laufzeit von Bubblesort und Quicksort vergleichen.
        // Er hat folgenden Code geschrieben. Finde den Fehler!
        /*
           int[] testArray = generiereZufaelligesArray(10000);

           startTimer();
           quicksort(testArray, 0, testArray.length - 1);
           stoppeTimerUndDrucke("Quicksort");

           startTimer();
           bubblesort(testArray);
           stoppeTimerUndDrucke("Bubblesort");
        */
        // TODO: Warum ist dieser Test komplett ungültig und unfair gegenüber Bubblesort?
        // Deine Antwort: ...
    }
}