package ArraysWhileFor;

import java.util.Arrays;
import java.util.Random;

public class prog2random {
    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        int sum = array[0] + array[1] + array[2];
        System.out.println("sum of array numbers is " + sum);
        int average = (array[0] + array[1] + array[2]) / array.length;
        System.out.println("arrays average number is " + average);
        for (int i = 0; i < array.length; i++) {
            array[i] += 2;
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            System.out.println("Ячейка " + i + ": " + array[i]);
        }
    }
}


