package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
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
    public void setDogBday(){

        // Given 
        Dog dog = new Dog(null, null, null);
        Date expectedVal = new Date();
        // When 
        
        dog.setBirthDate(expectedVal);
        Date actualVal = dog.getBirthDate();

        // Then 
        Assert.assertEquals(expectedVal, actualVal);


    }

    @Test
    public void DogSpeakTest(){

        // Given 
        Dog dog = new Dog(null, null, null);
        String expectedVal = "bark!";

        // When 
        String actualval = dog.speak();

        // Then 
        Assert.assertEquals(expectedVal, actualval);


    }

    @Test
    public void DogEatTest(){

        // Given 
        Food fo = new Food(); 
        Dog dog = new Dog(null, null, null);
        int expectedVal = dog.getNumberOfMealsEaten() + 1;

        // When 
        dog.eat(fo);
        int actualval = dog.getNumberOfMealsEaten();

        // Then 
        Assert.assertEquals(expectedVal, actualval);


    }


    @Test
    public void dogInhOfAniTest(){

        // Given 
        Dog dog = new Dog(null, null, null);
        boolean expectedVal = true;

        // When 
        boolean actualval = dog instanceof Animal;

        // Then 
        Assert.assertEquals(expectedVal, actualval);


    }

    @Test
    public void dogInhOfMamTest(){

        // Given 
        Dog dog = new Dog(null, null, null);
        boolean expectedVal = true;

        // When 
        boolean actualval = dog instanceof Mammal;
        
        // Then 
        Assert.assertEquals(expectedVal, actualval);


    }




}
