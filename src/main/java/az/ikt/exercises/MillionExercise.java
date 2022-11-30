package az.ikt.exercises;

import java.util.Random;

public class MillionExercise {
    public static void main(String[] args) {
        Random randomNum=new Random();
        int[] array = new int[100];
        int count =0;
        for(int i = 0; i <  array.length; i++) {
            array[i] = randomNum.nextInt(150); //0-99
            System.out.print(array[i] + "  ");
        }
        System.out.println("len="+array.length);

        for(int index = 0; index < array.length; index++) {
            for (int j= index+1; j < array.length; j++) {
                if(array[index] == array[j])
                    count++;
            }
            System.out.println(array[index]+"-" +count);
            count=0;


        }
    }
}
