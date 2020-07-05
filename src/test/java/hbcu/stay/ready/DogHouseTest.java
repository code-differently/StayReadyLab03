package hbcu.stay.ready;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
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

    DogHouse dogHouse;
    String givenName;
    Date givenBirthDate;
    Integer givenId;
    Dog dog;
    @Before

    public void setUp(){
        givenName = "Cashew";
        givenBirthDate = new Date();
        givenId = 3;
        dog = new Dog(givenName, givenBirthDate, givenId);
    }

    @Test
    public void addDogTest(){
        //Given 

        //When
        DogHouse.add(dog);
        Dog actualDog = DogHouse.getDogById(givenId);

        //Then
        Assert.assertEquals(dog, actualDog);
    }

    @Test
    public void removeDogByIdTest(){
        //Given 

        //When
        DogHouse.add(dog);
        DogHouse.remove(givenId);
        Dog actualDog = DogHouse.getDogById(givenId);
        
        //Then
        Assert.assertNull("Checking if dog with the id of 3 has been removed.", actualDog);
    }

    @Test
    public void removeDogTest(){
        //Given

        //When
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Dog actualDog = DogHouse.getDogById(givenId);

        //Then
        Assert.assertNull("Checking if dog was removed", actualDog);
    }

    @Test
    public void getDogByIdTest(){
         //Given 
         
         //When
         DogHouse.add(dog);
         Dog actualDog = DogHouse.getDogById(givenId);

         //Then
         Assert.assertEquals(dog, actualDog);
    }

    @Test
    public void getNumberOfDogsTest() {
        //Given 
        int expectedDogAmount = 3;

        //When
        DogHouse.add(dog);
        DogHouse.add(dog);
        DogHouse.add(dog);
        int actualDogAmount = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expectedDogAmount, actualDogAmount);
    }

    @After
    public void tearDown() {
        DogHouse.clear();
    }
}
