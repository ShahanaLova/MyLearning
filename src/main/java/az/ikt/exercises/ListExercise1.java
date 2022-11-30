package az.ikt.exercises;

import java.util.ArrayList;

public class ListExercise1 {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(19);
        x.add(15);
        x.add(12);
        for (int i = 0; i < x.size(); i++)
        {
            for (int j = i + 1; j <  x.size(); j++)
            {
                Integer tmp = 0;
                if (x.get(i) > x.get(j))
                {
                    tmp = x.get(i);
                    x.set(i, x.get(j));
                    x.set(j, tmp);
                }
            }


        }
        System.out.println(x);
    }
}



