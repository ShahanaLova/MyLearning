package az.ikt.exercises.smallapp.service;

import az.ikt.exercises.smallapp.model.Person;
import az.ikt.exercises.smallapp.model.User;
import az.ikt.exercises.smallapp.repository.PersonRepository;
import az.ikt.exercises.smallapp.repository.UserRepository;
import az.ikt.exercises.smallapp.repository.impl.PersonRepoCollectionImpl;
import az.ikt.exercises.smallapp.repository.impl.PersonRepoJdbcImpl;
import az.ikt.exercises.smallapp.repository.impl.UserRepoCollectionImpl;
import az.ikt.exercises.smallapp.repository.impl.UserRepoJDBCImpl;

import java.util.Formatter;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserService {
    public static final UserRepository userRepo = new UserRepoJDBCImpl();

    public static final PersonRepository personRepo = new PersonRepoJdbcImpl();

    public void registerUser(User user, Long personId){
        Long nextId = userRepo.findMaxId()+1;
        user.setId(nextId);

        checkUsername(user);
        Person person = getPerson(personId);

        user.setPersonId(person.getId());
        userRepo.save(user);
        System.out.println("====================");
        System.out.println(userRepo.getAll());


    }

    private Person getPerson(long id){
        return Optional.of(personRepo.getById(id))
                .orElseThrow(()-> new RuntimeException("Person id not found"));
    }
    public void checkUsername(User user){
        if (usernameContains(user.getUsername())) {
            throw new RuntimeException("User Already exist!!!");
        }
    }

    public boolean usernameContains(String username){
        return userRepo.getAll()
                .stream()
                .map(User::getUsername)
                .collect(Collectors.toList())
                .contains(username);
    }
    public void showUsers(){
//        System.out.println();
//        userRepo.getAll().forEach(System.out::println);
//        System.out.println();
        Formatter fmt = new Formatter();
        fmt.format("%15s %15s %15s\n", "UserName", "Password", "PersonId");
        for (User user : userRepo.getAll())
        {
            fmt.format("%14s %14s %17s\n", user.getUsername(), "*".repeat(user.getPassword().length()), user.getPersonId());
        }
        System.out.println(fmt);
    }
}
