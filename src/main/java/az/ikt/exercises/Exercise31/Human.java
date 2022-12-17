package az.ikt.exercises.Exercise31;

import java.io.Serializable;

public abstract  class Human implements Serializable { // bir shexsiyyet olmadigina gore abstract edirik
    private String name;
    private String surname;
    private int age;
    private Gender gender;
    //private  Human father; // Adem Hevva meselesine gore basqa classda yaradilmalidir
    //private  Human mother;

    public Human() {
    }

    public Human(String name, String surname, int age, Gender gender) {
        this.name = name;
        this.surname = surname;
        setAge(age);
        this.gender = gender;

    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0 || age >200) {
            throw new RuntimeException();
        }
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
