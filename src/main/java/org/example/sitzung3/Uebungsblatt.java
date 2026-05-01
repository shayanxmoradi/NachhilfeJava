package org.example.sitzung3;

public class Uebungsblatt {

    public static void main(String[] args) {

        System.out.println("=== AUFGABE 1: Wertebereiche (Wrapper-Klassen) ===");
        // Du brauchst die Werte nicht auswendig zu wissen!
        // TODO: a) Gib den kleinstmöglichen Wert für den Datentyp 'long' aus.
        // TODO: b) Gib aus, wie viel Speicherplatz (in Bytes) der Datentyp 'float' benötigt.

        // Dein Code hier:



        System.out.println("\n=== AUFGABE 2: Switch-Fallen und Modern Switch ===");
        int note = 2;
        String bewertung;

        // Was wird hier ausgegeben, wenn note = 2 ist? (Überlege, bevor du es testest!)
        // TODO: Repariere den Code, damit er richtig funktioniert (nur "Gut" ausgibt).
        switch (note) {
            case 1:
                System.out.println("Sehr gut");
            case 2:
                System.out.println("Gut");
            case 3:
                System.out.println("Befriedigend");
            default:
                System.out.println("Durchgefallen");
        }

        //
        // TODO: Schreibe die Logik von oben neu, aber nutze das moderne Switch (ab Java 14)
        // mit dem '->' Operator, um das Ergebnis DIREKT in der Variable 'bewertung' zu speichern.
        // Hinweis: Vergiss das Semikolon am Ende der Zuweisung nicht!



        System.out.println("\n=== AUFGABE 3: Schleifen-Fallen (Fehlersuche) ===");

        // a) Die kaputte do-while-Schleife
        // TODO: Dieser Code hat einen Syntaxfehler. Finde und korrigiere ihn!
        /*
        int counter = 0;
        do {
            System.out.println("Counter: " + counter);
            counter++;
        } while (counter < 3)
        */

        // b) Die Endlosschleife (Gleitkomma-Falle)
        // TODO: Dieser Code erzeugt eine Endlosschleife. Ändere die Bedingung,
        // damit die Schleife bei ca. 1.0 stoppt.
        /*
        for (double d = 0.0; d != 1.0; d += 0.1) {
            System.out.println("d ist: " + d);
        }
        */



        System.out.println("\n=== AUFGABE 4: Querprodukt (Mathe & Schleifen) ===");
        // Anstatt der Quersumme (Addition) sollst du hier das Querprodukt (Multiplikation) berechnen.
        // Beispiel: Die Zahl 342 soll 24 ergeben (3 * 4 * 2).
        int zahl = 342;

        // TODO: Schreibe eine while-Schleife, die das Querprodukt berechnet.
        // TIPP: Denk daran, mit welchem Startwert du die Produkt-Variable initialisieren musst!
        // (0 wäre hier eine schlechte Idee...)

        // Dein Code hier:

    }
}