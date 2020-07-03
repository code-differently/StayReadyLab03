package hbcu.stay.ready;

import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

import org.junit.Before;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_storage.DogHouse;
import org.junit.Assert;

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
    Integer id;
    Dog dog;
    @Before
    public void newDog(){
        dogHouse = new DogHouse();
        givenName = "Bill";
        givenBirthDate = new Date();
        id = 0;
        dog = new Dog(givenName, givenBirthDate, id);
    }
    @Test
    public void addDogTest(){
        //Given
        //When
        DogHouse.add(dog);
        Dog actualDog = DogHouse.getDogById(id);
        //Then
        Assert.assertEquals(dog, actualDog);
    }
    @Test
    public void removeDogIdTest(){
        //Given
        Dog expectedDog = null;
        //When
        DogHouse.add(dog);
        DogHouse.remove(id);
        Dog actualDog = DogHouse.getDogById(id);
        //Then
        Assert.assertEquals(expectedDog, actualDog);
    }
    @Test
    public void removeDogTest(){
        //Given
        Dog expectedDog = null;
        //When
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Dog actualDog = DogHouse.getDogById(id);
        //Then
        Assert.assertEquals(expectedDog, actualDog);
    }
    @Test
    public void getDogByIdTest(){
        //Given
        //When
        DogHouse.add(dog);
        Dog actualDog = DogHouse.getDogById(id);
        //Then
        Assert.assertEquals(dog, actualDog);
    }
    @Test
    public void getNumberOfDogsTest() {
        //Given
        int expectedDogNum = 2;
        String name = "Mill";
        Date birth = new Date();
        Integer ident = 1;
         //When
        Dog newDog = new Dog(name, birth, ident);
        DogHouse.add(dog);
        DogHouse.add(newDog);
        int actualDogNum = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(expectedDogNum, actualDogNum);
    }
}
