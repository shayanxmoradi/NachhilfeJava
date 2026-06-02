package org.example.sitzung10;

public class VariableScope {

    // Instanzvariable (Zustand des Objekts)
    private int meineZahl = 10;

    // Klassenvariable (Gehört der Klasse, für alle Objekte gleich)
    private static int anzahlObjekte = 0;

    public VariableScope() {
        anzahlObjekte++; // Zählt mit, wie oft 'new VariableScope()' aufgerufen wird
    }

    public void testSchatten(int meineZahl) { // 'meineZahl' ist hier ein lokaler Parameter
        // KLAUSUR-FALLE: Shadowing (Verdeckung)
        // Die lokale Variable/Parameter überdeckt die Instanzvariable!
        System.out.println("Lokale Zahl (Parameter): " + meineZahl);

        // Um an die Instanzvariable heranzukommen, MÜSSEN wir 'this' benutzen!
        System.out.println("Instanzvariable (this): " + this.meineZahl);
    }

    public void fehlerhafterBlock() {
        int index = 0;
        {
            // KLAUSUR-FALLE: Das hier gibt in Java einen Compiler-Fehler!
            // int index = 3; // "Variable 'index' is already defined"

            // In C wäre das erlaubt (die innere Variable würde die äußere verdecken).
        }
    }

    public static void main(String[] args) {
        System.out.println("=== KLAUSUR-THEMA 1: Variable Scope & Shadowing ===");
        VariableScope obj = new VariableScope();
        obj.testSchatten(99);
    }
}