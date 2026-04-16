package org.example.part1;

// WICHTIG: Scanner muss importiert werden!
import java.util.Scanner;

public class EingabeTest {

    public static void main(String[] args) {
        // 1. Scanner-Objekt erstellen, um von der Tastatur (System.in) zu lesen
        Scanner inputScanner = new Scanner(System.in);

        // 2. Benutzer nach einer Eingabe fragen
        System.out.print("Bitte gib dein Alter ein: ");

        // 3. Den eingegebenen Wert lesen und in einer Variable speichern
        int alter = inputScanner.nextInt();

        System.out.print("Bist du muede? (true oder false): ");
        boolean muede = inputScanner.nextBoolean();

        // 4. Eingaben ausgeben
        System.out.println("Zusammenfassung -> Alter: " + alter + ", Muede: " + muede);

        // Gute Praxis: Scanner am Ende schließen
        inputScanner.close();
    }
}