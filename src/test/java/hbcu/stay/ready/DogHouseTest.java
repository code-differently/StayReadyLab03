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
    public void addTest()
    {
        // Given
        Dog dog = new Dog("Kiba", new Date(), 01);

        DogHouse.add(dog);

        // When 

        Integer expected = 1; 

        Integer actual = DogHouse.getNumberOfDogs();

        // Then 

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void removeTest()
    {
        //Given 
        Dog dog = new Dog("Tyler", new Date(), 02);

        DogHouse.add(dog);

        DogHouse.add(dog);

        // when 
        DogHouse.remove(dog);

        Integer expected = 1; 

        Integer actual = DogHouse.getNumberOfDogs();

        // Then 

        Assert.assertEquals(expected, actual);
    }

    @Test 
    public void removeIdTest()
    {
        // given
        Dog dog = new Dog("Ant", new Date(), 03);

        DogHouse.add(dog);

        // When 

        DogHouse.remove(03);

        Integer expected = 0;

        Integer actual = DogHouse.getNumberOfDogs();

        // Then

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getDogByIdTest()
    {
        //Given
        Dog dog = new Dog("Gabe", new Date(), 04);

        DogHouse.add(dog);

        //When 
        Dog expected = dog;

        Dog actual = DogHouse.getDogById(04);

        // then 

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfDogsTest()
    {
        //given
        Dog dog = new Dog("Emmy", new Date(), 05);

        DogHouse.add(dog);

        // When 
        Integer expected = 1;

        Integer actual = DogHouse.getNumberOfDogs();

        // Then

        Assert.assertEquals(expected, actual);
    }

}
