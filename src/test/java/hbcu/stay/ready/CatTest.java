package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import hbcu.stay.ready.animals.Cat;

import java.util.Date;
import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Mammal;


public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    String givenName;
    Date givenBirthDate;
    Integer givenId;
    Cat cat;
    @Before
    public void setUp(){
        givenName="Alberto";
        givenBirthDate= new Date();
        givenId=11;
        cat=new Cat(givenName, givenBirthDate, givenId);
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


    @Test
    public void setNameTest(){
        // Given
        String expectedName="Jo";
        // When
        cat.setName("Jo");
        String actualName=cat.getName();
        // Then
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void speakTest(){
        //Given
        String expected="meow!";

        // When
        String actual=cat.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDate(){
        // Given
        Date expected = new Date();

        // When
        cat.setBirthDate(expected);
        Date actual=cat.getBirthDate();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest(){
        // Given
        Food apple= new Food();
        int expected = 1;

        // When
        cat.eat(apple);
        int actual = cat.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIDTest(){
        // Given
        int expected = 11;

        //When
        int actual=cat.getId();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void animalTest(){
        // Given
        boolean expected= true;
        // When
        boolean actual= cat instanceof Animal;
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mammalTest(){
        // Given
        boolean expected= true;
        // When
        boolean actual= cat instanceof Mammal;
        // Then
        Assert.assertEquals(expected, actual);
    }
}