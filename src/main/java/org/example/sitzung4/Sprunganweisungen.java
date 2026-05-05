package org.example.sitzung4;

public class Sprunganweisungen {

    public static void main(String[] args) {

        System.out.println("=== 1. Das 'break' Keyword ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Wir brechen die Schleife bei 5 ab!");
                break; // Beendet die Schleife SOFORT
            }
            System.out.print(i + " ");
        }

        System.out.println("\n\n=== 2. Das 'continue' Keyword ===");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Überspringe die 3!");
                continue; // Springt sofort zum nächsten Durchlauf (i++), Rest wird ignoriert
            }
            System.out.println("Zahl: " + i);
        }

        // WICHTIGE THEORIE FÜR DIE KLAUSUR:
        // Bitte so nicht programmieren!
        // Warum? Weil break und continue zu "Spaghetti-Code" führen.
        // Es zerstört die saubere, strukturierte Programmierung.
    }
}