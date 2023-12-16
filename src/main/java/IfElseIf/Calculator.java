package IfElseIf;

import java.util.Scanner;

class Calculator {
    Scanner myScan = new Scanner(System.in);

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int minus(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int delitj(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int umnozh(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }





    private void performOperations() {

        System.out.println("Enter first number ");
        int firstNumber = myScan.nextInt();
        System.out.println("Enter second number");
        int secondNumber = myScan.nextInt();
        System.out.println("is even?" + isEven(firstNumber));
        System.out.println("is even?" + isEven(secondNumber));
        int sumResult = sum(firstNumber, secondNumber);
        int minusResult = minus(firstNumber,secondNumber);
        int delitjResult = delitj(firstNumber,secondNumber);
        int umnozhResult = umnozh(firstNumber,secondNumber);
        int maxoftwo = maxOfTwoNumbers(firstNumber, secondNumber);
        System.out.println(sumResult );
        System.out.println(minusResult );
        System.out.println(delitjResult );
        System.out.println(umnozhResult );
        System.out.println(" biggest number is " + maxoftwo );
        }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.performOperations();
    }
}


