package org.example.sitzung6;

public class VectorAndMatrixV {
    public static void main(String[] args) {
        System.out.println("=== Ansatz c: Matrix als Array von Vektoren ===");
        // Hier kannst du die MatrixV testen, ähnlich wie in der Vorlesung.
    }
}

// 1. Die Vector Klasse (Kapselt ein 1D-Array)
class Vector {
    private double[] array;

    public Vector(int noOfElements) {
        array = new double[noOfElements];
    }

    public int getNoOfElements() {
        return array.length;
    }

    public double getElement(int index) {
        return array[index];
    }

    public void setElement(int index, double value) {
        array[index] = value;
    }

    // Skalarprodukt zweier Vektoren berechnen
    public double innerProduct(Vector vectorB) {
        double result = 0;
        for (int index = 0; index < getNoOfElements(); index++) {
            result += this.getElement(index) * vectorB.getElement(index);
        }
        return result;
    }
}

// 2. Die MatrixV Klasse (Kapselt ein Array von Vector-Objekten)
class MatrixV {
    private Vector[] array; // Ein Array, in dem jedes Element ein Vektor ist!

    public MatrixV(int noOfRows, int noOfColumns) {
        array = new Vector[noOfRows];
        for (int row = 0; row < noOfRows; row++) {
            array[row] = new Vector(noOfColumns); // Jede Zeile ist ein neuer Vektor
        }
    }

    public int getNoOfRows() {
        return array.length;
    }

    public int getNoOfColumns() {
        return array[0].getNoOfElements();
    }

    public void setElement(int row, int column, double value) {
        array[row].setElement(column, value);
    }

    // Hilfsmethode: Extrahiert eine ganze Spalte als neuen Vektor
    public Vector getColumnVector(int column) {
        Vector columnVector = new Vector(getNoOfRows());
        for (int row = 0; row < getNoOfRows(); row++) {
            columnVector.setElement(row, array[row].getElement(column));
        }
        return columnVector;
    }

    // Objektorientierte Multiplikation mit Vektoren

    public MatrixV mult(MatrixV matrixB) {
        MatrixV matrixC = new MatrixV(this.getNoOfRows(), matrixB.getNoOfColumns());

        for (int rowA = 0; rowA < this.getNoOfRows(); rowA++) {
            for (int columnB = 0; columnB < matrixB.getNoOfColumns(); columnB++) {

                // Wir holen uns die Spalte von B als Vektor
                Vector columnVectorB = matrixB.getColumnVector(columnB);

                // ... und rufen das innerProduct vom Zeilenvektor A auf!
                double resultValue = this.array[rowA].innerProduct(columnVectorB);
                matrixC.setElement(rowA, columnB, resultValue);
            }
        }
        return matrixC;
    }
}