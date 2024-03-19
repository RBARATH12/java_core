package com.learning.core.day6;

import java.util.*;


public class D06P06 {
    public static void main(String[] args) {
        
        TreeMap<Car, String> carDetails = new TreeMap<>();

       
        carDetails.put(new Car("Bugatti", 80050.0), "1");
        carDetails.put(new Car("Swift", 305000.0), "2");
        carDetails.put(new Car("Audi", 600100.0), "3");
        carDetails.put(new Car("Benz", 900000.0), "4");

       
        System.out.println("Car Prices in Reverse Order:");
        for (Car car : carDetails.keySet()) {
            System.out.println(car);
        }
    }
}

