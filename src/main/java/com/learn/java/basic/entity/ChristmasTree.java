package com.learn.java.basic.entity;

import java.util.Objects;

public class ChristmasTree implements Good{

    private String name;
    private int height;
    private double price;

    public ChristmasTree() {
    }

    public ChristmasTree(String name, int height, double price) {
        this.name = name;
        this.height = height;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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
        ChristmasTree that = (ChristmasTree) o;
        return height == that.height && Double.compare(that.price, price) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, price);
    }

    @Override
    public String toString() {
        return "ChristmasTree{" +
                "name='" + name + '\'' +
                ", height=" + height +
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
}
