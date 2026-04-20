package org.example.sitzung1.ubung;

public class Uebungsblatt {

    public static void main(String[] args) {

        // ==========================================
        // AUFGABE 1: Datentypen und Formatierung
        // ==========================================
        // a) Erstelle eine Variable vom Typ 'float' für eine Note (z.B. 2.3). Vergiss das 'f' nicht!
        // b) Erstelle eine Variable vom Typ 'String' für einen Kursnamen (z.B. "Java Nachhilfe").
        // c) Nutze die .formatted() Methode, um folgenden Satz auf der Konsole auszugeben:
        //    "Im Kurs [Kursname] habe ich die Note [Note] bekommen."

        // TODO: Schreibe deinen Code für Aufgabe 1 hier:



        System.out.println("\n---------------------------------");

        // ==========================================
        // AUFGABE 2: Modulo-Operator (%) und if-else
        // ==========================================
        // a) Erstelle eine 'int' Variable namens 'zahl' mit dem Wert 27.
        // b) Prüfe mit dem Modulo-Operator und einer if-else-Anweisung,
        //    ob die Zahl ohne Rest durch 3 teilbar ist.
        // c) Gib "Teilbar durch 3" aus, wenn ja, ansonsten "Nicht teilbar durch 3".

        // TODO: Schreibe deinen Code für Aufgabe 2 hier:



        System.out.println("\n---------------------------------");

        // ==========================================
        // AUFGABE 3: Bedingungsoperator (? :)
        // ==========================================
        // Wandle den folgenden auskommentierten if-else Block in EINE einzige Zeile
        // mit dem Bedingungsoperator (? :) um.

        int punkte = 85;
        String bestanden;

        /*
        if (punkte >= 50) {
            bestanden = "Ja";
        } else {
            bestanden = "Nein";
        }
        */

        // TODO: Schreibe deinen Code für Aufgabe 3 hier (bestanden = ...):

        // System.out.println("Bestanden: " + bestanden);


        System.out.println("\n---------------------------------");

        // ==========================================
        // AUFGABE 4: Kurzschluss-Operatoren (Klausur-Falle!)
        // ==========================================
        // Gegeben sind die folgenden Variablen:
        int x = 5;
        int y = 10;

        // Was ist der Wert von x und y nach der Ausführung der folgenden Zeile?
        // Überlege zuerst im Kopf (wie in der Klausur) und schreibe deine Vermutung als Kommentar.
        boolean test = (y == 10) || (++x > 5);

        // TODO: Schreibe deinen Code hier, um die Werte von x und y mit System.out.println auszugeben
        // und deine Vermutung zu überprüfen:


    }
}