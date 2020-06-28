package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_storage.DogHouse;

import java.util.Date;

public class DogHouseTest {
    Date givenBirthDate = new Date();

    @Test
    public void addTest() {
        // Given
        Dog dogT = new Dog("TestDog", givenBirthDate, 0);

        // When
        DogHouse.add(dogT);
        Dog expectedValue = dogT;
        Dog actualValue = DogHouse.getDogById(0);
        DogHouse.clear();

        // Then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void removeTest() {
        // Given
        Dog dogT = new Dog("TestDog", givenBirthDate, 0);

        // When
        DogHouse.add(dogT);
        DogHouse.remove(dogT);
        Dog expectedValue = null;
        Dog actualValue = DogHouse.getDogById(0);

        // Then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void removeIdTest() {
        // Given
        Dog dogT = new Dog("TestDog", givenBirthDate, 0);

        // When
        DogHouse.add(dogT);
        DogHouse.remove(0);
        Dog expectedValue = null;
        Dog actualValue = DogHouse.getDogById(0);

        // Then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getDogByIdTest() {
        // Given
        Dog dogT = new Dog("TestDog", givenBirthDate, 0);

        // When
        DogHouse.add(dogT);
        Dog expectedValue = dogT;
        Dog actualValue = DogHouse.getDogById(0);
        DogHouse.clear();

        // Then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getNumberOfDogs() {
        // Given
        Dog dogT = new Dog("TestDog", givenBirthDate, 0);
        Dog dogT2 = new Dog("TestDog", givenBirthDate, 1);
        Dog dogT3 = new Dog("TestDog", givenBirthDate, 2);

        // When
        DogHouse.add(dogT);
        DogHouse.add(dogT2);
        DogHouse.add(dogT3);
        int expectedValue = 3;
        int actualValue = DogHouse.getNumberOfDogs();
        DogHouse.clear();

        // Then
        Assert.assertEquals(expectedValue, actualValue);
    }
}
