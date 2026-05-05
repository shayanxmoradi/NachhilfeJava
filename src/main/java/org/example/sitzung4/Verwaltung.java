package org.example.sitzung4;

public class Verwaltung {
    public static void main(String[] args) {
        // Erzeugung (Instanziierung) eines Objekts
        Studierender s1 = new Studierender();

        // Zugriff über Setter
        s1.setName("Ali");
        s1.setNote(1.3);

        // Nutzung der Methoden
        System.out.println(s1.toString());
        System.out.println("Bestanden? " + s1.bestanden());
    }
}