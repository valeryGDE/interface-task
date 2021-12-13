package com.learn.java.basic.entity;

import java.util.Objects;

public class Bookmark implements Good{

    private String name;
    private String material;
    private double price;

    public Bookmark() {
    }

    public Bookmark(String name, String material, double price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bookmark bookmark = (Bookmark) o;
        return Double.compare(bookmark.price, price) == 0 && Objects.equals(name, bookmark.name) && Objects.equals(material, bookmark.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, material, price);
    }

    @Override
    public String toString() {
        return "Bookmark{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int compareTo(Good o) {
        return (int)(this.price - o.price());
    }
}
