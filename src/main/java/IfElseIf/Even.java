package IfElseIf;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {


    Scanner scun = new Scanner(System.in);
    int number = scun.nextInt();
    if (number % 2 == 0){
        System.out.println("Number is Even");
    }else{
        System.out.println("Number is odd");
    }

    }
}
