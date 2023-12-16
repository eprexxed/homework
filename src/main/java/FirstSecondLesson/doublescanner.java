package FirstSecondLesson;

import java.util.Scanner;

public class doublescanner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double a = myScanner.nextDouble();
        double b = myScanner.nextDouble();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
    }
}
