package IfElseIf;

import java.util.Scanner;

public class lestnica {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int num1 = myScan.nextInt();
        int num2 = myScan.nextInt();
        int num3 = myScan.nextInt();
        if (num1 < num2 && num2 < num3) {
            System.out.println("increasing");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("decreasing");
        }else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
