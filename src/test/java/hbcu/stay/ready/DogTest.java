package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Mammal;
import java.util.Calendar;
import java.util.Date;


public class DogTest {
    Date givenBirthDate = new Date();
    Dog dogT;

    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Zula";
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given
        dogT = new Dog("TestDog", givenBirthDate, 0);

        // When
        String expectedName = "namaste";
        dogT.setName(expectedName);
        String actualName = dogT.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setBirthDateTest() {
        // Given
        dogT = new Dog("TestDog", givenBirthDate, 0);

        // When
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1998);
        cal.set(Calendar.MONTH, Calendar.OCTOBER);
        cal.set(Calendar.DAY_OF_MONTH, 15);
        Date expectedDate = cal.getTime();;
        dogT.setBirthDate(expectedDate);
        Date actualDate = dogT.getBirthDate();

        // Then
        Assert.assertEquals(expectedDate, actualDate);
    }

    @Test
    public void speakTest() {
        // Given
        dogT = new Dog("TestDog", givenBirthDate, 0);

        // When
        String expectedValue = "bark!";
        dogT.speak();
        String actualValue = dogT.speak();

        // Then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void eatTest() {
        // Given
        dogT = new Dog("TestDog", givenBirthDate, 0);
        Food apple = new Food();

        // When
        int expectedValue = 1;
        dogT.eat(apple);
        int actualValue = dogT.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expectedValue, actualValue);
    }

    public void getIdTest() {
        // Given
        dogT = new Dog("TestDog", givenBirthDate, 0);

        // When
        int expectedValue = 0;
        int actualValue = dogT.getId();

        // Then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void animalInheritanceTest() {
        // Given
        dogT = new Dog("TestDog", givenBirthDate, 0);

        // When
        Boolean expectedValue = true;
        Boolean actualValue = dogT instanceof Animal;

        // Then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void mammalInheritanceTest() {
        // Given
        dogT = new Dog("TestDog", givenBirthDate, 0);

        // When
        Boolean expectedValue = true;
        Boolean actualValue = dogT instanceof Mammal;

        // Then
        Assert.assertEquals(expectedValue, actualValue);
    }
}
