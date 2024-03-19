package com.learning.core.day6;

import java.util.*;


public class D06P04 {
    public static void main(String[] args) {
        
        TreeSet<Book> bookSet = new TreeSet<>();

       
        bookSet.add(new Book(1001, "Python learning", 715.0, "Martin C.Brown", new Date(120, 1, 2)));
        bookSet.add(new Book(1002, "Modern mainframe", 295.0, "Sharad", new Date(97, 4, 19)));
        bookSet.add(new Book(1003, "Java Programming", 523.0, "Gilad Bracha", new Date(84, 10, 23)));
        bookSet.add(new Book(1004, "Read C++", 295.0, "Henry Harvin", new Date(84, 10, 19)));
        bookSet.add(new Book(1005, "Net Platform", 3497.0, "Mark J Price", new Date(84, 2, 6)));

        
        System.out.println("Book Details sorted by Author Names:");
        for (Book book : bookSet) {
            System.out.println(book);
        }
    }
}