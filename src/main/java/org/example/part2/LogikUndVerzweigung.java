package org.example.part2;

public class LogikUndVerzweigung {

    public static void main(String[] args) {
        boolean muede = false;
        boolean nachhilfe = true;

        // Logische Operatoren
        System.out.println("NOT muede: " + (!muede)); // Dreht den Wert um
        System.out.println("muede AND nachhilfe: " + (muede && nachhilfe)); // Beide müssen true sein
        System.out.println("muede OR nachhilfe: " + (muede || nachhilfe)); // Eins muss true sein
        System.out.println("muede XOR nachhilfe: " + (muede ^ nachhilfe)); // Genau eins true, eins false

        // If-Anweisung (Verzweigung)
        if (!muede && nachhilfe) {
            System.out.println("Du bist fit in der Nachhilfe. Sehr gut!");
        } else if (muede && nachhilfe) {
            System.out.println("Ohje, trink einen Kaffee!");
        } else {
            System.out.println("Du bist nicht in der Nachhilfe.");
        }
    }
}