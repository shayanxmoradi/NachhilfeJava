package org.example.sitzung5;

import java.util.Stack;

/**
 * Eine objektorientierte Implementierung eines Stacks (Stapel).
 * Prinzip: LIFO (Last In - First Out)
 */

public class StackBase {

    // Instanzvariablen
    private int[] stack;
    private int maxAnzElements;
    private int top; // Zeigt immer auf den nächsten freien Platz!

    // Konstruktor
    public StackBase(int maxAnzElements) {
        this.maxAnzElements = maxAnzElements;
        this.stack = new int[this.maxAnzElements];
        this.top = 0; // Am Anfang ist der Stack leer
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top >= maxAnzElements;
    }

    // Oben drauflegen
    public void push(int value) {
        if (isFull()) {
            System.out.println("OVERFLOW: Der Stack ist voll!");
        } else {
            stack[top] = value; // Wert auf den aktuellen Top-Platz legen
            top++;              // Top um 1 erhöhen (zeigt jetzt auf den nächsten leeren Platz)
        }
    }

    // Von oben herunternehmen
    public int pop() {
        if (isEmpty()) {
            System.out.println("UNDERFLOW: Der Stack ist leer!");
            return -1; // Fehlercode
        } else {
            top--;              // Zuerst Top um 1 verringern (zeigt jetzt auf das oberste Element)
            return stack[top];  // Element zurückgeben
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Stack-Simulation (LIFO) ===");
        StackBase meinStapel = new StackBase(3);

        meinStapel.push(5);
        meinStapel.push(9);
        meinStapel.push(8);

        // Klausurfalle: Was passiert, wenn wir einen weiteren Wert pushen?
        meinStapel.push(42); // Wird "OVERFLOW" ausgeben!

        // Klausur-Szenario: pop() + pop()
        // Zuerst wird die 8 geholt, dann die 9. -> 8 + 9 = 17
        int zahl1 = meinStapel.pop(); // 8
        int zahl2 = meinStapel.pop(); // 9

        System.out.println("Ergebnis von " + zahl1 + " + " + zahl2 + " = " + (zahl1 + zahl2));



        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        System.out.println(" XXXXXX" +
                           "");

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());

    }
}