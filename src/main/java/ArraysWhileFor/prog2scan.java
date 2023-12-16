package ArraysWhileFor;

import java.util.Arrays;
import java.util.Scanner;

public class prog2scan {
    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner myScan = new Scanner(System.in);

        for (int i = 0;  i < array.length; i++) {
            System.out.println("Введите число для ячейки" + i + "zxc");
            array[i] = myScan.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
