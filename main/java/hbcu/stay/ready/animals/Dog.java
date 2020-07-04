package hbcu.stay.ready.animals;

import java.util.Date;

public class Dog extends Mammal {
    public Dog(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    public String speaks(String string) {
        return "bark!";
    }

	public String createDog() {
		return "Lilo";
	}

    public static String dogHouse() {
		return null;
	}
	//public void speak(String string) {
	//}
}
