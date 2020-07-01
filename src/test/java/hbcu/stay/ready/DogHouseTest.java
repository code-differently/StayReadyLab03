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
        Integer expected = 1;
        Dog dog = new Dog("Bertha", new Date(), 0);
        DogHouse.add(dog);
        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }

    @Test
    public void removeTest(){
        Integer expected = 0;
        Dog dog = new Dog("Bertha", new Date(), 0);
        DogHouse.add(dog);
        DogHouse.remove(0);
        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }
    @Test
    public void remove2Test(){
        Integer expected = 0;
        Dog dog = new Dog("Bertha", new Date(), 0);
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }

    @Test
    public void getDogByIdTest(){
        Dog dog = new Dog("Bertha", new Date(), 0);
        DogHouse.add(dog);
        Assert.assertEquals(dog, DogHouse.getDogById(0));
    }

    @Test
    public void getNumberOfDogs(){
        Integer expected = 1;
        Dog dog = new Dog("Bertha", new Date(), 0);
        DogHouse.add(dog);
        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }
}
