package ArraysWhileFor;

import java.util.Random;

public class chat {

        public static void main(String[] args) {
            // Создание массива произвольной длины
            int arrayLength = 10; // Можете изменить длину массива по вашему усмотрению
            int[] randomArray = new int[arrayLength];

            // Заполнение массива случайными числами
            Random random = new Random();
            for (int i = 0; i < arrayLength; i++) {
                randomArray[i] = random.nextInt(100); // Генерация случайного числа от 0 до 99
            }

            // Вывод всех элементов массива на консоль
            System.out.println("Элементы массива:");
            for (int value : randomArray) {
                System.out.print(value + " ");
            }
            System.out.println(); // Переход на новую строку для читаемости

            // Поиск и вывод четных чисел из массива
            System.out.println("Четные числа в массиве:");
            for (int value : randomArray) {
                if (value % 2 == 0) {
                    System.out.print(value + " ");
                }
            }
        }
    }



