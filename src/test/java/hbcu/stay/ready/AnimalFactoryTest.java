package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import java.util.Date;

public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest() {
        // Given
        Date givenBirthDate = new Date();
        String name = "Bud";

        // When
        Dog newDog = AnimalFactory.createDog(name, givenBirthDate);
        String expectedNameValue = name;
        Date expectedDateValue = givenBirthDate;
        String actualNameValue = newDog.getName();
        Date actualDateValue = newDog.getBirthDate();

        // Then
        Assert.assertEquals(expectedNameValue, actualNameValue);
        Assert.assertEquals(expectedDateValue, actualDateValue);
    }

    @Test
    public void createCatTest() {
        // Given
        Date givenBirthDate = new Date();
        String name = "Mud";

        // When
        Cat newCat = AnimalFactory.createCat(name, givenBirthDate);
        String expectedNameValue = name;
        Date expectedDateValue = givenBirthDate;
        String actualNameValue = newCat.getName();
        Date actualDateValue = newCat.getBirthDate();

        // Then
        Assert.assertEquals(expectedNameValue, actualNameValue);
        Assert.assertEquals(expectedDateValue, actualDateValue);
    }
}
