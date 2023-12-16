package ArraysWhileFor;

import java.util.Arrays;

public class ArrayUtilDemo {

    public static void main(String[] args) {
        ArrayUtil test = new ArrayUtil();

        int[] myArray = test.createArray(10);
        test.fillArrayWithRandomNumbers(myArray);
        System.out.println(Arrays.toString(myArray));

         int[] maxnumber = new int[]{test.findMaxNumber(myArray)};
        System.out.println(Arrays.toString(maxnumber));

        int[] minNumber =new int[]{ test.findMinNumber(myArray)};
        System.out.println(Arrays.toString(minNumber));





    }
}
