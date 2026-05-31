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

    // 1. Insertionsort (Wie beim Kartenspielen) O(n²)
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

    // 2. Selectionsort (Sucht immer das kleinste Element) O(n²)
    public static void selectionsort(int[] folge) {
        int[] folge1 = {44, 55, 12, 42, 94, 18, 6, 67};
//        6 55 12 42 94 18 44 67
        // 6 12 55, 42,94, 18, 44,67
        // 6 12 18 42 94 55 44 67
        // 6 12 18 42 94 55 44 67
        // 6 12 18 42 44 55 94 67
        // 6 12 18 42 44 55 67 94

        for (int i = 0; i < folge.length - 1; i++) {
            int minElement = folge[i];//minElement = 6
            int minIndex = i; // min index = 0
            for (int j = i + 1; j < folge.length; j++) { // j = 6
                if (folge[j] < minElement) { //  if 67< 6
                    minElement = folge[j];
                    minIndex = j; // min index = 6
                }
            }
            // Vertauschen
            folge[minIndex] = folge[i]; // folge[6] = folge[0]
            folge[i] = minElement;
        }
    }

    // 3. Bubblesort (Lässt große Elemente "aufsteigen") O(n²)
    public static void bubblesort(int[] folge) {
//        int[] folge1 = {44, 55, 12, 42, 94, 18, 6, 67};

        boolean vertauscht;
        int n = folge.length;
        do {
            vertauscht = false;
            for (int i = 0; i < n - 1; i++) {
                //44, 12, 55, 42, 94, 18, 6, 67
                // i = 2
                // 44 12 42 55 94 18 6 67
                if (folge[i] > folge[i + 1]) {
                    // Vertauschen
                    int hilf = folge[i]; // 55
                    folge[i] = folge[i + 1]; //folge[1]  = 12
                    folge[i + 1] = hilf; //folge[2] = 55
                    vertauscht = true;
                }
            }
            n--; // Optimierung: Das letzte Element ist bereits am richtigen Platz
        } while (vertauscht);
    }
}
