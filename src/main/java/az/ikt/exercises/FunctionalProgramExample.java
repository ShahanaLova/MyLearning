package az.ikt.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalProgramExample {
    public static void main(String[] args) {
        List<Integer> l2 = Arrays.asList(20, 10, 3, 14);
        int result = 0;
        int sum = 0;

        System.out.println(
                l2.stream()
                        .filter(x -> x % 2 == 0)
                        .mapToInt(e -> e * 2)
                        .sum());
//        for (int x : l2
//        ) {
//            if (x % 2 == 0) {
//                result = x * 2;
//                sum += result;
//
//            }
//        }
//        System.out.println(sum);
    }

    public static void l2(String[] args) {
        List<Integer> l1 = Arrays.asList(10, 11, 12, 16, 3, 3);

        l1.forEach((System.out::print));


//        for (int x : l1
//        ) {
//            System.out.print(x + " ");
//        }
    }

    public static void N1(String[] args) {
        Runnable r = () ->
                System.out.println("Class is runable");

        r.run();
        System.out.println("Running is in main  thread");
    }

}