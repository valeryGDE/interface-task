package com.learn.java.basic.entity;

import java.util.Objects;

public class Appliance implements Good{

    private double price;
    private String manufacturer;
    private String name;

    public Appliance() {
    }

    public Appliance(double price, String manufacturer, String type) {
        this.price = price;
        this.manufacturer = manufacturer;
        this.name = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        return Double.compare(appliance.price, price) == 0 && Objects.equals(manufacturer, appliance.manufacturer) && Objects.equals(name, appliance.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, manufacturer, name);
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", type='" + name + '\'' +
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
