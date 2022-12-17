package az.ikt.exercises.Exercise31;

import org.w3c.dom.ls.LSOutput;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.io.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Application {

    private static final List<Person> people = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        LoadPeople();

        File file = new File("C:\\Users\\IKT  LAB\\MyLearning\\target\\text.txt");
//        FileOutputStream writer = new FileOutputStream(file);
//        ObjectOutputStream oos = new ObjectOutputStream(writer);
//        oos.writeObject(PeopleSortedName());
//        oos.close();
//        writer.close();
        FileInputStream reader = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(reader);

        int i=ois.read();
        System.out.print((char)i);

        ois.close();


    }


    public static void run() {

        Person father = new Person("Adam", "null");
        Person mother = new Person("Hevva", "null");

        Person child = new Person("Ali", "Adamoglu", 45, Gender.MALE, father, mother);
        System.out.println(child);
        LoadPeople();
        System.out.println(people);

    }

    private static void LoadPeople() {
        people.add(new Person("Xeyal", "Farziyev", 24, Gender.MALE, new Person("Adam", " "), new Person("Hevva", " ")));
        people.add(new Person("Ali", "Mahammadyarov", 30, Gender.MALE, new Person("Adam", " "), new Person("Havva", " ")));
        people.add(new Person("PN3", "PSN3", 11, Gender.MALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN4", "PSN4", 45, Gender.FEMALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN5", "PSN5", 56, Gender.FEMALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN6", "PSN6", 78, Gender.FEMALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN7", "PSN7", 99, Gender.FEMALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN8", "PSN8", 22, Gender.MALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN9", "PSN9", 33, Gender.MALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN10", "PSN10", 111, Gender.FEMALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN11", "PSN11", 54, Gender.MALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN12", "PSN12", 55, Gender.MALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN13", "PSN13", 77, Gender.FEMALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN14", "PSN14", 98, Gender.MALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN15", "PSN15", 100, Gender.FEMALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
    }

    public static void FindMaxAgePeople(String[] args) {
        //LoadPeople();
        // people.stream().forEach(System.out::println);
        people.stream().filter(s -> s.getAge() == people.stream()
                .mapToDouble(Person::getAge)
                .max()
                .orElse(0))
                .forEach(System.out::println);
    }

    public static List<Person> PeopleSortedName() {
         return people.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());

    }


}
