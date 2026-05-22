package org.example.sitzung5;


import java.util.Stack;

public class UebungsblattLoesung {

    public static void main(String[] args) {

        System.out.println("=== LÖSUNG 1: Die Array-Klausurfallen ===");
        int[] zahlen = new int[5];

        // FEHLER 1: Arrays haben '.length', NICHT '.length()' (Das ist nur für Strings).
        // FEHLER 2: Wegen dem '<=' greift die Schleife auf zahlen[5] zu -> ArrayIndexOutOfBoundsException!
        // KORREKT:
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = i * 10;
        }
        System.out.println("Array erfolgreich gefüllt.");


        System.out.println("\n=== LÖSUNG 2: Arrays von Objekten ===");
        Student[] gruppe = new Student[2];

        // FEHLER: Ein Array von Objekten ist anfangs mit 'null' gefüllt.
        // Man muss erst mit 'new' echte Objekte erzeugen, bevor man auf '.name' zugreifen kann!
        // KORREKT:
        gruppe[0] = new Student(); // <--- DAS FEHLTE!
        gruppe[1] = new Student(); // <--- DAS FEHLTE!

        gruppe[0].name = "Max";
        gruppe[1].name = "Anna";
        System.out.println("Student 1: " + gruppe[0].name);
        System.out.println("Student 2: " + gruppe[1].name);


        System.out.println("\n=== LÖSUNG 3: Stack-Gehirnjogging (UPN) ===");
        Stack<Integer> rechnerStack = new Stack<>();
        rechnerStack.push(20);
        rechnerStack.push(4);

        // KLAUSUR-FALLE (Reihenfolge bei LIFO):
        // Das ERSTE pop() liefert den obersten Wert (4).
        // Das ZWEITE pop() liefert den unteren Wert (20).
        // Für 20 / 4 muss man also zahl2 / zahl1 rechnen!
        int zahl1 = rechnerStack.pop(); // Holt die 4
        int zahl2 = rechnerStack.pop(); // Holt die 20

        int ergebnis = zahl2 / zahl1; // 20 / 4 = 5
        System.out.println("Ergebnis der Division: " + ergebnis);


        System.out.println("\n=== LÖSUNG 4: OOP, Kapselung und this ===");
        Produkt p1 = new Produkt();
        p1.setPreis(50.0);

        // Durch das Hinzufügen von 'this.' in der Klasse funktioniert es jetzt!
        System.out.println("Preis ist: " + p1.getPreis());

        // Die toString() Methode wird automatisch aufgerufen
        System.out.println(p1);
    }
}

class Student {
    String name;
}

class Produkt {
    private double preis;

    public void setPreis(double preis) {
        // KORREKT: 'this' verhindert das Variable-Shadowing!
        this.preis = preis;
    }

    public double getPreis() {
        return preis;
    }

    // KORREKT: Überschriebene toString Methode
    @Override
    public String toString() {
        return "Produkt kostet " + preis + " Euro";
    }
}
