package IfElseIf;

import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        if( x == y){
            System.out.println("numbers are equals");
        } else {
            System.out.println("numbers are different");
        }
    }
}
