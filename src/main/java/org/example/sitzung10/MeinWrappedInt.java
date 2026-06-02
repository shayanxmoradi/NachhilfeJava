package org.example.sitzung10;

// THEORIE: Wir bauen eine eigene Wrapper-Klasse, weil Javas 'Integer' immutable (unveränderlich) ist!
class MeinWrappedInt {
    private int wert;

    public MeinWrappedInt(int wert) {
        this.wert = wert;
    }

    public int getWert() { return wert; }
    public void setWert(int wert) { this.wert = wert; }
}

 class WrapperTauschTheorie {

    public static void main(String[] args) {
        System.out.println("===  TAUSCH MIT EIGENEM WRAPPER ===");

        // THEORIE: Die Objekte entstehen im HEAP.
        // zahl1 und zahl2 sind nur Referenzen (Fernbedienungen) im STACK.
        MeinWrappedInt zahl1 = new MeinWrappedInt(41);
        MeinWrappedInt zahl2 = new MeinWrappedInt(42);

        System.out.println("Vorher: zahl1 = " + zahl1.getWert() + ", zahl2 = " + zahl2.getWert());

        // Wir übergeben eine KOPIE der Fernbedienungen (Referenzen)
        wrapperTausch(zahl1, zahl2);

        System.out.println("Nachher: zahl1 = " + zahl1.getWert() + ", zahl2 = " + zahl2.getWert());
    }

    public static void wrapperTausch(MeinWrappedInt w1, MeinWrappedInt w2) {
        // THEORIE: Wir tauschen NICHT die Referenzen, sondern wir nutzen die Fernbedienungen,
        // um die Werte direkt drüben im HEAP (im Original-Objekt) zu ändern!
        int hilf = w1.getWert();
        w1.setWert(w2.getWert());
        w2.setWert(hilf);
    }
}