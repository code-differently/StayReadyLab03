package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Mammal;
import hbcu.stay.ready.animals.Animal;

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
    public void speakTest(){
        // Given
        Dog dog = new Dog("Yusuke", null, 02);
        String expected = "bark!";

        // When
        String actual = dog.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void setBirthDate(){
        // Given 
        Dog dog = new Dog("Hiei", new Date(), 03);
        Date birthDate = new Date();
        dog.setBirthDate(birthDate);
        Date expected = birthDate;
        // When
        Date actual = dog.getBirthDate();
        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void eatTest(){
        // Given
        Dog dog = new Dog("Kurama", new Date(), 04);
        // When
        Food food = new Food();
        dog.eat(food);
        dog.eat(food);
        Integer expected = 2;
        Integer actual = dog.getNumberOfMealsEaten();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void getIdTest(){
        // Given
        Dog dog = new Dog("Kuwabara", new Date(), 77);
        Integer expected = 77;
        // When
        Integer actual = dog.getId();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void AnimalInheritanceTest(){
        // Given
        Dog dog = new Dog("Toguro", new Date(), 06);
        Boolean expected = true;
        // When
        Boolean actual = dog instanceof Animal;
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void MammalInheritanceTest(){
        Dog dog = new Dog("Sensui", new Date(), 02);
        Boolean expected = true;
        // When
        Boolean actual = dog instanceof Mammal;
        // Then
        Assert.assertEquals(expected, actual);
    }

}