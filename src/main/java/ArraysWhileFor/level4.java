package ArraysWhileFor;

import java.util.Random;
import java.util.Scanner;

public class level4 {

    public static void main(String[] args) {


        Scanner myScan = new Scanner(System.in);
        int length = myScan.nextInt();
        ArrayUtil arrayUtil = new ArrayUtil();

        int [] array = arrayUtil.createArray(length);
        arrayUtil.fillArrayWithRandomNumbers(array);

        System.out.println("Your array: ");
        arrayUtil.printArrayToConsole(array);

        System.out.println("нечетные числа:");
        arrayUtil.printOddNumbers(array);
        System.out.println();

        System.out.println("четные числа: ");
        arrayUtil.printEvenNumbers(array);
        System.out.println();

        int maxNumber = arrayUtil.findMaxNumber(array);
        System.out.println("bigest number is: " + maxNumber);

        int minNumber = arrayUtil.findMinNumber(array);
        System.out.println("least number is: " + minNumber);





            }
        }




