package exercise;

import java.util.Scanner;

public class LexicographicalText {
    public static void main(String[] args) {
        System.out.println("Enter First Word:");
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.nextLine().toLowerCase();
        System.out.println("Enter Second Word:");
        String secondWord = scanner.nextLine().toLowerCase();
        if (firstWord.contains(secondWord)) {
            System.out.println("The Words Are Lexicographically Equal");
        } else {
            System.out.println("The Words Are Not Lexicographically Equal");
        }
        scanner.close();
    }
}
