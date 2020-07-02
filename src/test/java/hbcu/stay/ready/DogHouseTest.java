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
    public void getDogByIdTest(){
        // Given 
        String name = "Milo";
        Date birthDate = new Date();
        int givenId = 1;
        Dog dog = new Dog(name, birthDate, givenId);
        DogHouse testdogHouse = new DogHouse();
       

        // When
        testdogHouse.add(dog);
        Dog actualDog = testdogHouse.getDogById(givenId);


        
        // Then
        Assert.assertEquals(dog, actualDog);


    }

    @Test 
    public void removeTest(){
        // Given 
        String name = "Milo";
        Date birthDate = new Date();
        int givenId = 1;
        Dog dog = new Dog(name, birthDate, givenId);
        DogHouse testdogHouse = new DogHouse();
        testdogHouse.add(dog);
        int expectedVal = 0;

        // When
        testdogHouse.remove(dog);
        int actualval = testdogHouse.getNumberOfDogs();
        
        // Then
        Assert.assertEquals(expectedVal, actualval);


    }
    @Test 
    public void addTest(){
        // Given 
        String name = "Milo";
        Date birthDate = new Date();
        int givenId = 1;
        Dog dog = new Dog(name, birthDate, givenId);
        DogHouse testdogHouse = new DogHouse();
        int expectedVal = 1;

        // When
        testdogHouse.add(dog);
        int actualVal = testdogHouse.getNumberOfDogs();


        
        // Then
        Assert.assertEquals(expectedVal, actualVal);


    }



   
    
}
