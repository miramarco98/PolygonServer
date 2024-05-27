package com.example.simpleserver.Poligoni;

public  class Quadrato extends Poligono implements MetodiPoligoni{

private final double lato;

    public Quadrato(double lato) {
        this.lato = lato;
    }

    @Override
    public double calcoloArea() {
        return (lato*lato);
    }

    @Override
    public String toString() {
        return "Quadrato{" +"lato=" + lato + '}'
                +"L'area vale: " + calcoloArea();
    }

    @Override
    public double calcoloPerimetro() {
        return lato*4;
    }

    public String getLato() {
        return null;
    }
}
