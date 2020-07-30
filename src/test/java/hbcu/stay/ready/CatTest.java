package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Mammal;

import java.util.Date;


public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    
    Cat tom;
    Date date;
    String name;
    Integer id;

    @Before
    public void setup(){
        String name = "Tom";
        date = new Date();
        Integer id = 1;
        tom = new Cat(name, date, id);
    }

    @Test
    public void setNameTest(){
        // Given: in @Before

        // When
        tom.setName("Sylvester");
        String expected = "Sylvester";
        String actual = tom.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        // Given: in @Before
        
        // When
        String expected = "meow!";
        String actual = tom.speak();
        
        // Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        // Given: in @Before

        // When
        tom.setBirthDate(date);
        Date expected = date;
        Date actual = tom.getBirthDate();

        // Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        // Given: in @Before
        Food pizza = new Food();

        // When 
        tom.eat(pizza);
        int expected = 1;
        int actual = tom.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){
        // Given: in @Before

        // When
        int expected = 1;
        int actual = tom.getId();

        // Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void instanceOfAnimalTest(){
        // Then
        Assert.assertTrue(tom instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void instanceOfMammalTest(){
        // Then
        Assert.assertTrue(tom instanceof Mammal);
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
