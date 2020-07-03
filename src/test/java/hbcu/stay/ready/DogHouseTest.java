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
    public void addDogTest(){
        // Given
        String name="Joe";
        Date date= new Date();
        Dog dog = new Dog(name, date, 1);
        DogHouse.clear();

        // When
        DogHouse.add(dog);
        Dog actualDog=DogHouse.getDogById(1);

        // Then 
        Assert.assertEquals(dog,actualDog);

    }

    @Test
    public void removeDogIDTest(){
        // Given
        String name="Joe";
        Date date= new Date();
        Dog dog = new Dog(name, date,5);
        DogHouse.clear();

        // When
        DogHouse.add(dog);
        DogHouse.remove(5);
        Dog actualDog=DogHouse.getDogById(5);

        // Then 
        Assert.assertEquals(null,actualDog);

    }

    @Test
    public void removeDogTest(){
        // Given
        String name="Joe";
        Date date= new Date();
        Dog dog = new Dog(name, date,5);
        DogHouse.clear();

        // When
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Dog actualDog=DogHouse.getDogById(5);

        // Then 
        Assert.assertEquals(null,actualDog);

    }
    

    @Test
    public void getDogByIDTest(){
        // Given
        String name="Joe";
        Date date= new Date();
        Dog dog = new Dog(name, date,5);
        DogHouse.clear();

        // When
        DogHouse.add(dog);
        Dog actualDog=DogHouse.getDogById(5);

        // Then 
        Assert.assertEquals(dog,actualDog);

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
        int actual=DogHouse.getNumberOfDogs();
        Assert.assertEquals(1, actual);

    }
}
