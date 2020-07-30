package hbcu.stay.ready;

import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_storage.DogHouse;

import java.util.Date;


public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addTest(){
        // Given
        DogHouse dogHouse = new DogHouse();
        Dog fido = new Dog("fido", new Date(), 1);

        // When
        dogHouse.add(fido);
        Integer expected = 1;
        Integer actual = dogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeByIdTest(){
        // Given
        DogHouse dogHouse = new DogHouse();
        Dog fido = new Dog("fido", new Date(), 1);

        // When
        dogHouse.add(fido);
        dogHouse.remove(1);
        Integer expected = 0;
        Integer actual = dogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeByDogTest(){
        // Given
        DogHouse dogHouse = new DogHouse();
        Dog fido = new Dog("fido", new Date(), 1);

        // When
        dogHouse.add(fido);
        System.out.println(dogHouse.getNumberOfDogs());
        dogHouse.remove(fido);
        Integer expected = 0;
        Integer actual = dogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest(){
        // Given
        DogHouse dogHouse = new DogHouse();
        Dog fido = new Dog("fido", new Date(), 1);

        // When
        dogHouse.add(fido);
        Dog expected = fido;
        Dog actual = dogHouse.getDogById(1);

        // Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfDogsTest(){
        // Given
        DogHouse dogHouse = new DogHouse();
        Dog fido = new Dog("fido", new Date(), 1);

        // When
        dogHouse.add(fido);
        Integer expected = 1;
        Integer actual = dogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
