package hbcu.stay.ready.animals;

import java.util.Date;

public class Cat extends Mammal {
    String name;
    int birthDate;
    int id;

public Cat(String name, Date birthDate, Integer id) {
    super(name, birthDate, id);
}

    public String speak() {
        return "meow!";
    }
}
