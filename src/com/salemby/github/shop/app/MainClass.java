package com.salemby.github.shop.app;

import com.salemby.github.shop.exception.SameCarException;
import com.salemby.github.shop.model.Car;
import com.salemby.github.shop.model.Garage;

import java.math.BigDecimal;

public class MainClass {
    public static void main(String[] args) {

        Garage mainGarage = new Garage();
        Car civic = new Car("Civic SI", 2016, "123AB321", "Blue", new BigDecimal("160000"));
        Car corolla = new Car("Corolla", 2016, "321BA123", "Silver", new BigDecimal("126988"));

            mainGarage.addToGarage(civic);
            mainGarage.addToGarage(corolla);

        mainGarage.searchCarsByYear(2016);

    }
}
