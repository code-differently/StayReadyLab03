package hbcu.stay.ready;

import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_storage.DogHouse;

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
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`
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
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        
    }
}