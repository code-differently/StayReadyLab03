package hbcu.stay.ready;

import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_storage.DogHouse;

import java.util.Date;


public class DogHouseTest {
   
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
        Dog dog = new Dog(null, null, 01);

        DogHouse.add(dog);
        Dog actual = DogHouse.getDogById(01);
        Dog expected = dog;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest1(){
        Dog dog = new Dog(null, null, 02);

        DogHouse.add(dog);
        DogHouse.remove(02);
        Dog actual = DogHouse.getDogById(02);
        Dog expected = null;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest2(){
        Dog dog = new Dog(null, null, 03);

        DogHouse.add(dog);
        DogHouse.remove(dog);
        Dog actual = DogHouse.getDogById(03);
        Dog expected = null;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogByIdTest(){
        Dog dog = new Dog("smoke", null, 05);

        DogHouse.add(dog);
        Dog actual = DogHouse.getDogById(05);
        Dog expected = dog;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfDogsTest(){
        Dog dog1 = new Dog("Smoke", null, 01);
        Dog dog2 = new Dog("Lou", null, 02);
        Dog dog3 = new Dog("Tokyo", null, 03);

        DogHouse.add(dog1);
        DogHouse.add(dog2);
        DogHouse.add(dog3);

        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 3;

        Assert.assertEquals(expected, actual);
    }

    @After
    public void clearTest(){
        DogHouse.clear();
    }
}
