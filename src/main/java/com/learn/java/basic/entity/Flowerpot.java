package com.learn.java.basic.entity;

import java.util.Objects;

public class Flowerpot implements Good{

    private String name;
    private String color;
    private double price;

    public Flowerpot() {
    }

    public Flowerpot(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        Flowerpot flowerpot = (Flowerpot) o;
        return Double.compare(flowerpot.price, price) == 0 && Objects.equals(name, flowerpot.name) && Objects.equals(color, flowerpot.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, price);
    }

    @Override
    public String toString() {
        return "Flowerpot{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
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
