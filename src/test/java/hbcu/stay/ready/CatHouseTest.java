package hbcu.stay.ready;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_storage.CatHouse;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Date;

public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
    CatHouse catHouse;
    String givenName;
    Date givenBirthDate;
    Integer id;
    Cat cat;
    @Before
    public void newCat(){
        givenName = "Molly";
        givenBirthDate = new Date();
        id = 0;
        catHouse = new CatHouse();
        cat = new Cat(givenName, givenBirthDate, id);

    }
    @Test
    public void addTest(){
        //Given
        //When
        CatHouse.add(cat);
        Cat actualCat = CatHouse.getCatById(id);
        //Then
        Assert.assertEquals(cat, actualCat);
    }
    @Test
    public void removeCatTest(){
        //Given
        Cat expectedCat = null;
        //When
        CatHouse.add(cat);
        CatHouse.remove(cat);
        Cat actualCat = CatHouse.getCatById(id);
        //Then
        Assert.assertEquals(expectedCat, actualCat);
    }
    @Test
    public void removeCatIdTest(){
        //Given
        Cat expectedCat = null;
        //When
        CatHouse.add(cat);
        CatHouse.remove(id);
        Cat actualCat = CatHouse.getCatById(id);
        //Then
        Assert.assertEquals(expectedCat, actualCat);
    }
    @Test
    public void getCatByIdTest(){
        //Given
        //When
        CatHouse.add(cat);
        Cat actualCat = CatHouse.getCatById(id);
        //Then
        Assert.assertEquals(cat, actualCat);
    }
    @Test
    public void getNumOfCatsTest(){
        //Given
        int expectedCatNum = 2;
        String name = "Mill";
        Date birth = new Date();
        Integer ident = 1;
        //When
        Cat newCat = new Cat(name, birth, ident);
        CatHouse.add(cat);
        CatHouse.add(newCat);
        int actualCatNum = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expectedCatNum, actualCatNum);
    }
}
