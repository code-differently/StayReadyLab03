package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Mammal;

import java.util.Date;

public class DogTest {

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void setBirthDateTest(){
        Dog dog = new Dog("Jacks", null, 01);

        dog.setBirthDate(new Date());
        Date actual = dog.getBirthDate();
        Date expected = new Date();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        Dog dog = new Dog("Koda", null, 01);

        String actual = dog.speak();
        String expected = "bark!";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest(){
        Dog dog = new Dog("puppy", new Date(), 02);
        Food dogFood = new Food();

        dog.eat(dogFood);
        int actual = dog.getNumberOfMealsEaten();
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest(){
        Dog dog = new Dog("Koda", null, 03);

        Integer actual = dog.getId();
        Integer expected = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkAnimalInheritance(){
        Dog dog = new Dog("Koda", null, 01);

        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void checkMammalInheritance(){
        Dog dog = new Dog("Koda", null, 01);

        Assert.assertTrue(dog instanceof Mammal);
    }
}
