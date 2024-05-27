package com.example.simpleserver.Poligoni;

public class Rettangolo extends Poligono implements MetodiPoligoni {
    private double base;
    private double altezza;

    // Constructor using primitive data types for base and height
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // Getter for the base
    public double getBase() {
        return base;
    }

    // Setter for the base
    public void setBase(double base) {
        this.base = base;
    }

    // Getter for the height
    public double getAltezza() {
        return altezza;
    }

    // Setter for the height
    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }
    
    @Override
    public double calcoloArea() {
        return (base * altezza);
    }


    @Override
    public String toString() {
        return "Rettangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}'+". L'area vale: " + calcoloArea();
    }

    @Override
    public double calcoloPerimetro() {
        return (base + altezza) * 2;
    }
}