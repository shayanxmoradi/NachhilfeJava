package org.example.part3;
import java.util.Scanner;
//Aktuell nutzt das Programm ein langes if-else.
//Schreibe den Code so um, dass er stattdessen den Bedingungsoperator (? :

public class Uebung2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib eine ganze Zahl ein: ");
        int zahl = scanner.nextInt();

        String ergebnis;

        // --- ÄNDERE DIESEN BLOCK ---
        if (zahl % 2 == 0) { // modulo operator
            ergebnis = "Die Zahl ist gerade.";
        } else {
            ergebnis = "Die Zahl ist ungerade.";
        }
        // ---------------------------

        System.out.println(ergebnis);
        scanner.close();
    }
}