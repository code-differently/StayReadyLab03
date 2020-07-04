package hbcu.stay.ready;



import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_storage.DogHouse;

import java.util.Date;


public class DogHouseTest {
    // Create tests for `void add(Dog dog)`
    // Create tests for `void remove(Integer id)`
    // Create tests for `void remove(Dog dog)`
    // Create tests for `Dog getDogById(Integer id)`
    // Create tests for `Integer getNumberOfDogs()`
    
    //Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest(){
         // Given
         Dog dog = new Dog("Poach", new Date(), 87);
         //When
         DogHouse.add(dog);
         Integer expected = 2;
         Integer actual = DogHouse.getNumberOfDogs();
         //Then
         Assert.assertEquals(expected, actual);
    }
    //Create tests for `void remove(Integer id)
    @Test 
    public void removeDogNumberTest(){
         //Given
         Dog dog = new Dog("Wayne", new Date(), 66);
         //When
         DogHouse.add(dog);
         DogHouse.remove(66);
         Integer expected = 1;
         Integer actual = DogHouse.getNumberOfDogs();
         //Then
         Assert.assertEquals(expected, actual);
    }
    //Create tests for `void remove(Dog dog)`
    @Test 
    public void removeDogNameTest(){
        Dog dog = new Dog("Loni", new Date(), 44);
        //When
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(expected, actual);
    }
    //Create tests for `Dog getDogById(Integer id)`
    @Test 
    public void getDogByIdTest2(){
        //Given
        Dog dog = new Dog("Loki", new Date(), 99);
        Dog expected = dog;
        //When 
        DogHouse.add(dog);
        DogHouse.getDogById(99);
        Dog actual = DogHouse.getDogById(99);
        //Then 
        Assert.assertEquals(expected, actual);
    }
    //Create tests for `Integer getNumberOfDogs()`
    @Test
    public void testGetNumberOfDogs() {
        // Given
        Dog dog = new Dog("Harry", new Date(), 33);
        DogHouse.add(dog);
        //When
        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs();
        // Then
        Assert.assertEquals(expected, actual);
    }
  
}
