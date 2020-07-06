package hbcu.stay.ready;

import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_storage.DogHouse;
import org.junit.Assert;
import java.util.Date;


public class DogHouseTest {

    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addTest(){
        Dog dog = new Dog("Anthon", new Date(), 1);

        DogHouse.add(dog);
        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs();
        
        Assert.assertEquals(expected, actual);

    }


    
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeTestId(){

    Dog dog = new Dog("Gogo", new Date(), 1);
    DogHouse.add(dog);

    DogHouse.remove(1);
    Integer expected = 0;
    Integer actual = DogHouse.getNumberOfDogs();

    Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeTest(){
        Dog dog = new Dog("Wow", new Date(), 1);
        DogHouse.add(dog);

        DogHouse.remove(1);
        Integer expected = 0;
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }
    

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogById(){
        Dog dog = new Dog("Jeffrina", new Date(), 1);
        DogHouse.add(dog);

        Dog actual = DogHouse.getDogById(1);
        Dog expected = dog; 

        Assert.assertEquals(expected, actual);
    }
    

    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test 
    public void getNumOfDogsTest(){
        Dog dog = new Dog("Georgina", new Date(), 1);
        DogHouse.add(dog);
        
        Dog actual = DogHouse.getDogById(01);
        Dog expected = dog; 

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogByIsle(){
        Dog dog = new Dog("Speaker", new Date(), 2);
        DogHouse.add(dog);

        Dog actual = DogHouse.getDogById(2);
        Dog expected = dog; 
        
        Assert.assertEquals(expected, actual);

    }


    @Test
    public void getNumofDogsTest(){

        Dog dog = new Dog("George", new Date(), 1);
        DogHouse.add(dog);

        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs(); 
        
        Assert.assertEquals(expected, actual);
        
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
