package hbcu.stay.ready;

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
    public void addTest()
    {
        // Given
        Cat cat = new Cat("Kim", new Date(), 01);

        CatHouse.add(cat);

        // When 

        Integer expected = 1; 

        Integer actual = CatHouse.getNumberOfCats();

        // Then 

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void removeTest()
    {
        //Given 
        Cat cat = new Cat("Barry", new Date(), 02);

        CatHouse.add(cat);

        CatHouse.add(cat);

        // when 
        CatHouse.remove(cat);

        Integer expected = 1; 

        Integer actual = CatHouse.getNumberOfCats();

        // Then 

        Assert.assertEquals(expected, actual);
    }

    @Test 
    public void removeIdTest()
    {
        // given
        Cat cat = new Cat("Zach", new Date(), 03);

        CatHouse.add(cat);

        // When 

        CatHouse.remove(03);

        Integer expected = 0;

        Integer actual = CatHouse.getNumberOfCats();

        // Then

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getDogByIdTest()
    {
        //Given
        Cat cat = new Cat("Kobe", new Date(), 04);

        CatHouse.add(cat);

        //When 
        Cat expected = cat;

        Cat actual = CatHouse.getCatById(04);

        // then 

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfDogsTest()
    {
        //given
        Cat cat = new Cat("Russell", new Date(), 05);

        CatHouse.add(cat);

        // When 
        Integer expected = 1;

        Integer actual = CatHouse.getNumberOfCats();

        // Then

        Assert.assertEquals(expected, actual);
    }


}
