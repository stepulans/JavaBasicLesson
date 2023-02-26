package Homework.fourthHomework.findMissingElement;

public class FindMissingElement {
    public static int findMissing(int[] array){
        int expectedSum = array.length * (array.length + 1) /2;
        int actualSum = 0;

        for (int number : array) {
            actualSum += number;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 0, 10};
        int missingNumber = findMissing(array);
        System.out.println("Missing element is " + missingNumber);
    }
}
