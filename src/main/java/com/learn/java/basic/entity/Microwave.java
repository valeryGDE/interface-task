package com.learn.java.basic.entity;

import java.util.Objects;

public class Microwave extends Appliance {

    public int outputPowerRange;
    public String ovenType;

    public Microwave() {
    }

    public Microwave(double price, String manufacturer, String name, int outputPowerRange, String ovenType) {
        super(price, manufacturer, name);
        this.outputPowerRange = outputPowerRange;
        this.ovenType = ovenType;
    }

    public int getOutputPowerRange() {
        return outputPowerRange;
    }

    public void setOutputPowerRange(int outputPowerRange) {
        this.outputPowerRange = outputPowerRange;
    }

    public String getOvenType() {
        return ovenType;
    }

    public void setOvenType(String ovenType) {
        this.ovenType = ovenType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Microwave microwave = (Microwave) o;
        return outputPowerRange == microwave.outputPowerRange && ovenType == microwave.ovenType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), outputPowerRange, ovenType);
    }

    @Override
    public String toString() {
        return "Microwave{" +
                "price=" + super.getPrice() +
                ", manufacturer=" + super.getManufacturer() +
                ", name=" + super.getName() +
                ", outputPowerRange=" + outputPowerRange +
                ", ovenType=" + ovenType +
                "} ";
    }
}
