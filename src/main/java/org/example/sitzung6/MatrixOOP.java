package org.example.sitzung6;

/**
 * Objektorientierte Repräsentation einer Matrix
 */
public class MatrixOOP {

    // Die Daten werden in einem 2D-Array gekapselt
    private double[][] array;

    // Konstruktor
    public MatrixOOP(int noOfRows, int noOfColumns) {
        this.array = new double[noOfRows][noOfColumns];
    }

    // Getters
    public int getNoOfRows() {
        return array.length;
    }

    public int getNoOfColumns() {
        return array[0].length;
    }

    public double getElement(int row, int column) {
        return array[row][column];
    }

    public void setElement(int row, int column, double value) {
        array[row][column] = value;
    }

    // Alles auf 0 setzen
    public void setToZero() {
        for (int i = 0; i < getNoOfRows(); i++) {
            for (int j = 0; j < getNoOfColumns(); j++) {
                setElement(i, j, 0.0);
            }
        }
    }

    // Objektorientierte Multiplikation (Achtung: C = A * B)
    // 'this' ist Matrix A, der Parameter ist Matrix B!
    public MatrixOOP mult(MatrixOOP matrixB) {
        int rowsA = this.getNoOfRows();
        int colsA = this.getNoOfColumns();
        int colsB = matrixB.getNoOfColumns();

        // WICHTIG: Prüfung ob Multiplikation überhaupt möglich ist
        if (colsA != matrixB.getNoOfRows()) {
            System.out.println("Fehler: Dimensionen passen nicht!");
            return null;
        }

        MatrixOOP matrixC = new MatrixOOP(rowsA, colsB);

        // Die 3 berühmten Schleifen (wie vorher, nur jetzt objektorientiert)
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                double sum = 0.0;
                for (int k = 0; k < colsA; k++) {
                    sum += this.getElement(i, k) * matrixB.getElement(k, j);
                }
                matrixC.setElement(i, j, sum);
            }
        }
        return matrixC;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < getNoOfRows(); i++) {
            for (int j = 0; j < getNoOfColumns(); j++) {
                sb.append(array[i][j]).append("\t");
            }
            sb.append("\n"); // Neue Zeile am Ende jeder Matrix-Zeile
        }
        return sb.toString();
    }
}
