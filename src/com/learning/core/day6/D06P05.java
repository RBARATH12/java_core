package com.learning.core.day6;

import java.util.Map;
import java.util.TreeMap;

class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ": $" + price;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + Double.hashCode(price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Car car = (Car) obj;
        return Double.compare(car.price, price) == 0 &&
                name.equals(car.name);
    }

    @Override
    public int compareTo(Car otherCar) {
        return Double.compare(this.price, otherCar.price);
    }
}

public class D06P05 {
    public static void main(String[] args) {
        
        Map<Car, String> carDetails = new TreeMap<>();

       
        carDetails.put(new Car("Bugatti", 80050.0), "1");
        carDetails.put(new Car("Swift", 305000.0), "2");
        carDetails.put(new Car("Audi", 600100.0), "3");
        carDetails.put(new Car("Benz", 900000.0), "4");

        
        System.out.println("Car Details:");
        for (Map.Entry<Car, String> entry : carDetails.entrySet()) {
            System.out.println(entry.getValue() + ". " + entry.getKey());
        }
    }
}
