package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_storage.DogHouse;

public class DogHouseTest {

    Dog dog;
    int id;

    @Before
    public void setup() {
        this.dog = new Dog("Cyrus", new Date(), 0);
        this.id = 0;
    }

    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addTest() {
        // given
        int dogExpected = 1;
        // when
        DogHouse.add(dog);
        int dogActual = 1;
        // then
        Assert.assertEquals("add dog", dogExpected, dogActual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIntIdTest() {
        // Given
        DogHouse.add(dog);
        int idExpected = 1;
        // When
        DogHouse.remove(id);
        int idActual = 1;
        // Then
        Assert.assertEquals("dog removed by id", idExpected, idActual);
    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogTest() {
        // Given
        DogHouse.add(dog);
        int dogExpected = 1;
        // When
        DogHouse.remove(dog);
        int dogActual = 1;
        // Then
        Assert.assertEquals("dog removed", dogExpected, dogActual);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getDogByIdTest() {
        // Given
        int expected = 1;
        // When
        dog.getId();
        int actual = dog.getId();
        // Then
        Assert.assertEquals("get dog by ID", expected, actual);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfDogsTest() {
        // Given
        int expected = 1;
        // When
        DogHouse.add(dog);
        int actual = DogHouse.getNumberOfDogs();
        // Then
        Assert.assertEquals("get number of dogs", expected, actual);
    }
}