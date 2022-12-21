package az.ikt.exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LessonFuncProgJoinExistCharSort {
    public static void main(String[] args) {
        List<String> x1 =  new ArrayList<> (List.of("Red","Black","Green"));
        List<String> x2 =  new ArrayList<> (List.of("White","Black","Green"));
        System.out.println(Stream.of(x1,x2).
                flatMap(Collection::stream).
                distinct().
                collect(Collectors.toList()));

        System.out.println(
                x1.stream().filter(s->s.toUpperCase().contains("R")).collect(Collectors.toList()));

        List result = x2.stream().sorted().collect(Collectors.toList());
        System.out.println(result);
    }
}
