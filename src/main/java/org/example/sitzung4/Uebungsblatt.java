package org.example.sitzung4;

public class Uebungsblatt {

    public static void main(String[] args) {

        System.out.println("=== AUFGABE 1: Methoden-Signatur (Klausur-Falle) ===");
        // Schau dir die folgenden auskommentierten Methoden an.
        // Welche dieser Methoden würden einen Compiler-Fehler verursachen,
        // wenn man sie alle zusammen in diese Klasse schreibt?
        // TODO: Schreibe deine Begründung als Kommentar neben die Methoden.

        /*
        1) public void drucke(int zahl) { }
        2) public void drucke(double zahl) { }
        3) public int drucke(int wert) { return wert; }
        4) public void drucke(int zahl, String text) { }
        5) public void drucke(String text, int zahl) { }
        */


        System.out.println("\n=== AUFGABE 2: Prozedur vs. Funktion ===");
        // Gegeben sind zwei Zahlen.
        double preis = 50.0;
        double rabatt = 10.0;

        // TODO: Erstelle eine Methode 'berechneEndpreis' (außerhalb der main-Methode),
        // die diese beiden Werte als Parameter nimmt, den Endpreis (preis - rabatt)
        // BERECHNET und das Ergebnis ZURÜCKGIBT (Funktion, kein void!).
        // Rufe die Methode hier auf und speichere das Ergebnis in einer Variablen.

        // Dein Code hier:
        // double endpreis = ...


        System.out.println("\n=== AUFGABE 3: Spaghetti-Code reparieren ===");
        // Der Professor mag keine 'break'-Anweisungen!
        // Der folgende Code sucht nach der Zahl 7 und bricht dann ab.
        // TODO: Schreibe die Schleife so um, dass sie OHNE 'break' auskommt
        // (Tipp: Nutze eine boolean-Variable in der Schleifenbedingung!).

        System.out.print("Mit break: ");
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // Dein Code ohne break:
        System.out.print("Ohne break: ");
        // for (...) { ... }


        System.out.println("\n\n=== BONUS-AUFGABE : Call-by-Value (Die böse Falle) ===");
        // Was wird hier ausgedruckt? Überlege genau!
        int x = 10;
        versucheZuAendern(x);
        // TODO: Notiere deine Vermutung, bevor du den Code ausführst.
        // System.out.println("x ist jetzt: " + x);


    }

    // --- Methode für Bonus  ---
    public static void versucheZuAendern(int zahl) {
        zahl = 99;
    }
}

