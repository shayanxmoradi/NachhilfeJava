package org.example.part3;

public class InkrementTest {

    public static void main(String[] args) {
        int a = 10;
        int b;

        // Postfix-Inkrement (a++)
        // Hier passiert Folgendes: b bekommt den aktuellen Wert von a (10).
        // DANACH wird a um 1 erhöht (a wird 11).
        b = a++;
        System.out.println("Nach b = a++ :");
        System.out.println("a = " + a); // 11
        System.out.println("b = " + b); // 10

        System.out.println("-----------------");

        // Präfix-Inkrement (++a)
        int x = 10;
        int y;

        // Hier passiert Folgendes: x wird ZUERST um 1 erhöht (x wird 11).
        // DANACH wird dieser neue Wert an y zugewiesen (y wird 11).
        y = ++x;
        System.out.println("Nach y = ++x :");
        System.out.println("x = " + x); // 11
        System.out.println("y = " + y); // 11

        // Verbundoperatoren (Kurzschreibweise)
        int zahl = 5;
        zahl += 3; // Das ist exakt dasselbe wie: zahl = zahl + 3;
        System.out.println("Zahl nach += 3 ist: " + zahl); // 8
    }
}