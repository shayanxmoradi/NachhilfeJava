package org.example.part1;

public class Datentypen {

    public static void main(String[] args) {
        // Primitive Datentypen in Java

        int alter = 22;
        // int → ganze Zahl
        // Wertebereich: -2^31 bis 2^31 - 1

        double pi = 3.14159;
        // double → Gleitkommazahl mit hoher Präzision
        // Wertebereich: ca. ±2^-1022 bis ±2^1023

        float gewicht = 75.5f;
        // float → Gleitkommazahl (weniger präzise als double)
        // Wertebereich: ca. ±2^-126 bis ±2^127

        boolean istStudent = true;
        // boolean → Wahrheitswert
        // Wertebereich: true oder false

        char anfangsbuchstabe = 'A';
        // char → einzelnes Zeichen
        // Wertebereich: 0 bis 2^16 - 1 (Unicode)

        // Variablen mit Text verknüpfen (Konkatenation mit +)
        System.out.println("Alter: " + alter);
        System.out.println("Gewicht: " + gewicht + " kg");
        System.out.println("Ist Student: " + istStudent);

       /* comments*/
       /** javadoc**/
    }
}