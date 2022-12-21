package az.ikt.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LessonLambdaFindAnyWordFromList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String search = input.nextLine();
        List<String> line = new ArrayList<>(List.of("Red", "Black", "Green")); //new ArrayList<>();
        System.out.println(line.stream()
                .filter(x -> x.equalsIgnoreCase(search))
                .findAny().orElse("Not found"));
//        for (String s: line) {
//            if (//s.equalsIgnoreCase(search))
//               s.toUpperCase().equals( search.toUpperCase())           )
//            {
//                System.out.println(s);
//
//            }
//        }
    }


}
