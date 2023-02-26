package Homework.thirdHomwork.thirtyRandomNumbers;

import java.util.Arrays;
import java.util.Random;

import static Homework.thirdHomwork.thirtyRandomNumbers.ThirtyRandomNumbersUtil.countElementsBetweenMinMax;

public class ThirtyRandomNumbers {
    public static void main(String[] args) {
        ThirtyRandomNumbersUtil trnu = new ThirtyRandomNumbersUtil();
        Random random = new Random();
        int[] arrays = new int [30];


        for (int i = 0; i < arrays.length; i++){
            arrays[i] = random.nextInt(1, 100);
        }
        System.out.println(Arrays.toString(arrays));


       int minArrayNumber = trnu.minArrayNumber(arrays);
        System.out.println("Min element = " + minArrayNumber);

        int maxArrayNumber = trnu.maxArrayNumber(arrays);
        System.out.println("Max element = " + maxArrayNumber);

        int average = trnu.average(arrays);
        System.out.println("The average of a set of numerical values = " + average);

        int count = trnu.countElementsBetweenMinMax(arrays);
        System.out.println("Number of elements between min and max = " + count);

        int firstPrimeNumber = trnu.findFirstPrime(arrays);
        System.out.println("First Prime number = " + firstPrimeNumber);

        int lastPrimeNumber = trnu.findLastPrime(arrays);
        System.out.println("Last Prime Number = " + lastPrimeNumber);

        int countPrimeAmount = trnu.countPrimes(arrays);
        System.out.println("Amount of all Prime numbers = " + countPrimeAmount);






    }
}
