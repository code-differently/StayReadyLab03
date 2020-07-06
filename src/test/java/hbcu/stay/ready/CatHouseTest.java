package hbcu.stay.ready;

import java.util.Date;

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

    String name, expected;
    Date date;
    int id;
    Cat cat;


    @Before
    public void setup(){
        name = "Jewel";
        date = new Date();
        id = 1;
        cat = new Cat(name, date, id);
        expected = cat.toString();
    }

    @Test
    public void addCatTest(){
        
        CatHouse.add(cat);
        Cat actualCat = CatHouse.getCatById(id);
        String actual = actualCat.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeIdTest(){

        CatHouse.add(cat);
        int expected = 0;

        CatHouse.remove(id);
        int actual = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatTest(){

        CatHouse.add(cat);
        int expected = 0;

        CatHouse.remove(cat);
        int actual = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatByIdTest(){

        CatHouse.add(cat);
        Cat expected = CatHouse.getCatById(id);
        Cat actual = CatHouse.getCatById(id);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfCats(){
        CatHouse.add(cat);
        int expected = CatHouse.getNumberOfCats();
        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }
}

