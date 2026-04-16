package org.example.part1;

public class TypeCasting {

    public static void main(String[] args) {
        // 1. Implizite Typumwandlung (Automatisch: von klein zu groß)
        // Der Compiler macht das automatisch
        int kleineZahl = 100;
        double grosseZahl = kleineZahl; // int passt problemlos in double
        System.out.println("Implizit (int zu double): " + grosseZahl); // Ausgabe: 100.0

        // 2. Explizite Typumwandlung (Manuell: von groß zu klein)
        // Man muss den Zieltyp in Klammern schreiben. Datenverlust ist möglich!
        double kommazahl = 9.99;
        int ganzzahl = (int) kommazahl; // Nachkommastellen werden einfach abgeschnitten, nicht gerundet! [cite: 486, 488]
        System.out.println("Explizit (double zu int): " + ganzzahl); // Ausgabe: 9

        // 3. Achtung bei der Ganzzahldivision (Klausurfalle!)
        int a = 5;
        int b = 2;
        double ergebnisFalsch = a / b;
        // Rechnet erst 5/2 = 2 (da beides int), wandelt dann in double (2.0) um.
        System.out.println("Falsches Ergebnis (5/2): " + ergebnisFalsch);

        // Lösung: Mindestens eine Zahl muss vorher ein double sein.
        double ergebnisRichtig = (double) a / b;
        System.out.println("Richtiges Ergebnis: " + ergebnisRichtig); // Ausgabe: 2.5
    }
}