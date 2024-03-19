package com.learning.core.day5;

import java.util.TreeSet;



public class D05P08 {
    public static void main(String[] args) {
        TreeSet<Person> personSet = new TreeSet<>();

        // Predefined information of 6 persons
        Person person1 = new Person("Alice", 101, 30, 50000);
        Person person2 = new Person("Bob", 102, 35, 60000);
        Person person3 = new Person("Charlie", 103, 25, 45000);
        Person person4 = new Person("David", 104, 28, 55000);
        Person person5 = new Person("Eva", 105, 32, 52000);
        Person person6 = new Person("Frank", 106, 29, 57000);

        // Storing persons in TreeSet
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);
        personSet.add(person6);

        // Printing names of all persons in upper case
        System.out.println("Names of all persons in upper case:");
        for (Person person : personSet) {
            System.out.println(person.getName().toUpperCase());
        }
    }
}