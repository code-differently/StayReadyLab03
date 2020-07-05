package hbcu.stay.ready;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Mammal;

import java.util.Date;

public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    // Given (dog data)
    String expectedName;
    Date expectedBirthDate;
    Integer expectedId;
    Dog dog;
    @Before

    public void initialization(){
        expectedName = "Wings";
        expectedBirthDate = new Date();
        expectedId = 3;
        dog = new Dog(expectedName, expectedBirthDate, expectedId);
    }

    @Test
    public void constructorTest(){
        // Given 
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        //Then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
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

    @Test
    public void newDogTest(){ // Constructor Test
        //Given
        String givenName = "KitKat";
        Date givenBirthDate = new Date();
        Integer givenId = 1;

        //When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        //Then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speakTest(){

        //Given
        String expected = "bark!";

        //When
        String actual = dog.speak();
                
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest(){
        // Given
        Date expectedBirthDate = new Date();

        //When
        dog.setBirthDate(expectedBirthDate);
        Date actualBirthDate = dog.getBirthDate();

        //Then
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }

    @Test
    public void eatTest(){
        //Given
        Food cherries = new Food();
        int expected = 1;

        //When
        dog.eat(cherries);
        int actual = dog.getNumberOfMealsEaten();

        //Then  
        Assert.assertEquals(expected, actual);      
    }

    @Test
    public void getIdTest(){
        //Given
        Integer expectedId = 404;

        //When
        Dog dog = new Dog(expectedName, expectedBirthDate, expectedId);
        Integer actualId = dog.getId();

        //Then
        Assert.assertEquals(expectedId, actualId);    
    }

    @Test
    public void animalInheritenceTest(){
        // Given
        boolean expected= true;

        // When
        boolean actual = dog instanceof Mammal;

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mammmalInheritenceTest(){
        // Given
        boolean expected = true;

        // When
        boolean actual = dog instanceof Mammal;

        // Then
        Assert.assertEquals(expected, actual);

    }
 }
