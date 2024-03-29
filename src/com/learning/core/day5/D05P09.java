package com.learning.core.day5;

import java.util.TreeSet;


public class  D05P09 {
    public static void main(String[] args) {
        TreeSet<Person> personSet = new TreeSet<>();

        
        Person person1 = new Person("Alice", 101, 30, 50000);
        Person person2 = new Person("Bob", 102, 35, 60000);
        Person person3 = new Person("Charlie", 103, 25, 45000);
        Person person4 = new Person("David", 104, 28, 55000);
        Person person5 = new Person("Eva", 105, 32, 52000);
        Person person6 = new Person("Frank", 106, 29, 57000);

        
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);
        personSet.add(person6);

       
        double sumSalaries = 0;
        for (Person person : personSet) {
            sumSalaries += person.getSalary();
        }

        
        System.out.println("Sum of all salaries: " + sumSalaries);
    }
}