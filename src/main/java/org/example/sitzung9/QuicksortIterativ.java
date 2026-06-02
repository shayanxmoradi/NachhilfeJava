package org.example.sitzung9;


import java.util.Arrays;
import java.util.Stack;

public class QuicksortIterativ {

    public static void main(String[] args) {
        int[] folge = {40, 7, 77, 68, 18, 54, 96, 87, 85, 71};
        quicksortIterativ(folge);
        System.out.println("Sortiert (Iterativ): " + Arrays.toString(folge));

    }

    // P12 Aufgabe 2
    public static void quicksortIterativ(int[] folge) {
        Stack<Integer> stack = new Stack<>();

        int links = 0;
        int rechts = folge.length - 1;

        // Anfangsgrenzen auf den Stack legen
        stack.push(links);
        stack.push(rechts);

        while (!stack.isEmpty()) {
            // Grenzen wieder herausholen
            rechts = stack.pop();
            links = stack.pop();

            // Array teilen und Pivot-Position bekommen
            int pivotIndex = partition(folge, links, rechts);

            // Linke Hälfte auf den Stack legen, falls vorhanden
            if (pivotIndex - 1 > links) {
                stack.push(links);
                stack.push(pivotIndex - 1);
            }

            // Rechte Hälfte auf den Stack legen, falls vorhanden
            if (pivotIndex + 1 < rechts) {
                stack.push(pivotIndex + 1);
                stack.push(rechts);
            }
        }
    }

    // Hilfsmethode: Partition
    public static int partition(int[] folge, int unten, int oben) {
        int pivotElement = folge[oben];
        int teilungsIndex = unten;

        for (int j = unten; j < oben; j++) {
            if (folge[j] < pivotElement) {
                // Swap
                int hilf = folge[teilungsIndex];
                folge[teilungsIndex] = folge[j];
                folge[j] = hilf;
                teilungsIndex++;
            }
        }
        // Pivot an die richtige Stelle setzen
        int hilf = folge[teilungsIndex];
        folge[teilungsIndex] = folge[oben];
        folge[oben] = hilf;

        return teilungsIndex;
    }
}