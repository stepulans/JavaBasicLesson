package Lessons.Lessons3.Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorOperations calculatorOperations = new CalculatorOperations();

        int a = 5;
        int b = 10;

        int resultOfSum = calculatorOperations.sum(a,b);

        System.out.println(resultOfSum);

        int result2 = calculatorOperations.sum(10,25);

        System.out.println(result2);

        int resultOfSubstruction = calculatorOperations.minus(55,15);
        int resultOfSubstruction2 = calculatorOperations.minus(b,a);
        System.out.println(resultOfSubstruction);
        System.out.println(resultOfSubstruction2);

        int resultOfMultiplication = calculatorOperations.multiplication(a,b);
        System.out.println(resultOfMultiplication);

        double resultOfDiv = calculatorOperations.div(a,b);
        System.out.println(resultOfDiv);

        double double1 = 5.3;
        float float1 = 5.3f;
        int int1 = 5;

        System.out.println(calculatorOperations.divDoubleParameters(5.2,1.5));
        System.out.println(calculatorOperations.divDoubleParameters(5,2));
    }
}
