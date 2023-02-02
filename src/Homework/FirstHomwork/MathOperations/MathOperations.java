package Homework.FirstHomwork.MathOperations;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number");
        int b = scanner.nextInt();

         int sum = a + b;
         int minus = a - b;
         int multiply = a * b;
         int divide = a / b;

        System.out.println("Sum " + sum);
        System.out.println("Minus " + minus);
        System.out.println("Multiply " + multiply);
        System.out.println("Divide " + divide);

    }
}
