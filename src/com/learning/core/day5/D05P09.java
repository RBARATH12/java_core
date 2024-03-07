package com.learning.core.day5;

import java.util.TreeSet;

class Person implements Comparable<Person> {
    private String name;
    private int id;
    private int age;
    private double salary;

    public Person(String name, int id, int age, double salary) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
        return id == person.id;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }
}

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