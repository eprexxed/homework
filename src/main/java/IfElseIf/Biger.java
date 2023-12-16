package IfElseIf;

import java.util.Scanner;

public class Biger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (x > y) {
            System.out.println("first number is bigger than second");
        } else if (x < y) {
            System.out.println("second number is bigger than first");
        }
    }
}