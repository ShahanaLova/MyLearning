package az.ikt.exercises.smallapp.repository;

import az.ikt.exercises.smallapp.model.Person;

public interface PersonRepository extends UniversalRepository<Person,Long>{
    Long findMaxId();
}
