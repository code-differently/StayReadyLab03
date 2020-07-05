package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Mammal;

import java.util.Date;


public class CatTest {
    // Create tests for `void setName(String name)`
    // Create tests for `speak`
    // Create tests for `setBirthDate(Date birthDate)`
    // Create tests for `void eat(Food food)`
    // Create tests for `Integer getId()`
    // Create test to check Animal inheritance; google search `java instanceof keyword`
    // Create test to check Mammal inheritance; google search `java instanceof keyword`


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
     //Create tests for `void setName(String name)
    @Test
    public void setNameTest(){
        //Given 
        Cat cat = new Cat("Garfield", new Date(), 07);
        String expected = "Aphrodite";
        //When 
        cat.setName("Aphrodite");
        String actual = cat.getName();
        //Then 
        Assert.assertEquals("testing set name of cat object", expected, actual);
    }

    
    //Create tests for `speak`
    @Test 
    public void speakTest(){
        //Given 
        Cat cat = new Cat("Garfield", new Date(), 07);
        String expected = "meow!";
        //When 
        cat.speak("meow!");
        String actual = Animal.speak();
        //Then
        Assert.assertEquals("testing meow statement of cat object", expected, actual);
    }

    //Create tests for `setBirthDate(Date birthDate)
    @Test 
    public void setBirthDateTest(){
        //Given 
        Cat cat = new Cat("Garfield", new Date(), 07);
        Date expected = new Date(911);

        //When 
        cat.setBirthDate(new Date(911));
        Date actual = cat.getBirthDate();

        //Then 
        Assert.assertEquals("testing set birthday of cat object", expected, actual);
        
    }
 
    // Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        //Given 
        Cat cat = new Cat("Garfield", new Date(), 07);
        Food catFood = new Food();
        //When 
        cat.eat(catFood);
        //Then
        int expected = 1;
        int actual = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual, 0.0);
    }

    //Create tests for `Integer getId()
    @Test
    public void idTest(){
        //Given 
        Cat cat = new Cat("Garfield", new Date(), 07);
        Integer expected = 7;
        //When 
        Integer actual = cat.getId();
        //Integer actual = 7;
        //Then 
        Assert.assertEquals("testing getter ID", expected, actual);
    }

    //Create test to check Animal inheritance; google search `java instanceof keyword
    @Test
    public void animalInheritanceTest(){
        //Given 
        Cat cat = new Cat("Garfield", new Date(), 07);
        //When 
        Boolean expected = true;
        Boolean actual  = cat instanceof Animal;
        //Then
        Assert.assertEquals(expected, actual);
    }
    //Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest(){
        //Given
        Cat cat = new Cat("Garfield", new Date(), 07);
        //When 
        Boolean expected = true;
        Boolean actual = cat instanceof Mammal;
        //Then 
        Assert.assertEquals(expected, actual);
    }
    }


