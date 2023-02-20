package Homework.thirdHomwork.eightRandomnumbers;

import java.util.Random;
import java.util.Arrays;
public class EightRandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 50);
        }
        System.out.println(Arrays.toString(array));


        for (int e = 0; e < array.length; e++) {
            if (e % 2 == 0) {
                array[e] = 0;
            }

        }
        System.out.println(Arrays.toString(array));
    }
}






