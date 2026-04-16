package org.example.part2;
public class Bedingungsoperator {

    public static void main(String[] args) {
        int alter = 20;
        String status;

        // Klassische Schreibweise mit if-else
        if (alter >= 18) {
            status = "Volljährig";
        } else {
            status = "Minderjährig";
        }

        System.out.println("Mit if-else: " + status);

        // Die gleiche Logik kompakt mit dem Bedingungsoperator (? :)
        // Struktur: Bedingung ? Wert_Wenn_True : Wert_Wenn_False
        String statusKompakt = (alter >= 18) ? "Volljährig" : "Minderjährig";

        System.out.println("Mit Bedingungsoperator: " + statusKompakt);
    }
}