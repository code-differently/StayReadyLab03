package hbcu.stay.ready;

import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

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

    String name, expected;
    Date date;
    int id;
    Dog dog;


    @Before
    public void setup(){
        name = "Jewel";
        date = new Date();
        id = 1;
        dog = new Dog(name, date, id);
        expected = dog.toString();
    }

    @Test
    public void addDogTest(){
        
        DogHouse.add(dog);
        Dog actualCat = DogHouse.getDogById(id);
        String actual = actualCat.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeIdTest(){

        DogHouse.add(dog);
        int expected = 0;

        DogHouse.remove(id);
        int actual = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDogTest(){

        DogHouse.add(dog);
        int expected = 0;

        DogHouse.remove(dog);
        int actual = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogByIdTest(){

        Dog expected = DogHouse.getDogById(id);
        Dog actual = DogHouse.getDogById(id);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfDogs(){
        DogHouse.add(dog);
        int expected = DogHouse.getNumberOfDogs();

        DogHouse.getNumberOfDogs();
        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }
}
