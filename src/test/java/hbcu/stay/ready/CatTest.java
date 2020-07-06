package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Mammal;

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

    @Test
    public void setNameTest(){

        //Given 
        Cat cat = new Cat("Gabe", new Date(), 1);
        String expected = "Jake";

        //When
        cat.setName("Jake");

        String actual = cat.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        String expected = "meow!";

        Cat cat = new Cat("Sam", new Date(), 2);

        String actual = cat.speak();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setBirthDateTest(){

        Cat cat = new Cat("Jill", new Date(), 3);
        Date expected = new Date();

        Date actual = cat.getBirthDate();
        
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest(){

        Cat cat = new Cat("Scott", new Date(), 4);
        
        int expectedNumMeals = 1;
        Food chowMix = new Food();

        cat.eat(chowMix);
        int actualNumMeals = cat.getNumberOfMealsEaten();

        Assert.assertEquals(expectedNumMeals, actualNumMeals);


    }

    @Test
    public void getIdTest(){

        Cat cat = new Cat("Joe", new Date(), 5);

        Integer expected = 5;

        Integer actual = cat.getId();

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void AnimalInheritanceTest(){
        Cat cat = new Cat(null, null, null);
        boolean expected = true;
        boolean actual = cat instanceof Animal;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MammalInheritanceTest(){

        Cat cat = new Cat(null, null, null);
        boolean expected = true;
        boolean actual = cat instanceof Mammal;

        Assert.assertEquals(expected, actual);
    }
}
