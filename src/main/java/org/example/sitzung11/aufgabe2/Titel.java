package org.example.sitzung11.aufgabe2;

public class Titel {
    private String name;
    private String interpret;

    // Getter und Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInterpret() {
        return interpret;
    }

    public void setInterpret(String interpret) {
        this.interpret = interpret;
    }

    // toString Methode überschreiben
    @Override
    public String toString() {
        return "(" + name + ", " + interpret + ")";
    }
}