package hbcu.stay.ready;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
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
    public void constructorTest() {
        // Given
        String givenName = "Bolt";
        Date givenBDate = new Date();
        Integer givenId = 0;

        // When
        Dog dog = new Dog(givenName, givenBDate, givenId);

        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    Dog dog;
    @Before
    public void initialize() {
        this.dog = new Dog(null, null, 927);
    }

    @Test
    public void speakTest() {
        // Given
        String expectedSound = "bark!";

        // When
        String retrievedSound = dog.speak();

        // Then
        Assert.assertEquals(expectedSound, retrievedSound);
    }

    @Test
    public void setBirthDateTest() {
        // Given
        Date givDate = new Date(500);

        // When
        dog.setBirthDate(givDate);
        Date retrievedDate = dog.getBirthDate();

        // Then
        Assert.assertEquals(givDate, retrievedDate);
    }

    @Test
    public void eatTest() {
        // Given
        Food dogFood = new Food();
        int expectedNumOfMeals = 1 + dog.getNumberOfMealsEaten();

        // When
        dog.eat(dogFood);
        int actualNumOfMeals = dog.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expectedNumOfMeals, actualNumOfMeals);
    }

    @Test
    public void getIdTest() {
        // Given
        int expectedId = 927;

        // When
        int actualId = dog.getId();

        // Then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void animalInheritanceTest() {
        assertTrue(dog instanceof Animal);
    }

    @Test
    public void mammalInheritanceTest() {
        assertTrue(dog instanceof Mammal);
    }

}
