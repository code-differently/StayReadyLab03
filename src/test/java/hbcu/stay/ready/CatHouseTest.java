package hbcu.stay.ready;

import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_storage.CatHouse;

public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    CatHouse catHouse;
    String givenName;
    Date givenBirthDate;
    Integer givenId;
    Cat cat;
    @Before

    public void setUp(){
        givenName = "Banana";
        givenBirthDate = new Date();
        givenId = 3;
        cat = new Cat(givenName, givenBirthDate, givenId);
    }

    @Test
    public void addCatTest(){
        //Given 

        //When
        CatHouse.add(cat);
        Cat actualCat = CatHouse.getCatById(givenId);

        //Then
        Assert.assertEquals(cat, actualCat);
    }

    @Test
    public void removeCatByIdTest(){
        //Given

        //When
        CatHouse.add(cat);
        CatHouse.remove(givenId);
        Cat actualCat = CatHouse.getCatById(givenId);

        //Then
        Assert.assertNull("Checking if cat with the id of 3 has been removed.", actualCat);
    }

    @Test
    public void removeCatTest(){
        //Given

        //When 
        CatHouse.add(cat);
        CatHouse.remove(cat);
        Cat actualCat = CatHouse.getCatById(givenId);

        //Then
        Assert.assertNull("Checking if cat was removed.", actualCat);
    }

    @Test
    public void getCatByIdTest(){
        //Given 

        //When
        CatHouse.add(cat);
        Cat actualCat = CatHouse.getCatById(givenId);

        //Then
        Assert.assertEquals(cat, actualCat);
    }

    @Test
    public void getNumberOfCatsTest(){
        //Given 
        int expectedCatAmount = 3;

        //When
        CatHouse.add(cat);
        CatHouse.add(cat);
        CatHouse.add(cat);
        int actualCatAmount = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expectedCatAmount, actualCatAmount);
    }

    @After
    public void tearDown() {
        CatHouse.clear();
    }
}
