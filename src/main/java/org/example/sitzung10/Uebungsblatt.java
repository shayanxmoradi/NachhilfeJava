package org.example.sitzung10;

public class Uebungsblatt {

    public static void main(String[] args) {

        System.out.println("=== AUFGABE 1: Scope und Shadowing ===");
        // TODO: Schau dir die Klasse 'Konto' unten an.
        // Warum bleibt der Kontostand nach dem Aufruf von 'einzahlen(50)' immer noch 0?
        // Repariere die Methode 'einzahlen'!
        Konto meinKonto = new Konto();
        meinKonto.einzahlen(50);
        System.out.println("Kontostand ist: " + meinKonto.getKontostand());


        System.out.println("\n=== AUFGABE 2: Call by Value (Array) ===");
        // TODO: Wir wollen die Werte an Index 0 und Index 1 eines Arrays vertauschen.
        // Schreibe die Logik in die Methode 'vertauscheArrayElemente' (ganz unten).
        int[] zahlen = {100, 200};
        vertauscheArrayElemente(zahlen);
        System.out.println("Nach dem Tausch: [" + zahlen[0] + ", " + zahlen[1] + "]");
        // Sollte [200, 100] ausgeben!


        System.out.println("\n=== AUFGABE 3: equals() überschreiben ===");
        // TODO: Wir haben zwei Studenten mit der exakt gleichen Matrikelnummer.
        // Für Java sind es aber zwei verschiedene Objekte im Heap (student1 == student2 ist FALSE).
        // Überschreibe die 'equals' Methode in der Klasse 'Student' (unten),
        // damit student1.equals(student2) TRUE zurückgibt!
        Student student1 = new Student("Max", 12345);
        Student student2 = new Student("Max", 12345);

        System.out.println("Gleicher Student? " + student1.equals(student2));
        // Sollte 'true' sein, wenn du Aufgabe 3 richtig gelöst hast!
    }

    public static void vertauscheArrayElemente(int[] arr) {
        // TODO: Schreibe hier den Code für Aufgabe 2 (Nutze eine 'hilf' Variable)

    }
}

// --- Hilfsklassen für die Aufgaben ---

class Konto {
    private int kontostand = 0;

    public void einzahlen(int kontostand) {
        // FEHLER IST HIER:
        kontostand = kontostand;
    }

    public int getKontostand() {
        return kontostand;
    }
}

class Student {
    private String name;
    private int matrikelnummer;

    public Student(String name, int matrikelnummer) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
    }

    // TODO: Schreibe hier die Methode public boolean equals(Student anderer) { ... }

}