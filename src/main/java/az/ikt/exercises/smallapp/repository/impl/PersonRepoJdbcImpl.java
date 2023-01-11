package az.ikt.exercises.smallapp.repository.impl;

import az.ikt.exercises.smallapp.model.Gender;
import az.ikt.exercises.smallapp.model.Person;
import az.ikt.exercises.smallapp.model.Sql;
import az.ikt.exercises.smallapp.repository.PersonRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonRepoJdbcImpl implements PersonRepository {

    Connection con;


    private final Statement stmt;


    public PersonRepoJdbcImpl() {
        try {
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "sql2023");
            this.stmt = con.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException("Error is this");
        }
    }

    @Override
    public Long findMaxId() {

        try {
            ResultSet rs = stmt.executeQuery(Sql.FIND_MAX_ID.getValue());

            return rs.getLong("max_id");
        } catch (SQLException e) {
            e.printStackTrace();
            return 0L;
        }
    }

    @Override
    public void save(Person person) {

        try {
            stmt.execute("insert into person(id, name,surname,fathername,age, gender) values" + "(" + person.getId() + "," + person.getName() + "," + person.getSurname() + "," + person.getFatherName() + "," + person.getAge() + "," + person.getGender() + ");");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Person> getAll() {
        try {
            ResultSet rs = stmt.executeQuery("select id,name, surname,fathername,age, gender from person;");
            List<Person> personList = new ArrayList<>();

            while (rs.next()) {
                Person person = new Person();
                person.setId(rs.getLong("id"));
                person.setName(rs.getString("name"));
                person.setSurname(rs.getString("surname"));
                person.setFatherName(rs.getString("fathername"));
                person.setAge(rs.getInt("age"));
                person.setGender(Gender.valueOf(rs.getString("gender")));
                personList.add(person);

            }
            return personList;

        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<Person>() {
            };
        }
    }


    @Override
    public Person getById(Long aLong) {
        try {
            ResultSet rs = stmt.executeQuery("select id,name, surname,fathername,age, gender from person where id = " + aLong +";");
            Person person = new Person();
            person.setId(rs.getLong("id"));
            person.setName(rs.getString("name"));
            person.setSurname(rs.getString("surname"));
            person.setFatherName(rs.getString("fathername"));
            person.setAge(rs.getInt("age"));
            person.setGender(Gender.valueOf(rs.getString("gender")));


            return person;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void delete(Person person) {
        try {
            stmt.execute("delete from person;");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById(Long aLong) {
        try {
            stmt.execute("delete from person where id = "+ aLong +";");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



