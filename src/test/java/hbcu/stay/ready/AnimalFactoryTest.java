package hbcu.stay.ready;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Dog;


import org.junit.Test;
import org.junit.Assert;
import java.util.Date;


public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest() {
        // Given
        Dog dog = new Dog("Zeek", new Date(), 3);
        String expectedName = "Zeek";
        Date expectedBirthDate = new Date();
        Integer expectedId = 3;
        // When
        dog.setName("Zeek");
        dog.setBirthDate(new Date());
        // When
        String actualName = dog.getName();
        Date actualBirthDate = dog.getBirthDate();
        Integer actualId = dog.getId();
        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
        Assert.assertEquals(expectedId, actualId);
    }

    // TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest() {
        // Given (dog data)
        Cat cat = new Cat("Whiskers", new Date(), 3);
        String expectedName = "Whiskers";
        Date expectedBirthDate = new Date();
        Integer expectedId = 3;
        // When
        cat.setName("Whiskers");
        cat.setBirthDate(new Date());
        // When
        String actualName = cat.getName();
        Date actualBirthDate = cat.getBirthDate();
        Integer actualId = cat.getId();
        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
        Assert.assertEquals(expectedId, actualId);
    }
}
