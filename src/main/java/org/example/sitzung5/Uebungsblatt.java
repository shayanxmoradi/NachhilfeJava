package org.example.sitzung5;

import java.util.Stack;

public class Uebungsblatt {

    public static void main(String[] args) {

        System.out.println("=== AUFGABE 1: Die Array-Klausurfallen (Fehlersuche) ===");
        // Der folgende Code hat 3 schlimme Klausur-Fehler (Compiler-Fehler oder Abstürze zur Laufzeit).
        // TODO: Finde die Fehler, kommentiere sie aus und schreibe die korrekte Version darunter.

        /*
        int[] zahlen = new int[5];
        for (int i = 0; i <= zahlen.length(); i++) {
            zahlen[i] = i * 10;
        }
        */

        System.out.println("\n=== AUFGABE 2: Arrays von Objekten (Der böse Absturz) ===");
        // TODO: Warum stürzt dieses Programm mit einer 'NullPointerException' ab?
        // Repariere den Code, sodass "Student 1: Max" und "Student 2: Anna" richtig ausgegeben werden.


        Student[] gruppe = new Student[2];
        gruppe[0].name = "Max";
        gruppe[1].name = "Anna";
        System.out.println("Student 1: " + gruppe[0].name);



        System.out.println("\n=== AUFGABE 3: Stack-Gehirnjogging (LIFO & Mathematik) ===");
        // Ein typisches Klausur-Szenario zur umgekehrten polnischen Notation (UPN).
        // Wir nutzen die Java-Klasse java.util.Stack.
        Stack<Integer> rechnerStack = new Stack<>();

        rechnerStack.push(20);
        rechnerStack.push(4);

        // TODO: Wir wollen 20 geteilt durch 4 (20 / 4) rechnen.
        // Entnehme die Werte mit pop() in der RICHTIGEN Reihenfolge,
        // berechne das Ergebnis und gib es aus. (Achtung: 4 / 20 wäre falsch!)

        // int zahl1 = ...
        // int zahl2 = ...
        // int ergebnis = ...
        // System.out.println("Ergebnis der Division: " + ergebnis);


        System.out.println("\n=== AUFGABE 4: OOP, Kapselung und this ===");
        // Schau dir die Klasse 'Produkt' unten an.
        Produkt p1 = new Produkt();
        p1.setPreis(50.0);

        // TODO a: Warum ist der Preis hier immer noch 0.0? Repariere die setPreis-Methode unten!
        System.out.println("Preis ist: " + p1.getPreis());

        // TODO b: Füge der Klasse 'Produkt' eine toString() Methode hinzu,
        // sodass die nächste Zeile z.B. "Produkt kostet 50.0 Euro" ausgibt.
        // System.out.println(p1);
    }
}

// --- Hilfsklassen für die Aufgaben ---

//class Student {
//    String name;
//}
//
//class Produkt {
//    private double preis;
//
//    public void setPreis(double preis) {
//        // Hier ist ein Klausur-Fehler versteckt!
//        preis = preis;
//    }
//
//    public double getPreis() {
//        return preis;
//    }
//
//    // TODO: toString() Methode hier überschreiben!
//}