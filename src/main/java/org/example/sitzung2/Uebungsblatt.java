package org.example.sitzung2;

public class Uebungsblatt {

    public static void main(String[] args) {

        System.out.println("=== AUFGABE 1: Casting und Ganzzahldivision ===");
        // a) Berechne den genauen Durchschnitt (3.5) aus den beiden int-Variablen und gib ihn aus.
        int summe = 7;
        int anzahl = 2;
        // TODO: Schreibe deinen Code hier (Achte auf die Klausurfalle!)


        // b) Wandle die folgende Kommazahl in eine Ganzzahl (int) um und gib sie aus.
        double temperatur = 36.9;
        // TODO: Schreibe deinen Code hier



        System.out.println("\n=== AUFGABE 3: Strings und Methoden ===");
        String satz = "Programmieren macht Spass!";
        // a) Wie lang ist der String? Gib die Länge aus.
        // b) Welches Zeichen steht am Index 4?
        // c) Nutze substring(), um nur das Wort "Programmieren" (Index 0 bis 13) zu extrahieren und gib es aus.
        // d) Prüfe mit einer Methode, ob das Wort "Spass" im String vorkommt.
        // TODO: Schreibe deinen Code hier



        System.out.println("\n=== AUFGABE 4: StringBuilder ===");
        // Erstelle einen StringBuilder mit dem Text "Java".
        // Hänge danach (mit append) den Text " ist cool" an und gib das Ergebnis aus.
        // TODO: Schreibe deinen Code hier



        System.out.println("\n=== AUFGABE 5: Das Dangling-Else Problem ===");
        boolean hatGelernt = true;
        boolean istMuede = false;

        // FALLE: Dieser Code ist schlecht formatiert und hat keine geschweiften Klammern { }.
        // TODO: Repariere den Code, indem du die fehlenden { } so setzt,
        // dass das 'else' logisch zum ERSTEN 'if' (hatGelernt) gehört!

        if (hatGelernt)
            if (istMuede)
                System.out.println("Geh schlafen!");
            else
                System.out.println("Du musst noch lernen!");

    }
}