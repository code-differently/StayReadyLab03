package hbcu.stay.ready;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest() {
        // Given
        String givenName = "Brian";
        Date givenBDate = new Date();
        Dog testDog;

        // When
        testDog = AnimalFactory.createDog(givenName, givenBDate);

        String retrievedName = testDog.getName();
        Date retriveBDate = testDog.getBirthDate();

        // Then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBDate, retriveBDate);
    }

    @Test
    public void createCatTest() {
        // Given
        String givenName = "Garfield";
        Date givenBDate = new Date();
        Cat testCat;

        // When
        testCat = AnimalFactory.createCat(givenName, givenBDate);

        String retrievedName = testCat.getName();
        Date retriveBDate = testCat.getBirthDate();

        // Then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBDate, retriveBDate);
    }

}
