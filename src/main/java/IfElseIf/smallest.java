package IfElseIf;

import java.util.Scanner;

public class smallest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (x > y){
            System.out.println("smallest number is " + y);
        } else if (y > x) {
            System.out.println("smallest number is " + x);

        }
    }
}
