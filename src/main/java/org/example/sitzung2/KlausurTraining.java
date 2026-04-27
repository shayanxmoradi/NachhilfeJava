package org.example.sitzung2;


public class KlausurTraining {

    public static void main(String[] args) {

        System.out.println("=== AUFGABE 1: Die String-Konkatenations-Falle ===");
        int a = 5;
        int b = 4;
        // Was wird hier genau auf der Konsole ausgegeben?
        // Notiere deine Vermutung, bevor du das Programm ausführst!
        System.out.println("Ergebnis A: " + a + b);
        System.out.println("Ergebnis B: " + (a + b));




        System.out.println("\n=== AUFGABE 2: Die unsichtbare Ganzzahldivision ===");
        // Was speichert die Variable 'ergebnis'?
        // Tipp: Denke an die Datentypen der Variablen x und y VOR der Wurzelziehung!
        int x = 9;
        int y = 2;
        double ergebnis = Math.sqrt(x / y);
        // TODO: Gib das 'ergebnis' aus. Warum kommt diese Zahl heraus?



        System.out.println("\n=== AUFGABE 3: Post-Inkrement im Bedingungsoperator ===");
        // Was sind die Werte von m, n und resultat am Ende der Ausführung?
        int m = 10;
        int n = 20;
        boolean check = false;

        int resultat = check ? m++ : n++;
        System.out.println(resultat);

        // TODO: Gib die Werte von m, n und resultat aus und erkläre, was passiert ist.

    }
}