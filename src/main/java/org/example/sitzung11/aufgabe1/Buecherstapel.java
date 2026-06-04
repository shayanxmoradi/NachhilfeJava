package org.example.sitzung11.aufgabe1;

public class Buecherstapel {
    private Buch[] buchListe;
    private int anzGespeicherterBuecher = 0;

    // Konstruktor
    public Buecherstapel(int maxAnzahlElemente) {
        buchListe = new Buch[maxAnzahlElemente];
    }

    // Prüft, ob der Stapel leer ist
    public boolean istLeer() {
        return anzGespeicherterBuecher == 0;
    }

    // Prüft, ob der Stapel voll ist
    public boolean istVoll() {
        return anzGespeicherterBuecher == buchListe.length;
    }

    // Buch auf den Stapel legen (Push)
    public void buchEinfuegen(Buch buch) {
        if (istVoll()) {
            System.out.println("Der Stack ist voll.");
        } else {
            buchListe[anzGespeicherterBuecher] = buch;
            anzGespeicherterBuecher++;
        }
    }

    // Buch vom Stapel nehmen (Pop)
    public Buch buchEntnehmen() {
        if (istLeer()) {
            System.out.println("Der Stack ist leer.");
            return null;
        } else {
            anzGespeicherterBuecher--; // Zuerst den Index verringern
            Buch entnommenesBuch = buchListe[anzGespeicherterBuecher];
            buchListe[anzGespeicherterBuecher] = null; // Optional: Referenz löschen
            return entnommenesBuch;
        }
    }

    // Ausgabe des Stapels
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < anzGespeicherterBuecher; i++) {
            sb.append(buchListe[i].toString());
            // Komma hinzufügen, außer beim letzten Element
            if (i < anzGespeicherterBuecher - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}