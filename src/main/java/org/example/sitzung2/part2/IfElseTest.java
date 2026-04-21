package org.example.sitzung2.part2;


public class IfElseTest {

    public static void main(String[] args) {

        // 1. Sichere if-else Schreibweise (IMMER mit geschweiften Klammern { })
        int zahl = -4;

        if (zahl < 0) {
            System.out.println(zahl + " ist kleiner als 0.");
        } else if (zahl > 0) {
            System.out.println(zahl + " ist größer als 0.");
        } else {
            System.out.println(zahl + " ist gleich 0.");
        }

        System.out.println("---------------------------------");

        // 2. KLAUSUR-FALLE: Das "Dangling Else" Problem (Herumhängendes else)
        boolean eierVorhanden = true;
        boolean brotVorhanden = false;

        // Falsche Formatierung um dich in der Klausur zu verwirren!
        // Ohne { } gehört das 'else' IMMER zum direkt darüberliegenden 'if'.
        if (eierVorhanden)
            if (brotVorhanden)
                System.out.println("Bringe 6 Brote mit.");
            else
                System.out.println("Bringe 1 Brot mit.");

        //  wird "Bringe 1 Brot mit." ausgedruckt?
        // Das 'else' gehört syntaktisch zum inneren 'if(brotVorhanden)', nicht zum äußeren!
    }
}