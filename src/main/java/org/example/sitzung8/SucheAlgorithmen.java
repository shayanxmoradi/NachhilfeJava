package org.example.sitzung8;

public class SucheAlgorithmen {

    public static void main(String[] args) {
        long[] unsortiert = {44, 55, 12, 42, 94, 18, 6, 67};
        long[] sortiert = {6, 12, 18, 42, 44, 55, 67, 94};

        System.out.println("=== Lineare Suche ===");
        // Geht jedes Element nacheinander durch. O(n)
        int indexLin = lineareSuche(unsortiert, 42);
        System.out.println("Lineare Suche fand 42 an Index: " + indexLin);

        System.out.println("\n=== Binäre Suche ===");
        // Teilt das Array immer in der Hälfte. O(log n). Array MUSS sortiert sein!
        int indexBin = binaereSucheR(sortiert, 42, 0, sortiert.length - 1);
        System.out.println("Binäre Suche fand 42 an Index: " + indexBin);
    }

    // Lineare Suche
    public static int lineareSuche(long[] array, long ziel) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ziel) {
                return i;
            }
        }
        return -1; // Nicht gefunden
    }

    // Binäre Suche (Rekursiv)
    public static int binaereSucheR(long[] array, long ziel, int min, int max) {
        if (min > max) return -1; // Abbruchbedingung

        int index = (min + max) / 2;

        if (ziel == array[index]) {
            return index; // Gefunden!
        }
        if (ziel < array[index]) {
            // In der linken Hälfte weitersuchen
            return binaereSucheR(array, ziel, min, index - 1);
        } else {
            // In der rechten Hälfte weitersuchen
            return binaereSucheR(array, ziel, index + 1, max);
        }
    }
}