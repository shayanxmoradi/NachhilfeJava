package org.example.sitzung3;


import java.util.Scanner;

public class SwitchTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib einen Wochentag ein (z.B. Montag): ");
        String tag = scanner.next();

        // 1. Traditionelle switch-Anweisung (vor Java 14)
        // WICHTIG: Das 'break' verhindert das Durchfallen (Fall-through).
        switch (tag) {
            case "Montag":
            case "Dienstag":
            case "Mittwoch":
            case "Donnerstag":
            case "Freitag":
                System.out.println("Arbeitstag (Traditionell)");
                break;
            case "Samstag":
            case "Sonntag":
                System.out.println("Wochenende (Traditionell)");
                break;
            default:
                System.out.println("Ungültiger Tag!");
        }

        System.out.println("---------------------------------");

        // 2. Moderne switch-Anweisung (ab Java 14)
        // Hier ist kein 'break' nötig. Mehrere Labels werden mit Komma getrennt.
        switch (tag) {
            case "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag" ->
                    System.out.println("Arbeitstag (Modern)");
            case "Samstag", "Sonntag" ->
                    System.out.println("Wochenende (Modern)");
            default ->
                    {
                        System.out.println("Fehler: Tag nicht erkannt.");
                    }
        }

        scanner.close();

        //gibt's Res aus
        String result = switch (tag) {// tag muss constant sein
            case "Montag", "Dienstag" -> "Arbeitstag";
            case "Samstag", "Sonntag" -> "Wochenende";
            default -> "Fehler";
        };
    }
    //erlaubt
    /// int
    /// char
    /// String
    /// enum

    /// untersagt:
//    double
//    float
//    boolean
//    long
}