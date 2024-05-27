package com.example.simpleserver.Poligoni;

public class Triangolo extends Poligono implements MetodiPoligoni {
    private double base;
    private double altezza;
    private double lato2;
    private double lato3;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public Triangolo(double base, double altezza, double lato2, double lato3) {
        this.base = base;
        this.altezza = altezza;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    public double getLato2() {
        return lato2;
    }

    public void setLato2(double lato2) {
        this.lato2 = lato2;
    }

    public double getLato3() {
        return lato3;
    }

    public void setLato3(double lato3) {
        this.lato3 = lato3;
    }

    @Override
    public double calcoloArea() {
        return (base * altezza) / 2;
    }

    @Override
    public String toString() {
        return "Triangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}' +"L'area vale: " + calcoloArea();
    }

    @Override
    public double calcoloPerimetro() {
        return base+lato2+lato3;
    }
}
