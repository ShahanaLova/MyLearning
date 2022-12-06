package az.ikt.exercises.Miniproject;

import java.security.PublicKey;
import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;

    private Human[] children;
    private Pet pet;

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


    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Family(Human mother, Human father, Human child, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public void deleteChild(Human child) {
        Human[] Children1 = new Human[children.length - 1];
        // int index = 0;

        for (int i = 0; i < this.children.length; i++) {
            if (child != children[i]) {
                Children1[i] =children[i];

            }
            children = Children1;
        }
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }
}
