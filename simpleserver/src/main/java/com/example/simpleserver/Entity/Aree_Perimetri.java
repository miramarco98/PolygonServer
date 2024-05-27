package com.example.simpleserver.Entity;


import jakarta.persistence.*;

@Entity
public class Aree_Perimetri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String poligono;
    private double area;
    private double perimetro;


    public Aree_Perimetri(Long id, String poligono, double area, double perimetro) {
        this.id = id;
        this.poligono = poligono;
        this.area = area;
        this.perimetro = perimetro;
    }
    public Aree_Perimetri() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPoligono() {
        return poligono;
    }

    public void setPoligono(String poligono) {
        this.poligono = poligono;
    }
    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Aree{" +
                "id=" + id +
                ", poligono='" + poligono + '\'' +
                ", area=" + area +
                '}';
    }
}


