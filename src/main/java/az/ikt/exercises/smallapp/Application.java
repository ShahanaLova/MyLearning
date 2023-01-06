package az.ikt.exercises.smallapp;

import az.ikt.exercises.smallapp.model.Commands;
import az.ikt.exercises.smallapp.model.Person;
import az.ikt.exercises.smallapp.model.User;
import az.ikt.exercises.smallapp.service.PersonService;
import az.ikt.exercises.smallapp.service.UserService;

import static az.ikt.exercises.smallapp.util.ScannerUtil.*;

public class Application {

    private static final PersonService personService = new PersonService();
    private static final UserService userService = new UserService();

    public static void run() throws Exception {
        boolean flag = true;

        while (flag) {
            showCommands();
            Commands cmd = getCommand();

            switch (cmd) {
                case SP:
                    Person person = getPersonData();
                    personService.savePerson(person);
                    break;
                case RU:
                    User user = getUserData();
                    Long personId = getPersonId();
                    userService.registerUser(user, personId);
                    break;
                case SHP:
                    personService.showPeople();
                    break;
                case SHU:
                    userService.showUsers();
                    break;
                case EXIT:
                    flag = false;
            }
        }
    }

    private static void showCommands() {
        System.out.print("Commands: \n" +
                "1. (sp)   - " + Commands.SP.getDescription() + "\n" +
                "2. (ru)   - " + Commands.RU.getDescription() + "\n" +
                "3. (shp)  - " + Commands.SHP.getDescription() + "\n" +
                "4. (shu)  - " + Commands.SHU.getDescription() + "\n" +
                "5 (exit) - " + Commands.EXIT.getDescription() + "\n" + "Enter command: ");
    }
}