package Homework.lastHomework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FieldOfMiracle {

    public int[] winningNumbers;

    public FieldOfMiracle() {
        winningNumbers = new int[5];
    }

    public void setWinningNumbers() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int number = random.nextInt(50) + 1;
            while (containsNumber(number)) {
                number = random.nextInt(50) + 1;
            }
            winningNumbers[i] = number;
        }
    }

    public void rollTheBarrel() {
        Scanner scanner = new Scanner(System.in);
        int[] playerNumbers = new int[5];
        System.out.println("Enter five numbers between 1 and 50 and roll the barrel \n" +
                "(to roll the barrel press Enter)");
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            while (number < 1 || number > 50 || containsNumber(number, playerNumbers)) {
                System.out.println("Invalid number. Enter a number between 1 and 50\n" +
                        " that you haven't already entered:");
                number = scanner.nextInt();
            }
            playerNumbers[i] = number;
        }
        checkNumbers(playerNumbers);
    }


    private int[] getMatchingNumbers(int[] playerNumbers) {
        int[] matchingNumbers = new int[5];
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (containsNumber(playerNumbers[i])) {
                matchingNumbers[count] = playerNumbers[i];
                count++;
            }
        }
        return Arrays.copyOf(matchingNumbers, count);
    }

    private boolean containsNumber(int number) {
        for (int i = 0; i < 5; i++) {
            if (winningNumbers[i] == number) {
                return true;
            }
        }
        return false;
    }

    private boolean containsNumber(int number, int[] numbers) {
        for (int i = 0; i < 5; i++) {
            if (numbers[i] == number) {
                return true;
            }
        }
        return false;
    }

    void checkNumbers(int[] playerNumbers) {
        int[] matchingNumbers = getMatchingNumbers(playerNumbers);
        System.out.println("The winning numbers are: " + Arrays.toString(winningNumbers));
        if (matchingNumbers.length == 0) {
            System.out.println("Sorry, you lose. Please follow the link bellow \n" +
                    "https://icdn.lenta.ru/images/2020/11/02/22/20201102220601026/preview_5e85911d1a264ac8ae07f4369f0db966.png");
        }
        if (matchingNumbers.length == 1) {
            System.out.println("Congratulations! You matched " + matchingNumbers.length + " number and you get Cooke \n" +
                    Arrays.toString(matchingNumbers));
        }
        if (matchingNumbers.length == 2) {
            System.out.println("Congratulations! You matched " + matchingNumbers.length + " number and you get Iphone \n" +
                    Arrays.toString(matchingNumbers));
        }if (matchingNumbers.length == 3) {
            System.out.println("Congratulations! You matched " + matchingNumbers.length + "\n" +
                    " number and you get Music synthesizer " + Arrays.toString(matchingNumbers));
        }if (matchingNumbers.length == 4) {
            System.out.println("Congratulations! You matched " + matchingNumbers.length + "\n" +
                    " number and you get MacBook Pro " + Arrays.toString(matchingNumbers));
        }
        if (matchingNumbers.length == 5) {
            System.out.println("Congratulations! You matched " + matchingNumbers.length + "\n" +
                    " all numbers, please follow link bellow to claim your reward\n" +
                    "https://media.tenor.com/7JLi58Ch24gAAAAC/pole-chudes-jakubovich.gif" + Arrays.toString(matchingNumbers));
        }
    }
    public static void main(String[] args) {
        FieldOfMiracle game = new FieldOfMiracle();
        game.setWinningNumbers();
        game.rollTheBarrel();
    }
}

