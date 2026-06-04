package org.example.sitzung10;

public class ObjektVergleich {

    public static void main(String[] args) {
        System.out.println(" '==' vs 'equals' ===");
        int a  = 5;
        int b = 6;
       if (a ==b){

       }

        // Wir erzeugen zwei separate Objekte im Heap (mit 'new')
        Float zahl1 = new Float(2.42f);
        Float zahl2 = new Float(2.42f);


//        Float zahl1 = Float.valueOf(2.42f);
//        Float zahl2 = Float.valueOf(2.42f);

        // KLAUSUR-FALLE: Das Ergebnis ist FALSE!
        // '==' vergleicht bei Objekten die Speicheradresse (Referenz), NICHT den Inhalt!
        System.out.println("(zahl1 == zahl2) ist: " + (zahl1 == zahl2)); // false!

        // KORREKT: Um den INHALT von Objekten zu vergleichen, MUSS man .equals() nutzen!
        System.out.println("(zahl1.equals(zahl2)) ist: " + zahl1.equals(zahl2)); // true!


        // --- Zusatzwissen: Wrapper Klassen ---
        // Autoboxing (Java packt den primitiven int automatisch in ein Integer-Objekt)
        Integer meinObjekt = 100;

        // Unboxing (Java holt den primitiven int automatisch wieder raus)
        int meinePrimitiveZahl = meinObjekt;
//       int meinePrimitiveZahl = meinObjekt.intValue();



    }
}