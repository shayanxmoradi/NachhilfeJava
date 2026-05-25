package org.example.sitzung7;

public class BinaereSucheAlgorithmus {

    public static void main(String[] args) {
        double[] folge = {1.0, 3.0, 5.0, 7.0, 9.0, 11.0, 13.0, 15.0, 17.0, 19.0};
        double zielWert = 17.0;
        int index = binaereSuche(folge, 0, folge.length - 1, zielWert);
        System.out.println("Gefundener Index für " + zielWert + ": " + index);
    }

    // Aufgabe 4: Binäre Suche (Rekursiv)
    public static int binaereSuche(double[] folge, int startIndex, int endIndex, double zielWert) {

        // 1. Abbruchbedingung: Start-Index hat den End-Index überholt (Wert nicht da!)
        if (startIndex > endIndex) {
            return -1;
        }

        // 2. Die Mitte berechnen
        int mitteIndex = startIndex + ((endIndex - startIndex) / 2);
        // 0 + 9/2  = 4

        // 3. Treffer?
        if (folge[mitteIndex] == zielWert) {
            return mitteIndex;
        }

        // 4. Rekursion: Suchen wir links oder rechts weiter?
        if (folge[mitteIndex] > zielWert) {
            // Wert ist kleiner als die Mitte -> In der UNTEREN (linken) Hälfte weitersuchen
            return binaereSuche(folge, startIndex, mitteIndex - 1, zielWert);
        } else {
            // Wert ist größer als die Mitte -> In der OBEREN (rechten) Hälfte weitersuchen
            return binaereSuche(folge, mitteIndex + 1, endIndex, zielWert);
        }
    }
}