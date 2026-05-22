package org.example.sitzung6;

public class Uebungsblatt {

    public static void main(String[] args) {

        System.out.println("=== AUFGABE 1: Die Referenz-Falle ");
        // Schau dir den folgenden Code an.
        // TODO: Was wird hier auf der Kommandozeile ausgedruckt?
        // Schreibe deine Antwort und eine kurze Begründung als Kommentar auf!
        int[] meinArray = {5, 10, 15};
        int meineZahl = 5;

        verwirren(meineZahl, meinArray);

        // System.out.println("Zahl: " + meineZahl + ", Array[0]: " + meinArray[0]);
        // Deine Antwort: ...


        System.out.println("\n=== AUFGABE 2: Array durchlaufen");
        int[] noten = {2, 1, 3, 4, 2};
        // TODO: Schreibe eine Methode 'berechneDurchschnitt', die ein int-Array übergeben bekommt,
        // den Durchschnitt (Mittelwert) berechnet und als 'double' zurückgibt.
        // double durchschnitt = berechneDurchschnitt(noten);
        // System.out.println("Durchschnitt: " + durchschnitt);


        System.out.println("\n=== AUFGABE 3: Matrix-Diagonale (Spur einer Matrix)");
        double[][] quadratischeMatrix = {
                {2.0, 5.0, 1.0},
                {4.0, 3.0, 8.0},
                {7.0, 9.0, 6.0}
        };
        // TODO: Schreibe eine Methode 'berechneSpur', die die Summe der Hauptdiagonale berechnet.
        // Die Hauptdiagonale sind die Elemente, bei denen Zeilen- und Spaltenindex gleich sind
        // (also [0][0], [1][1], [2][2]). Das Ergebnis sollte hier 2.0 + 3.0 + 6.0 = 11.0 sein.
        // double spur = berechneSpur(quadratischeMatrix);
        // System.out.println("Spur der Matrix: " + spur);


        System.out.println("\n=== BONUS-AUFGABE: OOP Matrix (Transponieren)");
        // TODO: Schau dir die Klasse 'KleineMatrix' unten an.
        // Implementiere die Methode 'transpose()', die eine NEUE Matrix zurückgibt,
        // bei der Zeilen und Spalten vertauscht sind!
    }

    public static void verwirren(int zahl, int[] arr) {
        zahl = 99;
        arr[0] = 99;
    }

    // TODO: Hier die Methode berechneDurchschnitt schreiben

    // TODO: Hier die Methode berechneSpur schreiben
}

// --- Hilfsklasse für die Bonusaufgabe ---
class KleineMatrix {
    private double[][] array;

    public KleineMatrix(int rows, int cols) {
        array = new double[rows][cols];
    }

    public void setElement(int row, int col, double value) {
        array[row][col] = value;
    }

    public double getElement(int row, int col) {
        return array[row][col];
    }

    public int getRows() { return array.length; }
    public int getCols() { return array[0].length; }

    // TODO: Methode implementieren!
    /*
    public KleineMatrix transpose() {
        // ...
    }
    */
}