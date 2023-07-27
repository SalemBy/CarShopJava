package com.salemby.github.shop.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {

    private String model;
    private int year;
    private String chassisCode;
    private String color;
    private BigDecimal value;

    public Car() {

    }

    public Car(String model, int year, String chassisCode, String color, BigDecimal value) {
        Objects.requireNonNull(chassisCode, model);
        this.model = model;
        this.year = year;
        this.chassisCode = chassisCode;
        this.color = color;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", chassisCode='" + chassisCode + '\'' +
                ", color='" + color + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(chassisCode, car.chassisCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chassisCode);
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getChassisCode() {
        return chassisCode;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
