package az.ikt.exercises.Exercise31;

public class Person extends Human implements Ability{

    private Human mother ;
    private Human father;

    public Person(String name, String surname) {
        super(name, surname);
    }


    public Person(String name, String surname, int age, Human father, Human mother) {
        super(name, surname, age);
        this.mother = mother;
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    @Override
    public void write(String word) {
        System.out.println(word);
    }

    @Override
    public void read(String word) {
        System.out.println(word);

    }

    @Override
    public void sing(String word) {
        System.out.println(word);

    }

    @Override
    public void dance(String word) {
        System.out.println(word);

    }

    @Override
    public void run(String word) {
        System.out.println(word);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Person [ ");
        sb.append(String.format("father: {name: %s, surname: %s} , ", father.getName(), father.getSurname()));
        sb.append(String.format("mother: {name: %s, surname: %s} , ", mother.getName(), mother.getSurname()));
        sb.append(String.format("name: %s , ", getName()));
        sb.append(String.format("surname: %s , ", getSurname()));
        sb.append(String.format("age: %s , ", getAge()));
        sb.append(String.format("gender: %s", getGender()));
        sb.append(" ]");
        return sb.toString();
    }
}
