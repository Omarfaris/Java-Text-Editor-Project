package com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileReaderTwo {
   public static void main(String[] args) throws IOException {
       System.out.println("Welcome to the File Reader");
       System.out.println("Please Enter your File Path");
       
       Scanner generalScanner = new Scanner(System.in);
       
       String firstFilePath = generalScanner.nextLine();
       File fileOne = new File(firstFilePath);
       Scanner fileOneScanner = new Scanner(fileOne);  
       String fileOneContent = Files.readString(Paths.get(firstFilePath));

       System.out.println("Please Enter Your Command");
       System.out.println("COUNT.WORDS to count words, COUNT.VOWELS to count vowels, PRINT.FILE to print file contents, ADD.TO.FILE to add to this file in a new file");

       String command = generalScanner.nextLine();

       if (command.contains("COUNT.WORDS")) {
        int wordCount = 0;
        while (fileOneScanner.hasNext()) {
          String fileWords = fileOneScanner.next();
          wordCount++;
       }
       System.out.println(wordCount);
    } else if (command.contains("COUNT.VOWELS")) {
        String inputText = fileOneContent.toLowerCase();
        int textLength = inputText.length();     
        char ch;
        int count = 0;
        for (int i = 0; i < textLength; i++) {
           ch = inputText.charAt(i);
           
           if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
             count++;
           }
        }
        System.out.println("Number of vowels = " + count);
     
    } else if  (command.contains("PRINT.FILE")) {
         System.out.println(fileOneContent);

         
        } else if (command.contains("ADD.TO.FILE")) {
         System.out.println("Please Enter Your New File Path:");  
         String secondFilePath = generalScanner.nextLine();
         
         FileWriter addToFile = new FileWriter(secondFilePath);
         File fileTwo = new File(secondFilePath);
         Scanner fileTwoScanner = new Scanner(fileTwo);
         
         System.out.println("Please Enter Your Additions:");
         String newContent = generalScanner.nextLine();
         newContent = newContent.concat(fileOneContent);

          addToFile.write(newContent);
          addToFile.close();

          System.out.println("Please Enter Your Command");
          System.out.println("COUNT.WORDS to count words, COUNT.VOWELS to count vowels, PRINT.FILE to print file contents");
          String commandTwo = generalScanner.nextLine();

          if (commandTwo.contains("COUNT.WORDS")) {
            int wordCount = 0;
            while (fileTwoScanner.hasNext()) {
              String fileWords = fileTwoScanner.next();
              wordCount++;
           }
           System.out.println(wordCount);
        } else if (commandTwo.contains("COUNT.VOWELS")) {
            String inputText = newContent.toLowerCase();
            int textLength = inputText.length();     
            char ch;
            int count = 0;
            for (int i = 0; i < textLength; i++) {
               ch = inputText.charAt(i);
               
               if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                 count++;
               }
            }
            System.out.println("Number of vowels = " + count);
         
        } else if  (commandTwo.contains("PRINT.FILE")) {
             System.out.println(newContent);
    
             
            }
            fileTwoScanner.close();
          
         
         
        } else {
         System.out.println("COMMAND INVALID!");
     }

     fileOneScanner.close();
     generalScanner.close();
     
    }
   }