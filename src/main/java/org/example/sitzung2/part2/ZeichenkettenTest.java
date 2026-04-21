package org.example.sitzung2.part2;


public class ZeichenkettenTest {

    public static void main(String[] args) {
        // 1. Strings und Konkatenation
        String s1 = "Java";
        String s2 = "Programmierung";
        String s3 = s1 + " " + s2;
        System.out.println("Zusammen: " + s3);

        // 2. Wichtige String-Methoden
        String text = "Fachhochschule";
        System.out.println("Länge: " + text.length()); // Gibt 14 zurück
        System.out.println("Erstes Zeichen: " + text.charAt(0)); // Gibt 'F' zurück
        System.out.println("hat es F darin? " + text.contains("f"));
        System.out.println("p ist index :" + text.indexOf('f'));
        System.out.println();

        //compare
        String a = "Ali";
        String b = "Ali Sara";

        int result = a.compareTo(b);//negative ali vor sara
        System.out.println("compare res " + result);

        // KLAUSUR-FALLE: substring(startInclusive, endExclusive)
        // Schneidet von Index 0 bis Index 3 (das Zeichen an Index 4 ist NICHT dabei!)
        String teil = text.substring(0, 4);
        System.out.println("Substring (0 bis 4): " + teil);

        System.out.println("---------------------------------");

        // 3. StringBuilder (Für effiziente Textmanipulation)
        // Strings sind "immutable" (unveränderlich). StringBuilder ist veränderlich!
        StringBuilder yourName = new StringBuilder("Hallo");
        System.out.println(yourName.append(""));       // Fügt Text hinzu, ohne ein neues Objekt zu erzeugen
        yourName.append("Welt!");
        System.out.println("StringBuilder Ergebnis: " + yourName.toString());

        StringBuilder fh = new StringBuilder("Fachhochschule Dortmund");
        yourName.append(fh, 0, 11);
        System.out.println("StringBuilder Ergebnis: " + yourName.toString());
    }
}