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
    public void testName(){
        //Given
        String name = "meowster";
        Date birthDate = new Date();
        Integer Id = new Integer(5);
        Cat c1 = new Cat(name,birthDate,Id);
        //When
        c1.setName(name);
        //Then
        String actualName = c1.getName();
        Assert.assertEquals("meowster", actualName);
    }

    @Test
    public void testBirthDate(){
        //Given
        String name = "meowster";
        Date birthDate = new Date();
        Integer Id = new Integer(5);
        Cat c1 = new Cat(name,birthDate,Id);
        //When
        c1.setBirthDate(birthDate);
        //Then
        Date actualDate = c1.getBirthDate();
        Assert.assertEquals(birthDate, actualDate);
    }

    @Test
    public void testEat(){
        //Given
        String name = "meowster";
        Date birthDate = new Date();
        Integer Id = new Integer(5);
        Cat c1 = new Cat(name,birthDate,Id);
        Food pizza = new Food();
        //When
        c1.eat(pizza);
        //Then
        int actualMeals = c1.getNumberOfMealsEaten();
        Assert.assertEquals(1, actualMeals);
        
    }

    @Test
    public void testId(){
        //Given
        String name = "meowster";
        Date birthDate = new Date();
        Integer Id = new Integer(5);
        Cat c1 = new Cat(name,birthDate,Id);
        //When
        Integer actualId = c1.getId();
        //Then
        Assert.assertEquals(Id, actualId);
    }

    @Test
    public void testSpeak(){
        //Given
        String name = "meowster";
        Date birthDate = new Date();
        Integer Id = new Integer(5);
        Cat c1 = new Cat(name,birthDate,Id);
        //When
        String actualSpeak = c1.speak();
        //Then
        Assert.assertEquals("meow!", actualSpeak);
    }

    @Test
    public void testAnimal(){
    //Given
    String name = "meowster";
    Date birthDate = new Date();
    Integer Id = new Integer(5);
    Cat c1 = new Cat(name,birthDate,Id);
    //When
    boolean isAnimal = c1 instanceof Animal;
    //Then
    Assert.assertEquals(true, isAnimal);
    }

    @Test
    public void testMammal(){
    //Given
    String name = "meowster";
    Date birthDate = new Date();
    Integer Id = new Integer(5);
    Cat c1 = new Cat(name,birthDate,Id);
    //When
    boolean isAnimal = c1 instanceof Mammal;
    //Then
    Assert.assertEquals(true, isAnimal);
    }

}
