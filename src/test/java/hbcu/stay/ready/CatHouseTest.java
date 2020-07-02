package hbcu.stay.ready;

import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_storage.CatHouse;

import java.util.Date;

public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`



    @Test
    public void testGetNumberOfCats() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        CatHouse.getNumberOfCats();
    }

    @Test 
    public void getCatByIdTest(){
        // Given 
        String name = "Milo";
        Date birthDate = new Date();
        int givenId = 1;
        Cat cat = new Cat(name, birthDate, givenId);
        CatHouse testCatHouse = new CatHouse();
       

        // When
        testCatHouse.add(cat);
        Cat actualCat = testCatHouse.getCatById(givenId);


        
        // Then
        Assert.assertEquals(cat, actualCat);


    }

    @Test 
    public void removeTest(){
        // Given 
        String name = "Milo";
        Date birthDate = new Date();
        int givenId = 1;
        Cat cat = new Cat(name, birthDate, givenId);
        CatHouse testCatHouse = new CatHouse();
        testCatHouse.add(cat);
        int expectedVal = 0;

        // When
        testCatHouse.remove(cat);
        int actualval = testCatHouse.getNumberOfCats();
        
        // Then
        Assert.assertEquals(expectedVal, actualval);


    }
    @Test 
    public void addTest(){
        // Given 
        String name = "Milo";
        Date birthDate = new Date();
        int givenId = 1;
        Cat cat = new Cat(name, birthDate, givenId);
        CatHouse testdogHouse = new CatHouse();
        int expectedVal = 1;

        // When
        testdogHouse.add(cat);
        int actualVal = testdogHouse.getNumberOfCats();


        
        // Then
        Assert.assertEquals(expectedVal, actualVal);


    }
}

