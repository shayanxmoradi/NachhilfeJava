package org.example.sitzung1.part2;

import java.util.Scanner;

public class Uebung2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("deltav (Überschreitung in km/h): ");
        int deltav = input.nextInt();

        // Logik zur Bußgeldberechnung
        if (deltav <= 0) {
            System.out.println("OK");
        } else if (deltav > 0 && deltav <= 10) {
            System.out.println("15 EUR Strafe");
        } else if (deltav > 10) {
            System.out.println("Mindestens 25 EUR Strafe");
        }

        input.close();
    }
}