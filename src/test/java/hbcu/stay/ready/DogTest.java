package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Mammal;

import java.util.Date;

public class DogTest {

    Dog dog;

    @Before
    public void setup() {
        this.dog = new Dog("Cyrus", new Date(), 1);
    }

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Tyson";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        // Given
        String expected = "bark!";
        // When
        String actual = dog.speak();
        // Then
        Assert.assertEquals("testing bark", expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        // Given
        Date expected = new Date();
        // When
        dog.setBirthDate(new Date());
        Date actual = dog.getBirthDate();
        // Then
        Assert.assertEquals("testing set bday", expected, actual);
    }

    @Test
    // TODO - Create tests for `void eat(Food food)`
    public void eatTest() {
        // Given
        int expectedNumMeals = 1;
        Food puppyChow = new Food();
        // When
        dog.eat(puppyChow);
        int actualNumMeals = dog.getNumberOfMealsEaten();
        // Then
        Assert.assertEquals("dog eat", expectedNumMeals, actualNumMeals);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest() {
        // Given
        int expected = 01;
        // When
        dog.getId();
        int actual = dog.getId();
        // Then
        Assert.assertEquals("get dog ID", expected, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java
    // instanceof keyword`
    // TODO - Create test to check Animal inheritance; google search `java
    // instanceof keyword`
    @Test
    public void animalInheritanceTest() {
        // given
        boolean expected = true;
        // when
        boolean actual = dog instanceof Animal;
        // then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Mammal inheritance; google search `java
    // instanceof keyword`
    @Test
    public void mammalInheritanceTest() {
        // given
        boolean expected = true;
        // when
        boolean actual = dog instanceof Mammal;
        // then
        Assert.assertEquals(expected, actual);
    }

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
}
