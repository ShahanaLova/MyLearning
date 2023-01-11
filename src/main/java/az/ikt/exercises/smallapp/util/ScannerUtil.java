package az.ikt.exercises.smallapp.util;

import az.ikt.exercises.smallapp.model.Commands;
import az.ikt.exercises.smallapp.model.Gender;
import az.ikt.exercises.smallapp.model.Person;
import az.ikt.exercises.smallapp.model.User;

import java.util.Scanner;

public class ScannerUtil {

    private static final Scanner sc = new Scanner(System.in);

    public static Commands getCommand() {
        return Commands.valueOf(sc.nextLine().toUpperCase());
    }

    public static Person getPersonData() {
        Person person = new Person();
        System.out.println("Enter name: \n");
        person.setName(sc.nextLine());

        System.out.println("Enter surname: \n");
        person.setSurname(sc.nextLine());

        System.out.println("Enter father name: \n");
        person.setFatherName(sc.nextLine());

        System.out.println("Enter age: \n");
        person.setAge(sc.nextByte());

        sc.nextLine();
        System.out.println("Enter gender: (Male/Female) \n");
        person.setGender(Gender.valueOf(sc.nextLine().toUpperCase()));
        return person;

    }

    public static User getUserData(){
        User user = new User();
        System.out.println("Enter username: \n");
        user.setUsername(sc.nextLine());

        System.out.println("Enter password: \n");
        user.setPassword(sc.nextLine());
        return  user;

    }
    public static  Long getPersonId(){
        System.out.println("Enter person id: \n");
        Long id= sc.nextLong();
        sc.nextLine();
        return id;
    }
}
