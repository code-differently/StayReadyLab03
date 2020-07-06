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
    public void testName(){
        //Given
        String name = "meowster";
        Date birthDate = new Date();
        Integer Id = new Integer(5);
        Dog d1 = new Dog(name,birthDate,Id);
        //When
        d1.setName(name);
        //Then
        String actualName = d1.getName();
        Assert.assertEquals("meowster", actualName);
    }

    @Test
    public void testBirthDate(){
        //Given
        String name = "meowster";
        Date birthDate = new Date();
        Integer Id = new Integer(5);
        Dog d1 = new Dog(name,birthDate,Id);
        //When
        d1.setBirthDate(birthDate);
        //Then
        Date actualDate = d1.getBirthDate();
        Assert.assertEquals(birthDate, actualDate);
    }

    @Test
    public void testEat(){
        //Given
        String name = "meowster";
        Date birthDate = new Date();
        Integer Id = new Integer(5);
        Dog d1 = new Dog(name,birthDate,Id);
        Food pizza = new Food();
        //When
        d1.eat(pizza);
        //Then
        int actualMeals = d1.getNumberOfMealsEaten();
        Assert.assertEquals(1, actualMeals);
        
    }

    @Test
    public void testId(){
        //Given
        String name = "meowster";
        Date birthDate = new Date();
        Integer Id = new Integer(5);
        Dog d1 = new Dog(name,birthDate,Id);
        //When
        Integer actualId = d1.getId();
        //Then
        Assert.assertEquals(Id, actualId);
    }

    @Test
    public void testSpeak(){
        //Given
        String name = "meowster";
        Date birthDate = new Date();
        Integer Id = new Integer(5);
        Dog d1 = new Dog(name,birthDate,Id);
        //When
        String actualSpeak = d1.speak();
        //Then
        Assert.assertEquals("bark!", actualSpeak);
    }
    @Test
    public void testAnimal(){
    //Given
    String name = "meowster";
    Date birthDate = new Date();
    Integer Id = new Integer(5);
    Dog c1 = new Dog(name,birthDate,Id);
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
    Dog c1 = new Dog(name,birthDate,Id);
    //When
    boolean isAnimal = c1 instanceof Mammal;
    //Then
    Assert.assertEquals(true, isAnimal);
    }
}
