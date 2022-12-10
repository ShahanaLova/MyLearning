package az.ikt.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionexercise {
    public static void main(String[] args) {

        while (true) {
            Scanner input = new Scanner(System.in);

            try {
                System.out.println("Please enter number1");
                int number1 = input.nextInt();
                System.out.println("Please enter number2");

                int number2 = input.nextInt();

                System.out.println(number1 / number2);
            } catch (ArithmeticException | InputMismatchException ex) {
                if (ex instanceof ArithmeticException) {
                    System.out.println("Sifira bolme mumkun deyil");
                    break;
                } else if (ex instanceof InputMismatchException) {
                    System.out.println("Number is not integer type");
                    break;
                }
            } finally {
                System.out.println("Gelib sona catdiq");
            }


        }


    }


}


