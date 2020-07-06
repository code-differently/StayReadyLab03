package hbcu.stay.ready;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Mammal;


public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
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
    public void newDogTest() {

        Dog dog = new Dog("June", new Date(), 1);

        String actualName = "June";
        Date actualDate = new Date();
        Integer actualId = 1;

        String expectedName = dog.getName();
        Date expectedDate = dog.getBirthDate();
        Integer expectedId = dog.getId();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void speakTest() {
        String expected = "bark!";

        Dog dog = new Dog("Sam", new Date(), 2);

        String actual = dog.speak();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setBirthDateTest() {

        Dog dog = new Dog("Jill", new Date(), 3);
        Date expected = new Date();

        Date actual = dog.getBirthDate();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {

        Dog dog = new Dog("Scott", new Date(), 4);

        int expectedNumMeals = 1;
        Food chowMix = new Food();

        dog.eat(chowMix);
        int actualNumMeals = dog.getNumberOfMealsEaten();

        Assert.assertEquals(expectedNumMeals, actualNumMeals);
    }

    @Test
    public void getIdTest() {

        Dog dog = new Dog("Joe", new Date(), 5);

        Integer expected = 5;

        Integer actual = dog.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AnimalInheritanceTest(){

        Dog dog = new Dog(null, null, null);
        boolean expected = true;
        boolean actual = dog instanceof Animal;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MammalInheritanceTest(){

        Dog dog = new Dog(null, null, null);
        boolean expected = true;
        boolean actual = dog instanceof Mammal;

        Assert.assertEquals(expected, actual);
    }
}
