package Homework.FirstHomwork.WordSplitter;

import java.util.Scanner;
public class WordSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String word1 = scanner.next();
        int len = word1.length();
        System.out.println("Amount of first word letter is: " + len);


        System.out.println("Enter second word: ");
        String word2 = scanner.next();
        int len2 = word2.length();
        System.out.println("Amount of second word letter is " + len2);

        int half = word1.length() / 2;
        int half2 = word2.length() / 2;
        String word3 = word1.substring(0, half) + word2.substring(half2);
        int len3 = word3.length();

        System.out.println("New word is: " + word3);
        System.out.println("Amount of third word letter is " + len3);
    }
}
