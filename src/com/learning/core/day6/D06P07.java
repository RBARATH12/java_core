package com.learning.core.day6;

import java.util.*;


public class D06P07 {
    public static void main(String[] args) {
       
        TreeMap<Car, String> carDetails = new TreeMap<>();

        
        carDetails.put(new Car("Bugatti", 80050.0), "1");
        carDetails.put(new Car("Swift", 305000.0), "2");
        carDetails.put(new Car("Audi", 600100.0), "3");
        carDetails.put(new Car("Benz", 900000.0), "4");

       
        Map.Entry<Car, String> greatestEntry = carDetails.lastEntry();
        System.out.println("Car with the greatest price: " + greatestEntry.getValue() + ". " + greatestEntry.getKey());

       
        Map.Entry<Car, String> leastEntry = carDetails.firstEntry();
        System.out.println("Car with the least price: " + leastEntry.getValue() + ". " + leastEntry.getKey());
    }
}
