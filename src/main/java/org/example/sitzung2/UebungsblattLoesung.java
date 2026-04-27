package org.example.sitzung2;

public class UebungsblattLoesung {

    public static void main(String[] args) {

        System.out.println("=== AUFGABE 1: Casting und Ganzzahldivision ===");
        int summe = 5;
        int anzahl = 2;

        // Lösung a: Mindestens ein Wert muss zu double gecastet werden
        double durchschnitt = (double) summe / anzahl;
        System.out.println("Durchschnitt: " + durchschnitt); // 2.5

        // Lösung b: Expliziter Cast (Datenverlust der Nachkommastellen)
        double temperatur = 36.9;
        int temperaturGanzzahl = (int) temperatur;
        System.out.println("Temperatur als int: " + temperaturGanzzahl); // 36


        System.out.println("\n=== AUFGABE 2: Inkrement und Operatoren ===");
        int x = 5;
        int y = x++; // y wird 5, DANACH wird x zu 6
        int z = ++x; // x wird 7, DANACH wird z zu 7

        System.out.println("x = " + x); // 7
        System.out.println("y = " + y); // 5
        System.out.println("z = " + z); // 7


        System.out.println("\n=== AUFGABE 3: Strings und Methoden ===");
        String satz = "Programmieren macht Spass!";

        System.out.println("Länge: " + satz.length()); // 26
        System.out.println("Zeichen an Index 4: " + satz.charAt(4)); // 'r'
        System.out.println("Substring: " + satz.substring(0, 13)); // Programmieren
        System.out.println("Enthält 'Spass'? " + satz.contains("Spass")); // true


        System.out.println("\n=== AUFGABE 4: StringBuilder ===");
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" ist cool");
        System.out.println("Ergebnis: " + sb.toString());


        System.out.println("\n=== AUFGABE 5: Das Dangling-Else Problem ===");
        boolean hatGelernt = true;
        boolean istMuede = false;

        // Lösung: Mit geschweiften Klammern { } wird die Zugehörigkeit des 'else' eindeutig.
        if (hatGelernt) {
            if (istMuede) {
                System.out.println("Geh schlafen!");
            }
        } else {
            System.out.println("Du musst noch lernen!");
        }
    }
}