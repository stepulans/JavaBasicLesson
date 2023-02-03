package Homework.FirstHomwork.Numbers;

public class Numbers {
    public static void main(String[] args) {
    int number = 256;

    int number1 = number / 100;
    System.out.println("First number of 256 is " +number1);
    int number2 = (number / 10) % 10;
    System.out.println("Second number of 256 is " +number2);
    int number3 = number % 10;
    System.out.println("Third number of 256 is " +number3);


}
}
