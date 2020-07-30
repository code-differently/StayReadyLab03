package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Mammal;

import java.util.Date;


public class DogTest {
    
    Dog krypto;
    String name;
    Date birthDate;
    Integer id;

    @Before
    public void setup(){
        name = "Krypto";
        birthDate = new Date();
        id = 1;

        krypto = new Dog(name, birthDate, id);
    }

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void constructorTest(){
        // Given: check @Before

        // When
        String expectedName = "Krypto";
        Date expectedBirthDate = birthDate;
        Integer expectedId = 1;
        
        String actualName = krypto.getName();
        Date actuaBirthDate = krypto.getBirthDate();
        Integer actualId = krypto.getId();

        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actuaBirthDate);
        Assert.assertEquals(expectedId, actualId);

    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        // Given: check @Before

        // When
        String expected = "bark!";
        String actual = krypto.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        // Given: check @Before
        Date birthdDate = new Date();

        // When
        krypto.setBirthDate(birthDate);
        Date expected = birthdDate;
        Date actual = krypto.getBirthDate();

        // Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        // Given: check @Before
        Food food = new Food();

        // When
        krypto.eat(food);
        Integer expected = 1;
        Integer actual = krypto.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){
        // Given: check @Before

        // When
        Integer expected = 1;
        Integer actual = krypto.getId();

        // Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void instanceOfAnimalTest(){
        Assert.assertTrue(krypto instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void instanceOfMammalTest(){
        Assert.assertTrue(krypto instanceof Mammal);
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
}
