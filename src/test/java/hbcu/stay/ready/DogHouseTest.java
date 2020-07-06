package hbcu.stay.ready;

import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_storage.DogHouse;

import java.util.Date;


public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

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

    @Test
    public void addTest(){
        // Given
        Dog dog = new Dog("Midoriya", new Date(), 01);
        DogHouse.add(dog);
        // When
        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        // Given
        Dog dog = new Dog("All Might", new Date(), 02);
        DogHouse.add(dog);
        DogHouse.add(dog);
        // When
        DogHouse.remove(dog);
        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test

    // Test for remove id
    public void removeByIdTest(){
        // Given
        Dog dog = new Dog("Bakugo", new Date(), 03);
        DogHouse.add(dog);
        //When
        DogHouse.remove(03);
        Integer expected = 0;
        Integer actual = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void getDogByIdTest(){
        //Given
        Dog dog = new Dog("Todoroki", new Date(), 04);
        DogHouse.add(dog);
        //When
        Dog expected = dog;
        Dog actual = DogHouse.getDogById(04);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfDogsTest(){
        // Given
        Dog dog = new Dog("Nighteye", new Date(), 05);
        DogHouse.add(dog);
        // When
        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest(){
        // Given
        Dog dog = new Dog("Endeavor", new Date(), 06);
        DogHouse.add(dog);
        DogHouse.add(dog);
        DogHouse.add(dog);
        DogHouse.add(dog);
        DogHouse.add(dog);
        DogHouse.add(dog);
        // When
        Integer expected = 0;
        DogHouse.clear();
        Integer actual = DogHouse.getNumberOfDogs();
        // Then
        Assert.assertEquals(expected, actual);
        

    }




}
