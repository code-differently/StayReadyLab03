package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.*;

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
        String actual = "Martha";
        String expected = "Martha";
        //When
        Cat cat = new Cat("Paul", new Date(),  0);
        //Then
        cat.setName(actual);
        Assert.assertEquals(expected, cat.getName());
    }

    @Test
    public void speakTest(){
        //Given
        String expected = "meow!";
        //When
        Cat cat = new Cat("Paul", new Date(),  0);
        cat.speak();
        //Then
        Assert.assertEquals(expected, cat.speak());
    }

    @Test
    public void setBirthDateTest(){
        //Given
        Date actual = new Date();
        Date expected = new Date();
        //When
        Cat cat = new Cat("Paul", new Date(),  0);

        //Then
        cat.setBirthDate(actual);
        Assert.assertEquals(expected, cat.getBirthDate());
    }


    @Test
    public void eatTest(){
        //Given
        Food food = new Food();
        Integer expected = 1;
        //When
        Cat cat = new Cat("Paul", new Date(), 0);

        //Then
        cat.eat(food);
        Assert.assertEquals(expected, cat.getNumberOfMealsEaten());
    }

    @Test
    public void getIDTest(){
        //Given
        Integer actual = 2;
        Integer expected = 2;
        //When
        Cat cat = new Cat("Paul", new Date(), actual);
        //Then
        Assert.assertEquals(expected, cat.getId());
    }

    @Test
    public void animalInheritTest(){
        Cat cat = new Cat("Paul", new Date(), 0);
        Boolean actual = cat instanceof Animal;
        Boolean expected = true;

        Assert.assertEquals(expected, actual);
        
    }

    @Test
    public void mammalInheritTest(){
        Cat cat = new Cat("Paul", new Date(), 0);
        Boolean actual = cat instanceof Mammal;
        Boolean expected = true;

        Assert.assertEquals(expected, actual);
        
    }

}
