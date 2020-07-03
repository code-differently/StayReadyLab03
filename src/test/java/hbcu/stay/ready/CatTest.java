package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Animal;
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
    public void setNameTest(){
        //Given
        String givenName = "Sandy";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        //When
        Cat catTest = new Cat(givenName, givenBirthDate, givenId);
        catTest.setName("Sandy");
        String actualName = catTest.getName();
        //Then
        Assert.assertEquals(givenName, actualName);
    }
    @Test
    public void setBirthDateTest(){
        //Given
        String givenName = "Sandy";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Date expectedBirth = new Date();
        //When
        Cat catTest = new Cat(givenName, givenBirthDate, givenId);
        catTest.setBirthDate(expectedBirth);
        Date actualBirthDate = catTest.getBirthDate();
        //Then
        Assert.assertEquals(expectedBirth, actualBirthDate);
    }
    @Test
    public void speakTest(){
        //Given
        String givenName = "Sandy";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        String givenSpeak = "meow!";

        //When
        Cat catTest = new Cat(givenName, givenBirthDate, givenId);
        String actualSpeak = catTest.speak();

        //Then
        Assert.assertEquals(givenSpeak, actualSpeak);
    }
    @Test
    public void eatTest(){
        //Given
        String givenName = "Sandy";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //When
        Cat catTest = new Cat(givenName, givenBirthDate, givenId);
        Food newFood = new Food();
        int expectedNumOfMeals = catTest.getNumberOfMealsEaten() + 1;
        catTest.eat(newFood);
        int actualNumOfMeals = catTest.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(expectedNumOfMeals, actualNumOfMeals);
    }
    @Test
    public void getIdTest(){
        //Given
        String givenName = "Sandy";
        Date givenBirthDate = new Date();
        Integer givenId = 1;
        //When
        Cat catTest = new Cat(givenName, givenBirthDate, givenId);
        Integer actualId = catTest.getId();

        //Then
        Assert.assertEquals(givenId, actualId);
    }
    @Test
    public void catAnimalInheritanceTest(){
        //Given
        boolean expectedBool = true;
        String givenName = "Sandy";
        Date givenBirthDate = new Date();
        Integer givenId = 1;
        //When
        Cat catTest = new Cat(givenName, givenBirthDate, givenId);
        boolean actualBool = (catTest instanceof Animal);
        //Then
        Assert.assertEquals(expectedBool, actualBool);
    }
    @Test
    public void catMammalInheritanceTest(){
        //Given
        boolean expectedBool = true;
        String givenName = "Sandy";
        Date givenBirthDate = new Date();
        Integer givenId = 1;
        //When
        Cat catTest = new Cat(givenName, givenBirthDate, givenId);
        boolean actualBool = (catTest instanceof Mammal);
        //Then
        Assert.assertEquals(expectedBool, actualBool);
    }


}
