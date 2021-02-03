package com;

// import java.util.HashMap;
import java.util.Scanner;

public class vowelsCounter {
   
   public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Welcome to the vowels counter");
     System.out.print("Please enter your text:");
     String inputText = scanner.nextLine().toLowerCase();
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
     scanner.close();   
   }
   
   public static char countVowels(char ch) {
      
      return ch;
   }
   
}

