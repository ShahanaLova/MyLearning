package az.ikt.exercises.smallapp.repository;

import az.ikt.exercises.smallapp.model.User;

public interface UserRepository extends UniversalRepository<User,Long>{
    Long findMaxId();
}
