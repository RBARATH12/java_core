package com.learning.core.day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class D10P01{

   public static void main(String[] args) throws IOException {
       if (args.length != 2) {
           System.out.println("Usage: java FileCopier <source_file> <destination_file>");
           return;
       }

       File sourceFile = new File(args[0]);
       File destinationFile = new File(args[1]);

       if (!sourceFile.exists()) {
           System.out.println("Error: Source file " + sourceFile.getPath() + " does not exist.");
           return;
       }

       if (destinationFile.exists()) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Destination file " + destinationFile.getPath() + " already exists. Overwrite? (yes/no)");
           String answer = scanner.nextLine().toLowerCase();
           if (!answer.equals("yes")) {
               System.out.println("Copy operation cancelled.");
               return;
           }
       }

       // Copy operation
       try (FileInputStream inputStream = new FileInputStream(sourceFile);
            FileOutputStream outputStream = new FileOutputStream(destinationFile)) {
           byte[] buffer = new byte[1024];
           int bytesRead;
           while ((bytesRead = inputStream.read(buffer)) > 0) {
               outputStream.write(buffer, 0, bytesRead);
           }
           System.out.println("File copied successfully!");
       }
   }
}