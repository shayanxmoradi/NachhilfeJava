package org.example.sitzung11.aufgabe1;

public class Buch {
    private String titel;
    private String autor;

    // Getter und Setter
    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // toString Methode überschreiben
    @Override
    public String toString() {
        return "(" + titel + ", " + autor + ")";
    }
}