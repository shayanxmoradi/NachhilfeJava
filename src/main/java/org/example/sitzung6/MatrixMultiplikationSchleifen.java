package org.example.sitzung6;

public class MatrixMultiplikationSchleifen {

    public static void main(String[] args) {
        // matrixA: 3x2, matrixB: 2x4 -> Ergibt matrixC: 3x4
        int l = 3, m = 2, n = 4;

        double[][] matrixA = {
                {1.0, 2.0},
                {1.0, 2.0},
                {3.0, 4.0}
        };

        double[][] matrixB = {
                {1.0, 2.0, 3.0, 4.0},
                {6.0, 7.0, 8.0, 9.0}
        };

        double[][] matrixC = new double[l][n];

        // --- DER WICHTIGSTE ALGORITHMUS (3 Verschachtelte Schleifen) ---
        // 1. Schleife: Geht durch die Zeilen von A (rowC)
        for (int rowC = 0; rowC < l; rowC++) {

            // 2. Schleife: Geht durch die Spalten von B (columnC)
            for (int columnC = 0; columnC < n; columnC++) {

                matrixC[rowC][columnC] = 0.0; // Initialisieren

                // 3. Schleife: Das Skalarprodukt (Inner Product) berechnen
                // Geht durch die Spalten von A (bzw. Zeilen von B)
                for (int k = 0; k < m; k++) {
                    matrixC[rowC][columnC] += matrixA[rowC][k] * matrixB[k][columnC];
                }
            }
        }

        // Ausgabe (Einfache Kontrolle)
        System.out.println("Ergebnis Matrix C (0,0): " + matrixC[0][0]); // Sollte 13.0 sein
    }
}