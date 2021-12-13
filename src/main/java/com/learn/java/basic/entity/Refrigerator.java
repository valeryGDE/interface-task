package com.learn.java.basic.entity;

import java.util.Objects;

public class Refrigerator extends Appliance {

    private int refrigeratorCapacity;
    private String configuration;

    public Refrigerator() {
    }

    public Refrigerator(double price, Manufacturer manufacturer, String name, int refrigeratorCapacity, String configuration) {
        super(price, manufacturer, name);
        this.refrigeratorCapacity = refrigeratorCapacity;
        this.configuration = configuration;
    }

    public int getRefrigeratorCapacity() {
        return refrigeratorCapacity;
    }

    public void setRefrigeratorCapacity(int refrigeratorCapacity) {
        this.refrigeratorCapacity = refrigeratorCapacity;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Refrigerator that = (Refrigerator) o;
        return refrigeratorCapacity == that.refrigeratorCapacity && Objects.equals(configuration, that.configuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), refrigeratorCapacity, configuration);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "price=" + super.getPrice() +
                ", manufacturer=" + super.getManufacturer() +
                ", name=" + super.getName() +
                ", refrigeratorCapacity=" + refrigeratorCapacity +
                ", configuration='" + configuration + '\'' +
                "} ";
    }
}
