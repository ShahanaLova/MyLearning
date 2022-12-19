package az.ikt.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionexercise {
    public static void main(String[] args) {

        int x = method();
        System.out.println(x);
    }

    private static int method() {

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter number1");
            int number1 = input.nextInt();
            System.out.println("Please enter number2");

            int number2 = input.nextInt();
            System.out.println("RESULT " + number1 / number2);
            return number1 / number2;
        } catch (ArithmeticException | InputMismatchException ex) {
            if (ex instanceof ArithmeticException) {
                System.out.println("Sifira bolme mumkun deyil");
                return method();
            } else if (ex instanceof InputMismatchException) {
                System.out.println("Number is not integer type");
                // return method();
            } return method();
        } finally {
            System.out.println("Gelib sona catdiq");

        }

        // return x}
    }

}






