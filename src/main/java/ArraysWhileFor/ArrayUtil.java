package ArraysWhileFor;

import java.util.Random;

public class ArrayUtil {

    int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index:" + i + " number: " + array[i]);

        }
    }

    public void fillArrayWithRandomNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(10);
        }
    }

    public void printOddNumbers(int[] array) {
        for (int value : array) {
            if (value % 2 != 0) {
                System.out.print(value + " ");
            }
        }
    }
    public void printEvenNumbers(int[] array) {
        for (int value : array) {
            if (value % 2 == 0) {
                System.out.print(value + " ");
            }
        }
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}





