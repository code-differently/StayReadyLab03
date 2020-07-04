package hbcu.stay.ready;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_storage.CatHouse;

public class CatHouseTest {

   @Test
    public void addTest(){
        Cat cat = new Cat(null, null, 02);

        CatHouse.add(cat);
        Cat actual = CatHouse.getCatById(02);
        Cat expected = cat;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest1(){
        Cat cat = new Cat(null, null, 01);

        CatHouse.add(cat);
        CatHouse.remove(cat);
        Cat actual = CatHouse.getCatById(01);
        Cat expected = null;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest2(){
        Cat cat = new Cat("Bella", null, 03);

        CatHouse.add(cat);
        CatHouse.remove(03);
        Cat actual = CatHouse.getCatById(03);
        Cat expected = null;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatByIdTest(){
        Cat cat = new Cat("Bella", null, 04);

        CatHouse.add(cat);
        Cat actual = CatHouse.getCatById(04);
        Cat expected = cat;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfCatsTest(){
        Cat cat1 = new Cat("Bella", null, 04);
        Cat cat2 = new Cat("Bud", null, 04);
        Cat cat3 = new Cat("Bell", null, 04);

        CatHouse.add(cat1);
        CatHouse.add(cat2);
        CatHouse.add(cat3);

        Integer actual = CatHouse.getNumberOfCats();
        Integer expected = 3;

        Assert.assertEquals(expected, actual);
    }

    @After
    public void clearTest(){
        CatHouse.clear();
    }
}

