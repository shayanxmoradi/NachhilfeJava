package org.example.part1;

// Jedes Java-Programm braucht mindestens eine Klasse und eine main-Methode.
// Der Dateiname MUSS exakt wie der Klassenname sein (hier: HelloWorld.java)
// IntelliJ IDEA speichert Änderungen automatisch.
public class HelloWorld {

    public static void main(String[] args) {
        // System.out.print: Gibt Text aus ohne Zeilenumbruch (ohne Enter)
        System.out.print("Hallo ");

        // System.out.println: Gibt Text aus mit Zeilenumbruch am Ende
        // Wir nutzen hauptsächlich print und println, nicht printf
        System.out.println("INF1!");

        System.out.println("Price: " + 12.3456);
        System.out.printf("Price: %.2f%n", 12.3456);
        System.out.printf("name: %s ", "shayan");
        System.out.println();
        System.out.println(args[0]+" sagt Hallo!");
    }
}