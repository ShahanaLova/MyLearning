package az.ikt.exercises.smallapp.service;

import az.ikt.exercises.smallapp.model.Person;
import az.ikt.exercises.smallapp.repository.PersonRepository;
import az.ikt.exercises.smallapp.repository.impl.PersonRepoCollectionImpl;

public class PersonService {
    public static final PersonRepository personRepository = new PersonRepoCollectionImpl();

    public void savePerson(Person person) {
        Long nextId = personRepository.findMaxId() + 1;
        person.setId(nextId);

        personRepository.save(person);
        System.out.println();
    }

    public void showPeople(){
        System.out.println();
        personRepository.getAll().forEach(System.out::println);
        System.out.println();
    }

}
