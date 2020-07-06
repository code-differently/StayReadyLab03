package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Mammal;

import java.util.Date;

public class CatTest {

    Cat cat;

    @Before
    public void setup() {
        this.cat = new Cat("Tigre", new Date(), 1);
    }

    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest() {
        // Given
        String expected = "Nala";
        // When
        cat.setName("Nala");
        String actual = cat.getName();
        // Then
        Assert.assertEquals("testing set cat name", expected, actual);
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        // Given
        String expected = "meow!";
        // When
        String actual = cat.speak();
        // Then
        Assert.assertEquals("testing meow", expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        // Given
        Date expected = new Date();
        // When
        cat.setBirthDate(new Date());
        Date actual = cat.getBirthDate();
        // Then
        Assert.assertEquals("testing set bday", expected, actual);
    }

    @Test
    // TODO - Create tests for `void eat(Food food)`
    public void eatTest() {
        // Given
        int expectedNumMeals = 1;
        Food meowChow = new Food();
        // When
        cat.eat(meowChow);
        int actualNumMeals = cat.getNumberOfMealsEaten();
        // Then
        Assert.assertEquals("cat eat", expectedNumMeals, actualNumMeals);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest() {
        // Given
        int expected = 01;
        // When
        cat.getId();
        int actual = cat.getId();
        // Then
        Assert.assertEquals("get cat ID", expected, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java
    // instanceof keyword`
    @Test
    public void animalInheritanceTest() {
        // given
        boolean expected = true;
        // when
        boolean actual = cat instanceof Animal;
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
        boolean actual = cat instanceof Mammal;
        // then
        Assert.assertEquals(expected, actual);
    }

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

}