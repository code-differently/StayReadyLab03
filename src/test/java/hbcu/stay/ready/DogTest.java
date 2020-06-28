package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Mammal;


import java.util.ArrayList;
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
    public void setNameTest() 
    {
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
    public void setDateTest()
    {
         //Given 
       Date expectedDate = new Date(2020,5,12);

     //When
     Dog spikeDog = new Dog("Sylvester",new Date(2014,3,12),null);
        spikeDog.setBirthDate(new Date(2020,5,12));

     Date actualDate = spikeDog.getBirthDate();

     //Then
     Assert.assertEquals(expectedDate, actualDate);

    }

    @Test
    public void speakTest()
    {
        //Given
        String expectedSpeak = "bark!";

        //When
        Dog spikeDog = new Dog(null,null,null);
        String actualSpeak = spikeDog.speak();

        //Then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void eatTest()
    {
        //Given
            int expectedMealSize = 3;

            //When
            Dog hangryDog = new Dog(null, null, null);
            hangryDog.eat(new Food());
            hangryDog.eat(new Food());
            hangryDog.eat(new Food());

           int actualMealSize = hangryDog.getNumberOfMealsEaten();

           //Then 
           Assert.assertEquals(expectedMealSize, actualMealSize);
            
    }

    @Test
    public void idTest()
    {
        int expectedId = 491;

        //When
        Dog bullyDog = new Dog(null,null,491);
        int actualId = bullyDog.getId();

        //Then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void isAnimalTest()
    {
        //Given
        Dog  catDog = new Dog(null,null,null);

        //When
        boolean result = (catDog instanceof Animal);

        //Then
            System.out.println("Is it a cat, a dog, is it even an animal?: "+result);
      

    }
    @Test
    public void isMammalTest()
    {
        //Given
        Dog catDog = new Dog(null,null,null);

        //When
        boolean result = (catDog instanceof Mammal);

        //Then
        System.out.println("Is it a mammal?: "+result);
      

    }
}
