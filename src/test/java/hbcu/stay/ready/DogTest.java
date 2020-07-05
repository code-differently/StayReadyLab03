package hbcu.stay.ready;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Mammal;


public class DogTest {

    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Zulo";
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

    @Test
    public void setNameTest() {
        // Given
        Dog d = new Dog(null, null, null);

        // When
        d.setName("Sajid");
        String expected = "Sajid";
        String actual = d.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest() {
        // Given
        Dog d = new Dog(null, null, null);
        Date test = new Date(1999, 1, 5);

        // When
        d.setBirthDate(test);
        Date expected = test;
        Date actual = d.getBirthDate();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        // Given
        Dog d = new Dog(null, null, null);

        // When
        String expected = "bark!";
        String actual = d.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {
        // Given
        Dog d = new Dog(null, null, null);
        Food dogFood = new Food();

        // When
        d.eat(dogFood);
        int expected = 1;
        int actual = d.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest() {
        // Given
        Dog d = new Dog(null, null, 4);

        // When
        
        int expected = 4;
        int actual = d.getId();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void animalInheritanceTest() {
        // Given
        Dog d = new Dog(null, null, null);

        // When
        boolean expected = true;
        boolean actual = d instanceof Animal;

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mammalInheritanceTest() {
        // Given
        Dog d = new Dog(null, null, null);

        // When
        boolean expected = true;
        boolean actual = d instanceof Mammal;

        // Then
        Assert.assertEquals(expected, actual);
    }

}
