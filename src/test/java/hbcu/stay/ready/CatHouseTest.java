package hbcu.stay.ready;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_storage.CatHouse;

public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addTest(){
        // Given
        CatHouse catHouse = new CatHouse();
        Cat tom = new Cat("tom", new Date(), 1);

        // When
        catHouse.add(tom);
        Integer expected = 1;
        Integer actual = catHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeByIdTest(){
        // Given
        CatHouse catHouse = new CatHouse();
        Cat tom = new Cat("tom", new Date(), 1);

        // When
        catHouse.add(tom);
        catHouse.remove(1);
        Integer expected = 0;
        Integer actual = catHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeByCatTest(){
        // Given
        CatHouse catHouse = new CatHouse();
        Cat tom = new Cat("tom", new Date(), 1);

        // When
        catHouse.add(tom);
        catHouse.remove(tom);
        Integer expected = 0;
        Integer actual = catHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest(){
        // Given
        CatHouse catHouse = new CatHouse();
        Cat tom = new Cat("tom", new Date(), 1);

        // When
        catHouse.add(tom);
        Cat expected = tom;
        Cat actual = catHouse.getCatById(1);

        // Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest(){
        // Given
        CatHouse catHouse = new CatHouse();
        Cat tom = new Cat("tom", new Date(), 1);

        // When
        catHouse.add(tom);
        Integer expected = 1;
        Integer actual = catHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
