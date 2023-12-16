package ArraysWhileFor;

import java.util.Arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        int arrayLength = 5;
        int[] array = new ArrayUtil().createArray(arrayLength);

        // Пример теста для создания массива
        if (array.length == arrayLength) {
            System.out.println("Test Passed: Array created successfully.");
        } else {
            System.out.println("Test Failed: Failed to create array of specified length.");
        }
    }

    public void shouldFindMaxNumber() {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int max = new ArrayUtil().findMaxNumber(array);

        // Пример теста для поиска максимального числа
        if (max == 9) {
            System.out.println("Test Passed: Max number found successfully.");
        } else {
            System.out.println("Test Failed: Failed to find the max number.");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] originalArray = Arrays.copyOf(array, array.length); // копируем массив

        int min = arrayUtil.findMinNumber(array);

        // Пример теста для поиска минимального числа
        if (min == 1) {
            System.out.println("Test Passed: Min number found successfully.");
        } else {
            System.out.println("Test Failed: Failed to find the min number.");
        }

        // Дополнительный тест для проверки, что метод не изменяет оригинальный массив
        if (Arrays.equals(array, originalArray)) {
            System.out.println("Test Passed: Original array not modified.");
        } else {
            System.out.println("Test Failed: The original array has been modified.");
        }
    }
}