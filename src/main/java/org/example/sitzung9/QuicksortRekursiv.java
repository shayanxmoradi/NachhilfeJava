package org.example.sitzung9;

import java.util.Arrays;

public class QuicksortRekursiv {

    public static void main(String[] args) {
        int[] folge = {44, 55, 12, 42, 94, 18, 6, 67};
        System.out.println("Vorher:  " + Arrays.toString(folge));

        quicksort(folge, 0, folge.length - 1);

        System.out.println("Nachher: " + Arrays.toString(folge));
    }

    // KLAUSUR-CODE: Quicksort Hauptmethode
    public static void quicksort(int[] folge, int links, int rechts) {
        int i = links;
        int j = rechts;

        // Pivot in der Mitte wählen (verhindert den Worst-Case bei vorsortierten Arrays!)
        int pivotWert = folge[(links + rechts) / 2];

        do {
            // Von links suchen: Element finden, das größer/gleich Pivot ist
            while (folge[i] < pivotWert) { i++; }

            // Von rechts suchen: Element finden, das kleiner/gleich Pivot ist
            while (pivotWert < folge[j]) { j--; }

            if (i <= j) {
                vertausche(folge, i, j); // Swap
                i++;
                j--;
            }
        } while (i <= j); // Treffen sich die Indizes?

        // Rekursion für die linke und rechte Hälfte
        if (links < j) { quicksort(folge, links, j); }
        if (i < rechts) { quicksort(folge, i, rechts); }
    }

    public static void vertausche(int[] folge, int index1, int index2) {
        int hilf = folge[index1];
        folge[index1] = folge[index2];
        folge[index2] = hilf; //
    }
}