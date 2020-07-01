package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Mammal;

import static org.junit.Assert.assertTrue;

import java.util.Date;


public class CatTest {

    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


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

    Date givenBDate;
    Cat cat;
    @Before
    public void initialize() {
        this.givenBDate = new Date();
        this.cat = new Cat("Simba", givenBDate, 99);
    }

    @Test
    public void setNameTest() {
        // Given
        String givenName = "Mufasa";

        // When
        cat.setName(givenName);
        String retrievedName = cat.getName();

        // Then
        Assert.assertEquals(givenName, retrievedName);
    }

    @Test
    public void speakTest() {
        // Given
        String expectedSound = "meow!";

        // When
        String retrievedSound = cat.speak();

        // Then
        Assert.assertEquals(expectedSound, retrievedSound);
    }

    @Test
    public void setBirthDateTest() {
        // Given
        Date givDate = new Date(34);

        // When
        cat.setBirthDate(givDate);
        Date retrievedBDate = cat.getBirthDate();

        // Then
        Assert.assertEquals(givDate, retrievedBDate);
    }

    @Test
    public void eatTest() {
        // Given
        Food catNip = new Food();
        int expectedNumOfMeals = 1 + cat.getNumberOfMealsEaten();

        // When
        cat.eat(catNip);
        int actualNumOfMeals = cat.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expectedNumOfMeals, actualNumOfMeals);
    }

    @Test
    public void getIdTest() {
        // Given
        int expectedID = 99;

        // When
        int actualID = cat.getId();

        // Then
        Assert.assertEquals(expectedID, actualID);
    }
    
    @Test
    public void animalInheritanceTest() {
        assertTrue(cat instanceof Animal);
    } 

    @Test
    public void mammalInheritanceTest() {
        assertTrue(cat instanceof Mammal);
    }

}
