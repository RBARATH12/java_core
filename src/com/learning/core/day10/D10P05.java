package com.learning.core.day10;

import java.io.File;

import java.io.FileWriter;

import java.io.IOException;

import java.util.Scanner;



public class D10P05{



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.println("Enter a string to write to the file:");

        String inputString = scanner.nextLine();



        writeToFile(inputString);

        displayFileSize();

        readFile();

       deleteFile();



        scanner.close();

    }



    public static void writeToFile(String data) {

        try {

            FileWriter writer = new FileWriter("io.txt");

            writer.write(data);

            writer.close();

            System.out.println("Successfully wrote data to io.txt");

        } catch (IOException e) {

            System.err.println("Error writing to file: " + e.getMessage());

        }

    }



    public static void displayFileSize() {

        File file = new File("io.txt");

        if (file.exists()) {

            long fileSize = file.length();

            System.out.println("File size: " + fileSize + " bytes");

        } else {

            System.out.println("io.txt does not exist.");

        }

    }



    public static void readFile() {

        try {

            Scanner reader = new Scanner(new File("io.txt"));

            while (reader.hasNextLine()) {

                String line = reader.nextLine();

                System.out.println(line);

            }

            reader.close();

        } catch (IOException e) {

            System.err.println("Error reading from file: " + e.getMessage());

        }

    }



    public static void deleteFile() {

        File file = new File("io.txt");

        if (file.delete()) {

            System.out.println("io.txt deleted successfully");

        } else {

            System.out.println("Failed to delete io.txt");

        }

    }

}

