package az.ikt.exercises.smallapp.model;

import java.util.Objects;

public class Person {
//    id (Integer, not null, Unique, AutoIncrease)
//    name (String or text (varchar))
//    surname (String or text (varchar))
//    father name (String or text (varchar))
//    age (Byte or number type in db)
//    gender (Enum in java)
    private long id;
    private String name;
    private String surname;
    private String fathername;
    private int age;
    private Gender gender;

    public Person() {
    }

    public Person(long id, String name, String surname, String fathername, byte age, Gender gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.fathername = fathername;
        this.age = age;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFatherName() {
        return fathername;
    }

    public void setFatherName(String fathername) {
        this.fathername = fathername;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(fathername, person.fathername) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, fathername, age, gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fathername='" + fathername + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


}

