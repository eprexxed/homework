package IfElseIf;

import java.util.Scanner;

public class biggest {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int num1 = myScan.nextInt();
        int num2 = myScan.nextInt();
        int num3 = myScan.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        } else if (num3 > num2 && num3 > num1) {
            System.out.println(num3);
        }
    }
}