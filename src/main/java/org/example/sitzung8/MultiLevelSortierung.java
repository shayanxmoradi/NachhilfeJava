package org.example.sitzung8;

public class MultiLevelSortierung {

    public static void main(String[] args) {
        Kunde k1 = new Kunde("Müller", "Max", 102);
        Kunde k2 = new Kunde("Schmidt", "Anna", 105);
        Kunde k3 = new Kunde("Müller", "Anna", 101);
        Kunde k4 = new Kunde("Müller", "Max", 99);

        Kunde[] kundenListe = {k1, k2, k3, k4};

        bubblesortKunden(kundenListe);

        System.out.println("Sortierte Kundenliste:");
        for (Kunde k : kundenListe) {
            System.out.println(k);
        }
        // Ausgabe sollte sein:
        // Müller, Anna (101)
        // Müller, Max (99)
        // Müller, Max (102)
        // Schmidt, Anna (105)
    }

    public static void bubblesortKunden(Kunde[] folge) {
        boolean vertauscht;
        int laenge = folge.length;
        do {
            vertauscht = false;
            for (int i = 0; i < laenge - 1; i++) {
                if (folge[i].compareTo(folge[i + 1]) > 0) {
                    Kunde hilf = folge[i];
                    folge[i] = folge[i + 1];
                    folge[i + 1] = hilf;
                    vertauscht = true;
                }
            }
            laenge--; // OPTIMIERUNG: Das letzte Element ist schon am richtigen Platz!
        } while (vertauscht);
    }
}

class Kunde implements Comparable<Kunde> {
    private String nachname;
    private String vorname;
    private int id;

    public Kunde(String nachname, String vorname, int id) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.id = id;
    }

    @Override
    public int compareTo(Kunde anderer) {
        // 1. Zuerst nach Nachname sortieren
        int nachnameVergleich = this.nachname.compareTo(anderer.nachname);
        if (nachnameVergleich != 0) {
            return nachnameVergleich;
        }

        // 2. Wenn Nachnamen gleich sind, nach Vorname sortieren
        int vornameVergleich = this.vorname.compareTo(anderer.vorname);
        if (vornameVergleich != 0) {
            return vornameVergleich;
        }

        // 3. Wenn beide Namen gleich sind, nach ID sortieren
        return Integer.compare(this.id, anderer.id);
    }

    @Override
    public String toString() {
        return nachname + ", " + vorname + " (" + id + ")";
    }
}