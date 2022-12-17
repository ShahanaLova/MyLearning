package az.ikt.exercises.Exercise31;

import org.w3c.dom.ls.LSOutput;

public class Application {
    public static void run() {

        Person father = new Person("Adam", "null");
        Person mother = new Person("Hevva", "null");

        Person child = new Person("Ali", "Adamoglu", 45, father, mother);
        System.out.println(child);
    }

}
