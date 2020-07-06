package hbcu.stay.ready.animals;

import hbcu.stay.ready.Food;

public interface Animal {
    String speak();
    Integer getNumberOfMealsEaten();
    Integer getId();
    void eat(Food food);

}
