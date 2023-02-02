package Homework.FirstHomwork.MathOperations;

import Homework.FirstHomwork.MathOperations.MathOperations;

public class MathOperationsDemo {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();

        int x = 12;
        int y = 6;

        int resultOfSum = mathOperations.sum(x,y);
        System.out.println(resultOfSum);

        int resultOfMinus = mathOperations.minus(x,y);
        System.out.println(resultOfMinus);

        int resultOfMultiplication = mathOperations.multiplication(x,y);
        System.out.println(resultOfMultiplication);

        int resultOfDiv = mathOperations.div(x,y);
        System.out.println(resultOfDiv);

    }
}
