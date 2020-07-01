package hbcu.stay.ready;

import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_storage.DogHouse;

import java.util.Date;


public class DogHouseTest {
    
    Dog dog;
    @Before
    public void initiliaze() {
        this.dog = new Dog(null, null, 25);
        DogHouse.clear();
    }
    
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addTest() {
        // Given
        Dog expectedDog;

        // When
        DogHouse.add(dog);
        expectedDog = DogHouse.getDogById(25);

        // Then
        Assert.assertEquals(expectedDog, dog);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIdTest() {
        // Given
        Dog expectedDog = null;

        // When
        DogHouse.add(dog);
        DogHouse.remove(25);

        Dog actualDog = DogHouse.getDogById(25);

        // Then
        Assert.assertEquals(expectedDog, actualDog);
    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogTest() {
        // Given
        Dog expectedDog = null;

        // When
        DogHouse.add(dog);
        DogHouse.remove(dog);

        Dog actualDog = DogHouse.getDogById(25);

        // Then
        Assert.assertEquals(expectedDog, actualDog);
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest() {
        // Given
        Dog expectedDog = dog;

        // When
        DogHouse.add(expectedDog);
        Dog actualDog = DogHouse.getDogById(25);

        // Then
        Assert.assertEquals(expectedDog, actualDog);
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfDogsTest() {
        // Given
        int expectedNumOfDogs = 1;

        // When
        DogHouse.add(dog);
        int actualNumOfDogs = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expectedNumOfDogs, actualNumOfDogs);
    }


    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
