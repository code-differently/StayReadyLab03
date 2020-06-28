package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Mammal;

import java.util.ArrayList;
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
    public void constructorTest() 
    {
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
    public void setNameTest()
    {
     //Given 
     String expectedName = "Aang";

     //When
     Cat aang = new Cat("Korra",null,null);
     aang.setName("Aang");

     String actualName = aang.getName();

     //Then
     Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setDateTest()
    {
         //Given 
     Date expectedDate = new Date(2020, 6, 28);

     //When
     Cat sylvesterCat = new Cat("Sylvester",new Date(2014,3,12),null);
        sylvesterCat.setBirthDate(new Date(2020,6,28));

     Date actualDate = sylvesterCat.getBirthDate();

     //Then
     Assert.assertEquals(expectedDate, actualDate);

    }

    @Test
    public void speakTest()
    {
        //Given
        String expectedSpeak = "meow!";

        //When
        Cat sylvesterCat = new Cat(null,null,null);
        String actualSpeak = sylvesterCat.speak();

        //Then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void eatTest()
    {
        //Given
            int expectedMealSize = 3;

            //When
            Cat hangryCat = new Cat(null, null, null);
            hangryCat.eat(new Food());
            hangryCat.eat(new Food());
            hangryCat.eat(new Food());

           int actualMealSize = hangryCat.getNumberOfMealsEaten();

           //Then 
           Assert.assertEquals(expectedMealSize, actualMealSize);
            
    }

    @Test
    public void idTest()
    {
        int expectedId = 491;

        //When
        Cat skunkCat = new Cat(null,null,491);
        int actualId = skunkCat.getId();

        //Then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void isAnimalTest()
    {
        //Given
        Cat catDog = new Cat(null,null,null);

        //When
        boolean result = (catDog instanceof Animal);

        //Then
            System.out.println("Is it a cat, a dog, is it even an animal?: "+result);
      

    }
    @Test
    public void isMammalTest()
    {
        //Given
        Cat catDog = new Cat(null,null,null);

        //When
        boolean result = (catDog instanceof Mammal);

        //Then
            System.out.println("Is it a mammal?: "+result);
      

    }

}
