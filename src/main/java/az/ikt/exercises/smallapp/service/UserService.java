package az.ikt.exercises.smallapp.service;

import az.ikt.exercises.smallapp.model.Person;
import az.ikt.exercises.smallapp.model.User;
import az.ikt.exercises.smallapp.repository.PersonRepository;
import az.ikt.exercises.smallapp.repository.UserRepository;
import az.ikt.exercises.smallapp.repository.impl.PersonRepoCollectionImpl;
import az.ikt.exercises.smallapp.repository.impl.UserRepoCollectionImpl;

import java.util.Optional;
import java.util.stream.Collectors;

public class UserService {
    public static final UserRepository userRepo = new UserRepoCollectionImpl();

    public static final PersonRepository personRepo = new PersonRepoCollectionImpl();

    public void registerUser(User user, Long personId){
        Long nextId = userRepo.findMaxId()+1;
        user.setId(nextId);

        checkUsername(user);
        Person person = new Person();

        user.setPerson(person);
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
}
