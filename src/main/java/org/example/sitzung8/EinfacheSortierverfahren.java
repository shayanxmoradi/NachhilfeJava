package org.example.sitzung8;

import java.util.Arrays;

public class EinfacheSortierverfahren {

    public static void main(String[] args) {
        int[] folge1 = {44, 55, 12, 42, 94, 18, 6, 67};
        insertionsort(folge1);
        System.out.println("Insertionsort: " + Arrays.toString(folge1));

        int[] folge2 = {-9, 44, 55, -7, 42, -77, 18, 6, 67};
        selectionsort(folge2);
        System.out.println("Selectionsort: " + Arrays.toString(folge2));

        int[] folge3 = {44, 67, 14, 15, 14, 11, 67, 17};
        bubblesort(folge3);
        System.out.println("Bubblesort:    " + Arrays.toString(folge3));
    }

    // 1. Insertionsort (Wie beim Kartenspielen)
    public static void insertionsort(int[] folge) {
        for (int i = 1; i < folge.length; i++) {
            int schluessel = folge[i];
            int j = i;
            while (j > 0 && folge[j - 1] > schluessel) {
                folge[j] = folge[j - 1]; // Nach rechts schieben
                j--;
            }
            folge[j] = schluessel; // Einsetzen
        }
    }

    // 2. Selectionsort (Sucht immer das kleinste Element)
    public static void selectionsort(int[] folge) {
        for (int i = 0; i < folge.length - 1; i++) {
            int minElement = folge[i];
            int minIndex = i;
            for (int j = i + 1; j < folge.length; j++) {
                if (folge[j] < minElement) {
                    minElement = folge[j];
                    minIndex = j;
                }
            }
            // Vertauschen
            folge[minIndex] = folge[i];
            folge[i] = minElement;
        }
    }

    // 3. Bubblesort (Lässt große Elemente "aufsteigen")
    public static void bubblesort(int[] folge) {
        boolean vertauscht;
        int n = folge.length;
        do {
            vertauscht = false;
            for (int i = 0; i < n - 1; i++) {
                if (folge[i] > folge[i + 1]) {
                    // Vertauschen
                    int hilf = folge[i];
                    folge[i] = folge[i + 1];
                    folge[i + 1] = hilf;
                    vertauscht = true;
                }
            }
            n--; // Optimierung: Das letzte Element ist bereits am richtigen Platz
        } while (vertauscht);
    }
}
