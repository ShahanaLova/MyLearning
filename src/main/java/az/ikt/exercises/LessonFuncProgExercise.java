package az.ikt.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LessonFuncProgExercise {
    public static void main(String[] args) {
        List<String> x1 =  new ArrayList<> (List.of("Red","Black","Green"));
        List<String> x2 =  new ArrayList<> (List.of("White","Black","Green"));
       // List<String> x3 = new ArrayList<>();
        x2.addAll(x1);
        //x3.addAll(x2);
        System.out.println(x2);


    }
}
