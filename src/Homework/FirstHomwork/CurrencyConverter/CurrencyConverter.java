package Homework.FirstHomwork.CurrencyConverter;
import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println("1 Euro");
        System.out.println("2 Dollar");

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the currency");

        int choice = sc.nextInt();
        System.out.println("Enter the amount");

        double amount = sc.nextDouble();
        switch (choice) {
            case 1:
                Euro_to_Dollar(amount);
                break;
            case 2:
                Dollar_to_Euro(amount);
                break;
        }

    }

    public static void Euro_to_Dollar(double amt) {
        System.out.println("1 Euro = " + 1.08 + " Dollar");
        System.out.println();
        System.out.println(amt+"Euro = " + (amt*1.08 + "Dollar"));
        System.out.println();

    }

    public static void Dollar_to_Euro(double  amt) {
        System.out.println("1 Dollar = " + 0.93 + " Euro");
        System.out.println(amt+"Dollar = " + (amt*0.93) + "Euro");

    }
}
