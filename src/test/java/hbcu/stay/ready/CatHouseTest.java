package hbcu.stay.ready;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_storage.CatHouse;

public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addTest(){
        Integer expected = 1;
        Cat cat = new Cat("Bertha", new Date(), 0);
        CatHouse.add(cat);
        Assert.assertEquals(expected, CatHouse.getNumberOfCats());
    }

    @Test
    public void removeTest(){
        Integer expected = 0;
        Cat cat = new Cat("Bertha", new Date(), 0);
        CatHouse.add(cat);
        CatHouse.remove(0);
        Assert.assertEquals(expected, CatHouse.getNumberOfCats());
    }
    @Test
    public void remove2Test(){
        Integer expected = 0;
        Cat cat = new Cat("Bertha", new Date(), 0);
        CatHouse.add(cat);
        CatHouse.remove(cat);
        Assert.assertEquals(expected, CatHouse.getNumberOfCats());
    }

    @Test
    public void getCatByIdTest(){
        Cat cat = new Cat("Bertha", new Date(), 0);
        CatHouse.add(cat);
        Assert.assertEquals(cat, CatHouse.getCatById(0));
    }

    @Test
    public void getNumberOfCats(){
        Integer expected = 1;
        Cat cat = new Cat("Bertha", new Date(), 0);
        CatHouse.add(cat);
        Assert.assertEquals(expected, CatHouse.getNumberOfCats());
    }
}
