package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import org.junit.Before;
import java.util.Date;
import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Mammal;


public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    String givenName;
    Date givenBirthDate;
    Integer givenId;
    Dog doggy;

    @Before
    public void dogInit(){
        givenName = "Milli";
        givenBirthDate = new Date();
        givenId = 0;

        doggy = new Dog(givenName, givenBirthDate, givenId);
    }

    @Test
    public void constructorTest(){
        // When (we retrieve data from the cat)
        String retrievedName = doggy.getName();
        Date retrievedBirthDate = doggy.getBirthDate();
        Integer retrievedId = doggy.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given
        String expectedName = "Milo";

        // When
        doggy.setName("Milo");
        String actualDogName = doggy.getName();

        // Then
        Assert.assertEquals(expectedName, actualDogName);
    }
    @Test
    public void setBirthDateTest(){
        //Given
        Date expectedBirthDate = new Date();
        //When
        doggy.setBirthDate(expectedBirthDate);
        Date actualBirthDate = doggy.getBirthDate();

        //Then
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }
    @Test 
    public void speakTest(){
        //Given
        String expectedSpeak = "bark!";
        //When
        String actualSpeak = doggy.speak();

        //Then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }
    @Test 
    public void eatTest(){
        //Given

        //When
        Food food = new Food();
        int expectedEaten = doggy.getNumberOfMealsEaten() + 1;
        doggy.eat(food);
        int actualEaten = doggy.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(expectedEaten, actualEaten);
    }
    @Test
    public void getIdTest(){
        //Given
        Integer expectedId = 0;
        //When
        Integer actualId = doggy.getId();

        //Then
        Assert.assertEquals(expectedId, actualId);
    }
    @Test
    public void dogAnimalInheritance(){
        //Given
        boolean expectedBool = true;
        //When
        boolean actualBool = doggy instanceof Animal;
        //Then
        Assert.assertEquals(expectedBool, actualBool);
    }
    @Test
    public void dogMammalInheritance(){
        //Given
        boolean expectedBool = true;
        //When
        boolean actualBool = doggy instanceof Mammal;
        //Then
        Assert.assertEquals(expectedBool, actualBool);
    }
}
