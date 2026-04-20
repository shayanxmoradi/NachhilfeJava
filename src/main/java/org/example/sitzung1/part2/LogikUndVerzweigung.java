package org.example.sitzung1.part2;

public class LogikUndVerzweigung {

    public static void main(String[] args) {
        boolean muede = false;
        boolean nachhilfe = true;

        //Ausdruck hat ein Wert

        // Logische Operatoren
        System.out.println("NOT muede: " + (!muede)); // Dreht den Wert um
        System.out.println("muede AND nachhilfe: " + (muede && nachhilfe)); // Beide müssen true sein
        System.out.println("muede OR nachhilfe: " + (muede || nachhilfe)); // Eins muss true sein
        System.out.println("muede XOR nachhilfe: " + (muede ^ nachhilfe)); // Genau eins true, eins false

        boolean b =  nachhilfe| muede; // beide wird ausgeführt
        boolean c = muede & nachhilfe;// beide wird ausgeführt

        //unirary
        boolean cx  = !muede;


        // If-Anweisung (Verzweigung)
        if (!muede && nachhilfe) {
            System.out.println("Du bist fit in der Nachhilfe. Sehr gut!");
        }  if (muede && nachhilfe) {
            System.out.println("Ohje, trink einen Kaffee!");
        } else {
            System.out.println("Du bist nicht in der Nachhilfe.");
        }
    }
}