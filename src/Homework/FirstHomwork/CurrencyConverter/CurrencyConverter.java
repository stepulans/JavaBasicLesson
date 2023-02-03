package Homework.FirstHomwork.CurrencyConverter;
import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println("1 Ruble");
        System.out.println("2 Dollar");

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the currency");

        int choice = sc.nextInt();
        System.out.println("Enter the amount");

        double amount = sc.nextDouble();
        switch (choice) {
            case 1:
                Ruble_to_Dollar(amount);
                break;
            case 2:
                Dollar_to_Ruble(amount);
                break;
        }

    }

    public static void Ruble_to_Dollar(double amt) {
        System.out.println("1 Ruble = " + 0.013 + " Dollar");
        System.out.println();
        System.out.println(amt+" Ruble = " + (amt*0.013 + "Dollar"));
        System.out.println();

    }

    public static void Dollar_to_Ruble(double  amt) {
        System.out.println("1 Dollar = " + 75.07 + " Ruble");
        System.out.println(amt+"Dollar = " + (amt*75.07) + "Ruble");

    }
}
