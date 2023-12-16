package IfElseIf;

import java.util.Scanner;

public class diffeq {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int firstNumber = myScan.nextInt();
        int secondNumber = myScan.nextInt();
        int thirdNumber = myScan.nextInt();
        if (firstNumber == secondNumber && secondNumber == thirdNumber ){
            System.out.println("All numbers are equal");
        } else if (firstNumber != secondNumber && secondNumber != thirdNumber && firstNumber != thirdNumber) {
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");
        }
    }
}
