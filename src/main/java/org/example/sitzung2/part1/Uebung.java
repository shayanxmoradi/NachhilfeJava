package org.example.sitzung2.part1;

// Was sind die Outputs von c und d?
public class Uebung {
    public static void main(String[] args) {
        int c = 5;
        int d = c++;

        c += 2;
        d = --c;

        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}