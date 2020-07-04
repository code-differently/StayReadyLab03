package hbcu.stay.ready.animals;

import java.util.Date;

public class Cat extends Mammal {
    public Cat(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    public String speak(String string) {
        return "meow!";
    }

	public static String catHouse() {
		return null;
	}

	public String createCat() {
		return "Stitch";
	}
}
