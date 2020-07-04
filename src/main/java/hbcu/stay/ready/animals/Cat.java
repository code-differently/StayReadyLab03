package hbcu.stay.ready.animals;

import java.util.Date;

public class Cat extends Mammal {
    public Cat(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    public String speak() {
        return "meow!";
    }

    public String toString() {
        return "My name is: " + getName() + " my birthdate is: " + getBirthDate() + " my id is: " + getId(); 
    }
}

