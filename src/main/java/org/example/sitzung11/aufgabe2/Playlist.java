package org.example.sitzung11.aufgabe2;

public class Playlist {
    private Titel[] titelListe;
    private int anzGespeicherterTitel = 0;

    // Konstruktor
    public Playlist(int maxAnzahlElemente) {
        titelListe = new Titel[maxAnzahlElemente];
    }

    // Prüft, ob die Playlist leer ist
    public boolean istLeer() {
        return anzGespeicherterTitel == 0;
    }

    // Prüft, ob die Playlist voll ist
    public boolean istVoll() {
        return anzGespeicherterTitel == titelListe.length;
    }

    // Titel ans Ende der Queue anfügen (Enqueue)
    public void titelEinfuegen(Titel titel) {
        if (istVoll()) {
            System.out.println("Die Queue ist voll.");
        } else {
            titelListe[anzGespeicherterTitel] = titel;
            anzGespeicherterTitel++;
        }
    }

    // Titel vom Anfang der Queue entnehmen (Dequeue)
    public Titel titelEntnehmen() {
        if (istLeer()) {
            System.out.println("Die Queue ist leer.");
            return null;
        } else {
            // Das erste Element (Index 0) zwischenspeichern
            Titel entnommenerTitel = titelListe[0];

            // ALLE restlichen Elemente um eine Position nach links verschieben (Shift)
            for (int i = 0; i < anzGespeicherterTitel - 1; i++) {
                titelListe[i] = titelListe[i + 1];
            }

            // Den Zähler verringern und den letzten (jetzt doppelten) Eintrag löschen
            anzGespeicherterTitel--;
            titelListe[anzGespeicherterTitel] = null; // Optional: Referenz löschen

            return entnommenerTitel;
        }
    }

    // Ausgabe der Queue
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < anzGespeicherterTitel; i++) {
            sb.append(titelListe[i].toString());
            // Komma hinzufügen, außer beim letzten Element
            if (i < anzGespeicherterTitel - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}