package FirstSecondLesson;


import java.util.Scanner;

public class SCANNER {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int variableA =myScanner.nextInt();
        int variableB =myScanner.nextInt();

        System.out.println(variableA+variableB);
        System.out.println(variableA/variableB);
        System.out.println(variableA-variableB);
        System.out.println(variableA*variableB);
    }

}

