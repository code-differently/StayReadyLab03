package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Mammal;

import java.util.Date;


public class CatTest {

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given
        Cat c = new Cat(null, null, null);

        // When
        c.setName("Sajid");
        String expected = "Sajid";
        String actual = c.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest() {
        // Given
        Cat c = new Cat(null, null, null);
        Date test = new Date(1999, 1, 5);

        // When
        c.setBirthDate(test);
        Date expected = test;
        Date actual = c.getBirthDate();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        // Given
        Cat c = new Cat(null, null, null);

        // When
        String expected = "meow!";
        String actual = c.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {
        // Given
        Cat c = new Cat(null, null, null);
        Food catFood = new Food();

        // When
        c.eat(catFood);
        int expected = 1;
        int actual = c.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest() {
        // Given
        Cat c = new Cat(null, null, 4);

        // When
        
        int expected = 4;
        int actual = c.getId();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void animalInheritanceTest() {
        // Given
        Cat c = new Cat(null, null, null);

        // When
        boolean expected = true;
        boolean actual = c instanceof Animal;

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mammalInheritanceTest() {
        // Given
        Cat c = new Cat(null, null, null);

        // When
        boolean expected = true;
        boolean actual = c instanceof Mammal;

        // Then
        Assert.assertEquals(expected, actual);
    }

}
