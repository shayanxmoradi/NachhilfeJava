package org.example.sitzung4;

public class MethodenSignaturMaster {

    // ======================================================
    // 1. WAS GEHÖRT ZUR SIGNATUR?
    // ======================================================
    // Die Signatur besteht NUR aus:
    // - Dem Methodennamen
    // - Der Parameterliste (Anzahl, Typ und Reihenfolge der Parameter)

    public void berechne(int a) { } // Signatur: berechne(int)


    // ======================================================
    // 2. GÜLTIGES ÜBERLADEN (ERLAUBT)
    // ======================================================
    // Methoden dürfen den GLEICHEN Namen haben, wenn die Signatur anders ist.

    // A) Unterschiedliche Anzahl der Parameter
    public void test() { }                   // Signatur: test()
    public void test(int x) { }              // Signatur: test(int)

    // B) Unterschiedliche Datentypen
    public void print(String s) { }          // Signatur: print(String)
    public void print(double d) { }          // Signatur: print(double)

    // C) Unterschiedliche REIHENFOLGE der Typen (WICHTIG!)
    public void format(String s, int i) { }  // Signatur: format(String, int)
    public void format(int i, String s) { }  // Signatur: format(int, String) -> ERLAUBT!


    // ======================================================
    // 3. KLAUSUR-FALLEN (NICHT ERLAUBT -> COMPILER-FEHLER)
    // ======================================================

    // FALLE 1: Unterschiedliche Parameter-NAMEN
    // Java ignoriert die Namen der Variablen. Nur die Typen zählen!
    public void summe(int zahl1, int zahl2) { }
    // public void summe(int a, int b) { }
    // FEHLER: summe(int, int) ist bereits definiert!


    // FALLE 2: Unterschiedlicher RÜCKGABETYP (Der Klassiker!)
    // Der Rückgabetyp gehört NICHT zur Signatur!
    public int getWert() { return 10; }
//     public double getWert() { return 10.5; }
    // FEHLER: Java weiß beim Aufruf nicht, welche Methode gemeint ist.


    // FALLE 3: Static vs. Nicht-Static
    // Auch das Schlüsselwort 'static' ändert die Signatur nicht.
    public static void machWas() { }
//     public void machWas() { }
    // FEHLER: Doppelte Signatur machWas().


    // ======================================================
    // ZUSAMMENFASSUNG FÜR DIE PRÜFUNG
    // ======================================================
    /*
     * GEHÖRT ZUR SIGNATUR:
     * [x] Methodenname
     * [x] Parameter-Anzahl
     * [x] Parameter-Datentypen
     * [x] Parameter-Reihenfolge
     *
     * GEHÖRT NICHT ZUR SIGNATUR:
     * [ ] Rückgabetyp (int, void, etc.)
     * [ ] Sichtbarkeit (public, private)
     * [ ] Parameter-Namen (a, b, x)
     * [ ] Modifikatoren (static, final)
     * [ ] Exceptions (throws Exception)
     */
}