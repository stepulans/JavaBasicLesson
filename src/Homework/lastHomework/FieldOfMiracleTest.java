package Homework.lastHomework;

import java.util.Scanner;

public class FieldOfMiracleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FieldOfMiracle game = new FieldOfMiracle();

        game.winningNumbers = new int[] { 10, 20, 30, 40, 50 };

        int[] playerNumbers = new int[5];
        System.out.println("\"Enter five numbers between 1 and 50 and roll the barrel \\n\" +\n" +
                "                \"(to roll the barrel press Enter)\"");
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            while (number < 1 || number > 50) {
                System.out.println("Invalid number. Enter a number between 1 and 50\\n\" +\n" +
                        "                        \" that you haven't already entered:");
                number = scanner.nextInt();
            }
            playerNumbers[i] = number;
        }

        game.checkNumbers(playerNumbers);
    }

}
