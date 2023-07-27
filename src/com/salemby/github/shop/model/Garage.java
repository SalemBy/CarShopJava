package com.salemby.github.shop.model;

import com.salemby.github.shop.exception.SameCarException;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Car> garageCars = new ArrayList<>();

    public Garage() {

    }


    public List<Car> getGarage() {
    return garageCars;
    }

    public void addToGarage(Car car) {
        try {
            if (garageCars.contains(car)) {
                throw new SameCarException("You can not add two cars with the same chassis code");
            }
            garageCars.add(car);
        } catch (SameCarException e) {
            System.out.println("Error to execute operation: " +e.getMessage());
        }


    }

    public void searchCarsByYear(int year) {
    for (Car car : garageCars ) {
        if (car.getYear() == year ) {
            System.out.println(car);;
        }

    }
    }

}
