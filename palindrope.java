package com;

import java.util.Scanner;

public class palindrope {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Welcome to the word palindrome checker");  
      System.out.println("Please enter your word:");  
      String word = scanner.nextLine();
      String reversedWord = reverse(word);
      if (word.contains(reversedWord)) {
         System.out.println("The word is palindrome"); 
      } else {
         System.out.println("The word is not palindrome");
      }
      System.out.println("Thanks for using our word palindrome checker");
      scanner.close();
    }
    

    public static String reverse(String b) {
        char[] letters = new char[b.length()];
        
        int letterIndex = 0;
        for(int i = b.length() - 1; i >= 0; i--) {
          letters[letterIndex] = b.charAt(i);
          letterIndex++;
        }
        
        String reverse = "";
        for(int i = 0; i < b.length(); i++) {
          reverse = reverse + letters[i];
        }
        return reverse;
      }
}    
