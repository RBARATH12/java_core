package com.learning.core.day10;

import java.io.*;



public class D10P06{

    public static void main(String[] args) {

        try {

            // Reading files for semester 1

            BufferedReader englishReader = new BufferedReader(new FileReader("E:\\DavidEnglish.txt"));

            BufferedReader scienceReader = new BufferedReader(new FileReader("E:\\DavidScience.txt"));

            

            // Reading files for semester 2

            BufferedReader computerReader = new BufferedReader(new FileReader("E:\\DavidComputerScience.txt"));

            

            // Writing to DavidNotes.txt

            BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\DavidNotes.txt"));



            // Read and write English notes

            String line;

            writer.write("Semester 1 - English:\n");

            while ((line = englishReader.readLine()) != null) {

                writer.write(line + "\n");

            }

            writer.write("\n");



            // Read and write Science notes

            writer.write("Semester 1 - Science:\n");

            while ((line = scienceReader.readLine()) != null) {

                writer.write(line + "\n");

            }

            writer.write("\n");



            // Read and write Computer notes

            writer.write("Semester 2 - Computer:\n");

            while ((line = computerReader.readLine()) != null) {

                writer.write(line + "\n");

            }



            // Closing resources

            englishReader.close();

            scienceReader.close();

            computerReader.close();

            writer.close();



            System.out.println("Notes for David have been successfully written to DavidNotes.txt.");

        } catch (IOException e) {

            System.out.println("An error occurred: " + e.getMessage());

            e.printStackTrace();

        }

    }

}
