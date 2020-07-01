package hbcu.stay.ready;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.*;


public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    
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
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speakTest(){
        //Given
        String expected = "bark!";
        //When
        Dog dog = new Dog("Paul", new Date(),  0);
        dog.speak();
        //Then
        Assert.assertEquals(expected, dog.speak());
    }

    @Test
    public void setBirthDateTest(){
        //Given
        Date actual = new Date();
        Date expected = new Date();
        //When
        Dog dog = new Dog("Paul", new Date(),  0);

        //Then
        dog.setBirthDate(actual);
        Assert.assertEquals(expected, dog.getBirthDate());
    }


    @Test
    public void eatTest(){
        //Given
        Food food = new Food();
        Integer expected = 1;
        //When
        Dog dog = new Dog("Paul", new Date(), 0);

        //Then
        dog.eat(food);
        Assert.assertEquals(expected, dog.getNumberOfMealsEaten());
    }

    @Test
    public void getIDTest(){
        //Given
        Integer actual = 2;
        Integer expected = 2;
        //When
        Dog dog = new Dog("Paul", new Date(), actual);
        //Then
        Assert.assertEquals(expected, dog.getId());
    }

    @Test
    public void animalInheritTest(){
        Dog dog = new Dog("Paul", new Date(), 0);
        Boolean actual = dog instanceof Animal;
        Boolean expected = true;

        Assert.assertEquals(expected, actual);
        
    }

    @Test
    public void mammalInheritTest(){
        Dog dog = new Dog("Paul", new Date(), 0);
        Boolean actual = dog instanceof Mammal;
        Boolean expected = true;

        Assert.assertEquals(expected, actual);
        
    }
}
