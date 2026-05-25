package org.example.sitzung7;

public class tut {
    public static void main(String[] args) {

    }

    public static void runterZaehlen(int n) {// input 3 , output?
        System.out.println(n);
        runterZaehlen(n - 1);
        //Abruch faelt hier
    }




    public static int summe(int n) {// input 3 , output?
        if (n == 0) return 0;
        return n + summe(n - 1);
    }

    // 3 + summe(2)
    // 3 + 2 + summe(1)
    // 3 + 2 + 1 + summe(0)
    // 3 + 2 + 1 + 0 = 6





    public static int rekursion(int n) {
        if (n <= 0) return 0;
        return n + rekursion(n--); // <---ACHTUNG!!!
//        return n + rekursion(--n); // <---FINE!
    }
    // input :4
    // 4 + rekursion(4)
    // 4 + 4 + rekursion(4)
    // Endlosschleife
}
