package IfElseIf;

import java.util.Scanner;

public class weekDays {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Chose  number from 1 to 7 to check week day");
        int number = myScan.nextInt();
        if (number == 1){
            System.out.println("Its monday today");
        } else if (number == 2) {
            System.out.println("Its Tuesday today");
        } else if (number == 3) {
            System.out.println("Its wednesday today");
        } else if (number == 4) {
            System.out.println("Its thursday today");
        } else if (number == 5) {
            System.out.println("Its friday today");
        } else if (number == 6) {
            System.out.println("Its saturday today");
        } else if (number == 7) {
            System.out.println("Its sunday today");

        }


    }
}
