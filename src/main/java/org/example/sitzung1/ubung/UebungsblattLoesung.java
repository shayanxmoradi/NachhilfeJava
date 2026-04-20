package org.example.sitzung1.ubung;


public class UebungsblattLoesung {

    public static void main(String[] args) {

        // ==========================================
        // LÖSUNG 1: Datentypen und Formatierung
        // ==========================================
        float note = 2.3f;
        String kurs = "Java Nachhilfe";

        // %s ist für String, %f ist für float/double.
        // (Optional kann man auch System.out.println("Im Kurs " + kurs + " ...") machen)
        System.out.println("Im Kurs %s habe ich die Note %f bekommen.".formatted(kurs, note));


        System.out.println("\n---------------------------------");

        // ==========================================
        // LÖSUNG 2: Modulo-Operator (%) und if-else
        // ==========================================
        int zahl = 27;

        if (zahl % 3 == 0) {
            System.out.println(zahl + " ist Teilbar durch 3");
        } else {
            System.out.println(zahl + " ist Nicht teilbar durch 3");
        }


        System.out.println("\n---------------------------------");

        // ==========================================
        // LÖSUNG 3: Bedingungsoperator (? :)
        // ==========================================
        int punkte = 85;

        // Kompakte Zuweisung in einer Zeile
        String bestanden = (punkte >= 50) ? "Ja" : "Nein";

        System.out.println("Bestanden: " + bestanden);


        System.out.println("\n---------------------------------");

        // ==========================================
        // LÖSUNG 4: Kurzschluss-Operatoren
        // ==========================================
        int x = 5;
        int y = 10;

        boolean test = (y == 10) || (++x > 5);

        // Erklärung für den Schüler:
        // Weil 'y == 10' true ist und wir ein logisches ODER (||) als Kurzschluss-Operator
        // verwenden, wird der rechte Teil '(++x > 5)' GAR NICHT mehr ausgeführt.
        // Deshalb bleibt x unverändert auf 5.

        System.out.println("Wert von x ist: " + x); // Gibt 5 aus!
        System.out.println("Wert von y ist: " + y); // Gibt 10 aus!
    }
}