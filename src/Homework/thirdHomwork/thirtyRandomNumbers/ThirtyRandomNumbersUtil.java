package Homework.thirdHomwork.thirtyRandomNumbers;

public class ThirtyRandomNumbersUtil {
    public int maxArrayNumber(int[] arrays) {
        int maxArrayNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > maxArrayNumber) {
                maxArrayNumber = arrays[i];
            }

        }
        return maxArrayNumber;
    }

    public int minArrayNumber(int[] arrays) {
        int minArrayNumber = Integer.MAX_VALUE;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] < minArrayNumber) {
                minArrayNumber = arrays[i];
            }
        }
        return minArrayNumber;
    }

    public int average(int[] arrays) {
        int average = 0;
        for (int i : arrays) {
            average += i;
        }


        return average;
    }

    public static int countElementsBetweenMinMax(int[] arrays) {
        int min = arrays[0];
        int max = arrays[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i] < min) {
                min = arrays[i];
                minIndex = i;
            }
            if (arrays[i] > max) {
                max = arrays[i];
                maxIndex = i;
            }
        }
        if (minIndex > maxIndex) {
            minIndex = minIndex + maxIndex;
            maxIndex = minIndex - maxIndex;
            minIndex = minIndex - maxIndex;
        }
        return maxIndex - minIndex - 1;

    }

    public static int findFirstPrime(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(arrays[i]); j++) {
                if (arrays[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && arrays[i] > 1) {
                return arrays[i];
            }
        }
        return -1;
    }

    public static int findLastPrime(int[] arrays) {
        for (int i = arrays.length - 1; i >= 0; i--) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(arrays[i]); j++) {
                if (arrays[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && arrays[i] > 1) {
                return arrays[i];
            }
        }
        return -1;
    }

    public static int countPrimes(int[] arrays) {
        int count = 0;
        for (int i = 0; i < arrays.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(arrays[i]); j++) {
                if (arrays[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && arrays[i] > 1) {
                count++;
            }
        }
        return count;
    }
}




