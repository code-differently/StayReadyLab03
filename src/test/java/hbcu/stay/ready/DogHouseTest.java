package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_storage.DogHouse;

public class DogHouseTest {
    
    @Test
    public void addTest() {
        // Given
        Dog d = new Dog(null, null, null);
        DogHouse.clear();

        // When
        DogHouse.add(d);
        int expected = 1;
        int actual = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByDogTest() {
        // Given
        Dog d1 = new Dog(null, null, null);
        Dog d2 = new Dog(null, null, null);
        Dog d3 = new Dog(null, null, null);
        DogHouse.clear();

        // When
        DogHouse.add(d1);
        DogHouse.add(d2);
        DogHouse.add(d3);
        DogHouse.remove(d1);
        int expected = 2;
        int actual = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByIdTest() {
        // Given
        Dog d1 = new Dog(null, null, 10);
        Dog d2 = new Dog(null, null, 20);
        Dog d3 = new Dog(null, null, 30);
        DogHouse.clear();

        // When
        DogHouse.add(d1);
        DogHouse.add(d2);
        DogHouse.add(d3);
        DogHouse.remove(10);
        int expected = 2;
        int actual = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogByIdTest() {
        // Given
        Dog d1 = new Dog(null, null, 10);
        Dog d2 = new Dog(null, null, 20);
        Dog d3 = new Dog(null, null, 30);
        DogHouse.clear();

        // When
        DogHouse.add(d1);
        DogHouse.add(d2);
        DogHouse.add(d3);
        Dog expected = d2;
        Dog actual = DogHouse.getDogById(20);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfDogsTest() {
        // Given
        Dog d1 = new Dog(null, null, null);
        Dog d2 = new Dog(null, null, null);
        Dog d3 = new Dog(null, null, null);
        DogHouse.clear();

        // When
        DogHouse.add(d1);
        DogHouse.add(d2);
        DogHouse.add(d3);
        int expected = 3;
        int actual = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest() {
        // Given
        Dog d1 = new Dog(null, null, null);
        Dog d2 = new Dog(null, null, null);
        Dog d3 = new Dog(null, null, null);
        DogHouse.clear();

        // When
        DogHouse.add(d1);
        DogHouse.add(d2);
        DogHouse.add(d3);
        DogHouse.clear();
        int expected = 0;
        int actual = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
