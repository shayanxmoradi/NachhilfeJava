package org.example.sitzung9;

import java.util.Arrays;

public class QuicksortGeheimnisse {

    public static void main(String[] args) {
        System.out.println("=== KLAUSUR-WISSEN: Quicksort Aufrufbaum & P12 Variante 1 ===");
        int[] folge = {10, 37, 79, 38, 17, 40, 50, 67, 70, 34};

        System.out.println("Unsortiert: " + Arrays.toString(folge));
        quicksort(folge, 0, folge.length - 1);
        System.out.println("\nSortiert:   " + Arrays.toString(folge));
    }

    public static void quicksort(int[] folge, int unten, int oben) {
        if (unten < oben) { //
            // 1. Array teilen und Index des Pivots bekommen
            int teilungsIndex = partition(folge, unten, oben);

            // KLAUSUR-WISSEN (Aufrufbaum):
            // Zuerst wird die KOMPLETTE linke Seite abgearbeitet!
            quicksort(folge, unten, teilungsIndex - 1);

            // Erst wenn links komplett fertig ist, startet die rechte Seite!
            quicksort(folge, teilungsIndex + 1, oben);
        }
    }

    // EXAKT DIE LOGIK AUS P12 (Variante 1 aus der Vorlesung)
    public static int partition(int[] folge, int unten, int oben) {
        // Wir nehmen das letzte Element als Pivot
        int pivotElement = folge[oben];
        int teilungsIndex = unten;

        for (int j = unten; j < oben; j++) {
            if (folge[j] < pivotElement) {
                System.out.print(".");

                // Vertausche teilungsIndex und j
                int hilf = folge[teilungsIndex];
                folge[teilungsIndex] = folge[j];
                folge[j] = hilf;

                teilungsIndex++;
            }
        }
        // Am Ende: Pivot-Element in die Mitte (an den teilungsIndex) setzen
        int hilf = folge[teilungsIndex];
        folge[teilungsIndex] = folge[oben];
        folge[oben] = hilf;

        return teilungsIndex;
    }
}