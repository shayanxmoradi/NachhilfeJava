package org.example.sitzung5;

public class Studierender {
    // 1. Instanzvariablen (Zustand) - IMMER private!
    private String name;
    private double note;

    public Studierender() {
    }

    // 2. Setter-Methoden (Um Werte zu setzen)
    public void setName(String name) {
        // 'this' bezieht sich auf die Instanzvariable dieser Klasse
        this.name = name;
    }

    public void setNote(double note) {
        if (note >= 1.0 && note <= 5.0) {
            this.note = note;
        }else {
            this.note = 5.0;
            // print ungueltig
        }
    }

    // 3. Getter-Methoden (Um Werte zu lesen)
    public String getName() {
        return name;
    }

    public double getNote() {
        return note;
    }

    // 4. Instanzmethode (Verhalten)
    public boolean bestanden() {
        return note <= 4.0;
    }

    // WICHTIG: toString() für eine schöne Textausgabe des Objekts
    @Override
    public String toString() {
        return "Student: " + name + " (Note: " + note + ")";
    }
}