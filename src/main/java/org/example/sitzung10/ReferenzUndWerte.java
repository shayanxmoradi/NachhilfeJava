package org.example.sitzung10;

import java.util.Arrays;

public class ReferenzUndWerte {

    public static void main(String[] args) {
        System.out.println("=== Call by Value & Referenzen ===");

        // 1. Primitive Datentypen (Kopie des Werts)
        int zahl = 42;
        aendereZahl(zahl);
        System.out.println("Primitive Zahl nach Methode: " + zahl); // Bleibt 42!

        // 2. Arrays (Kopie der REFERENZ!)
        int[] meinArray = {10, 20};
        aendereArray(meinArray);
        System.out.println("Array nach Methode: " + Arrays.toString(meinArray)); // Wird zu [99, 20]!

        // 3. Kann ich in der Methode das komplette Array "löschen"?
        zerstoereArray(meinArray);
        System.out.println("Array nach Zerstörungsversuch: " + Arrays.toString(meinArray)); // Bleibt [99, 20]!
        // Warum? Weil wir nur die KOPIE der Referenz (lokale Variable in der Methode) auf 'null' gesetzt haben!
    }

    public static void aendereZahl(int n) {
        n = 99; // Ändert nur die lokale Kopie im Stack!
    }

    public static void aendereArray(int[] folge) {
        folge[0] = 99; // Greift über die kopierte Referenz auf den Heap zu!
    }

    public static void zerstoereArray(int[] folge) {
        folge = null; // Zerstört nur den LOKALEN "Remote Controller", das Original-Array bleibt sicher!
    }
}