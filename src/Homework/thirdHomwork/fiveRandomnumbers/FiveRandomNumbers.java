package Homework.thirdHomwork.fiveRandomnumbers;

import java.util.Arrays;
import java.util.Random;

public class FiveRandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrays = new int[5];

        for (int i = 0; i < arrays.length; i++){
            arrays[i] = random.nextInt(10, 99);
        }
        System.out.println(Arrays.toString(arrays));

        boolean sequence = true;
        for (int i = 1; i < arrays.length; i++){
            if(arrays[i] <= arrays[i - 1]){
                sequence = false;
                break;
            }
        }
        if(sequence){
            System.out.println("the array is a strictly increasing sequence");
        } else{
            System.out.println("the array is not a strictly increasing sequence");
        }


    }
}
