package hbcu.stay.ready.animals;

import hbcu.stay.ready.Food;

public interface Animal {
    static String speak() {
		// Auto-generated method stub
        return "meow!";

    }


    
	Object speak = null;
    Integer getNumberOfMealsEaten();
    Integer getId();
    void eat(Food food);
	static String speaks() {
		return "bark!";
	}
	
	}
	
	

