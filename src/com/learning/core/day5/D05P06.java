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
        return "Name: " + name + ", ID: " + id + ", Age: " + age + ", Salary: " + salary;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return id == other.id;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.id, o.id);
    }
}

public class D05P06 {
    public static void main(String[] args) {
        TreeSet<Person> personSet = new TreeSet<>();

        // Predefined information of 6 persons
        Person person1 = new Person("John", 101, 30, 50000);
        Person person2 = new Person("Alice", 102, 22, 45000);
        Person person3 = new Person("Bob", 103, 28, 55000);
        Person person4 = new Person("Sarah", 104, 26, 60000);
        Person person5 = new Person("Mike", 105, 24, 48000);
        Person person6 = new Person("Emily", 106, 35, 70000);

        // Storing persons in TreeSet
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);
        personSet.add(person6);

        // Printing all person details whose age is greater than 25
        System.out.println("Person Details with Age > 25:");
        for (Person person : personSet) {
            if (person.getAge() > 25) {
                System.out.println(person);
            }
        }
    }
}