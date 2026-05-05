package org.example.sitzung6;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Eine objektorientierte Implementierung einer Queue (Warteschlange).
 * Prinzip: FIFO (First In - First Out)
 * Implementierung als Ringpuffer (ohne Umspeichern!)
 */

public class QueueBase {

    private int[] buffer;
    private int maxNoOfElements;

    // Die 3 wichtigsten Variablen für einen Ringpuffer in Java:
    private int head = 0;               // Zeigt auf das erste Element (zum Entnehmen)
    private int tail = 0;               // Zeigt auf den nächsten freien Platz (zum Einfügen)
    private int noOfStoredElements = 0; // Zähler, um zu prüfen ob voll/leer

    public QueueBase(int maxNoOfElements) {
        this.maxNoOfElements = maxNoOfElements;
        this.buffer = new int[this.maxNoOfElements];
    }

    public boolean isEmpty() {
        return noOfStoredElements == 0;
    }

    public boolean isFull() {
        return noOfStoredElements >= buffer.length;
    }

    /**
     * KLAUSUR-THEMA: Der Ringpuffer-Trick!
     * Wenn der Index das Ende des Arrays erreicht, springt er zurück auf 0.
     */
    private int incrementRingBufferIndex(int index) {
        if (index == buffer.length - 1) {
            return 0; // Zurück zum Anfang (Ring!)
        } else {
            return index + 1; // Normal einen weitergehen
        }
    }

    // Hinten anstellen (enqueue / add)
    public void add(int value) {
        if (isFull()) {
            System.out.println("OVERFLOW: Die Queue ist voll!");
        } else {
            buffer[tail] = value;                     // Wert an die tail-Position schreiben
            tail = incrementRingBufferIndex(tail);    // tail clever um 1 erhöhen (Ring-Logik)
            noOfStoredElements++;                     // Zähler erhöhen
        }
    }

    // Vorne entnehmen (dequeue / remove)
    public int remove() {
        if (isEmpty()) {
            System.out.println("UNDERFLOW: Die Queue ist leer!");
            return -1;
        } else {
            int removedElement = buffer[head];        // Element vom head merken
            head = incrementRingBufferIndex(head);    // head clever um 1 erhöhen (Ring-Logik)
            noOfStoredElements--;                     // Zähler verringern
            return removedElement;                    // Gemerktes Element zurückgeben
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Ringpuffer-Queue Simulation (FIFO) ===");
        QueueBase warteSchlange = new QueueBase(3);

        warteSchlange.add(10);
        warteSchlange.add(20);
        warteSchlange.add(30);

        // FALLE: Queue ist jetzt voll!
        warteSchlange.add(40); // OVERFLOW

        // Wir entnehmen das erste Element (FIFO -> die 10 muss rauskommen)
        System.out.println("Entnommen: " + warteSchlange.remove()); // 10

        // Jetzt ist wieder ein Platz frei (Obwohl wir am Ende des Arrays waren,
        // rutscht der 'tail' jetzt dank Ringpuffer wieder auf Index 0!)
        warteSchlange.add(40);
        System.out.println("40 wurde erfolgreich in den Ringpuffer eingefügt.");


        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        System.out.println(q.peek());

        q.poll();
        System.out.println(q.peek());
    }
}