package Homework.FirstHomwork.WordSplitter;

import java.util.Scanner;

public class WordSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first word ");
        String word1 = scanner.nextLine();

        System.out.println("Enter second name ");
        String word2 = scanner.nextLine();

        int half = word1.length() / 2;
        int half2 = word2.length() / 2;
        String word3 = word1.substring(0, half) + word2.substring(half2, 0);

        System.out.println("New word is: " + word3);
    }
}
