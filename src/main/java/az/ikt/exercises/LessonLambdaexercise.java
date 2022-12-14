package az.ikt.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LessonLambdaexercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String search = input.nextLine();
        List<String> line = new ArrayList<> (List.of("Red", "Black", "Green")); //new ArrayList<>();

        for (String s: line) {
            if (//s.equalsIgnoreCase(search))
               s.toUpperCase().equals( search.toUpperCase())           )
            {
                System.out.println(s);

            }
        }
    }


}
