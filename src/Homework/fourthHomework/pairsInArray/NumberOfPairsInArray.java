package Homework.fourthHomework.pairsInArray;

public class NumberOfPairsInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 8;
        int pairs = findPairs(array, k);
        System.out.println("Number of pairs is " + pairs);
    }
    public static int findPairs(int[] array, int k){
        int count = 0;
        int left = 0;
        int right = array.length - 1;

        while (left < right){
            int sum = array[left] + array[right];
            if (sum == k){
                count++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            }else {
                right--;
            }
        }
        return count;

    }
}
