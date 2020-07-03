package hbcu.stay.ready;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
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
    Dog dog;
    @Before
    public void setUp(){
        givenName="Rock";
        givenBirthDate= new Date();
        givenId=7;
        dog=new Dog(givenName, givenBirthDate, givenId);
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

    @Test
    public void constructorTest(){
        // Given
        String givenName="Roe";
        Date givenDate = new Date();
        int givenID=2;
        // When
        Dog dogTest = new Dog(givenName, givenDate, givenId);
        String actualName=dogTest.getName();
        Date actualDate=dogTest.getBirthDate();
        Integer actualID=dogTest.getId();
        // Then
        Assert.assertEquals(givenName, actualName);
        Assert.assertEquals(givenBirthDate, actualDate);
        Assert.assertEquals(givenId,actualID);

    }

    @Test
    public void speakTest(){
        //Given
        String expected="bark!";

        // When
        String actual=dog.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDate(){
        // Given
        Date expected = new Date();

        // When
        dog.setBirthDate(expected);
        Date actual=dog.getBirthDate();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest(){
        // Given
        Food apple= new Food();
        int expected = 1;

        // When
        dog.eat(apple);
        int actual = dog.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIDTest(){
        // Given
        int expected = 7;

        //When
        int actual=dog.getId();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void animalTest(){
        // Given
        boolean expected= true;
        // When
        boolean actual= dog instanceof Animal;
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mammalTest(){
        // Given
        boolean expected= true;
        // When
        boolean actual= dog instanceof Mammal;
        // Then
        Assert.assertEquals(expected, actual);
    }
}
