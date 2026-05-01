package org.example.sitzung3;

class Schleifen {
    public static void main(String[] args) {




        System.out.println("=== 1. Die while-Schleife ===");
        int i = 1;
        // Prüft ZUERST die Bedingung, führt dann den Code aus.
        while (i <= 3) {
            System.out.println("while-Durchlauf: " + i);
            i++;
        }

        System.out.println("\n=== 2. Die do-while-Schleife ===");
        int j = 10;
        // Führt den Code MINDESTENS EINMAL aus, auch wenn die Bedingung von Anfang an falsch ist!
        do {
            System.out.println("do-while-Durchlauf: " + j);
            j++;

        } while (j < 5); // KLAUSUR-FALLE: Vergiss das Semikolon am Ende nicht!


        System.out.println("\n=== 3. Die for-Schleife ===");
        // Ideal, wenn man weiss, wie oft man wiederholen will.
        // Best Practice: Bei 0 anfangen und '<' verwenden (nicht '<=').
        for (int k = 0; k < 3; k++) {
            System.out.println("for-Durchlauf: " + k);
        }

        System.out.println("\n=== 4. KLAUSUR-FALLE: Gleitkommazahlen in Schleifen ===");
        double wert = 0.0;

        // FALSCH: while (wert != 1.0) -> Führt zu einer Endlosschleife wegen Rundungsfehlern!
        // RICHTIG: Nutze '<' oder '>'
        while (wert < 1.0) {
            System.out.println("Wert ist: " + wert);
            wert += 0.2;
        }
    }
}