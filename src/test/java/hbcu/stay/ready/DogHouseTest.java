package hbcu.stay.ready;

import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_storage.DogHouse;

import java.util.Date;


public class DogHouseTest {
      Date date = new Date(); 
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
        int expected = 1; 
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test 
    public void addTest(){
        Dog dog = new Dog("Boss Dog", date, 12); 
        //DogHouse house = new DogHouse(); don't need this because the methods are static
        Dog expected = dog; 
        DogHouse.clear(); 

        DogHouse.add(dog); 
        Dog actual = DogHouse.getDogById(12); 

        Assert.assertEquals(expected, actual);
    }


    @Test 
    public void removeTest(){
        Dog dog = new Dog("Boss Dog", date, 12); 
        Dog expected = null; 
        DogHouse.clear();

        DogHouse.add(dog); 
        DogHouse.remove(dog);

        Dog actual = DogHouse.getDogById(12); 

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByIdTest(){
        Dog dog = new Dog("Boss Dog", date, 12); 
        Dog expected = null; 
        DogHouse.clear();

        DogHouse.add(dog); 
        DogHouse.remove(12);

        Dog actual = DogHouse.getDogById(12); 

        Assert.assertEquals(expected, actual);    
    }

    @Test
    public void getByIdTest(){
        Dog dog = new Dog("Boss Dog", date, 12); 
        Dog expected = dog; 
        DogHouse.clear();

        DogHouse.add(dog); 

        Dog actual = DogHouse.getDogById(12); 

        Assert.assertEquals(expected, actual);   
    }
}
