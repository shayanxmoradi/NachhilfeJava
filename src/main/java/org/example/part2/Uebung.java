package org.example.part2;

import java.util.Scanner;

public class Uebung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("vorlesung: ");
        boolean vorlesung = scanner.nextBoolean();

        System.out.print("vorbereitet: ");
        boolean vorbereitet = scanner.nextBoolean();

        System.out.print("mitarbeitend: ");
        boolean mitarbeitend = scanner.nextBoolean();

        // Auswertung mit if-else
        if (vorlesung && vorbereitet && mitarbeitend) {
            System.out.println("perfekt");
        } else if (!vorlesung && mitarbeitend) {
            System.out.println("Wie geht das?");
        } else {
            System.out.println("könnte besser sein");
        }

        scanner.close();
    }
}