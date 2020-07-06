package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.animal_storage.CatHouse;
import hbcu.stay.ready.animals.Cat;

import java.util.Date;


public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test

    public void CatAddTest(){
        // Given 
        Cat cat = new Cat("Beerus", new Date(), 01);
        CatHouse.add(cat);
        CatHouse.add(cat);
        CatHouse.add(cat);
        // When
        Integer expected = 3;
        Integer actual = CatHouse.getNumberOfCats();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CatRemoveTest(){
    // Given
    Cat cat = new Cat("Whis", new Date(), 02);
    CatHouse.add(cat);
    CatHouse.add(cat);
    CatHouse.add(cat);
    CatHouse.add(cat);
    CatHouse.add(cat);
    // When
    CatHouse.remove(cat);
    CatHouse.remove(cat);
    Integer expected = 3;
    Integer actual = CatHouse.getNumberOfCats();
    // Then
    Assert.assertEquals(expected, actual);
    }

    @Test

    public void CatRemoveByIdTest(){
        // Given
        Cat cat = new Cat("Vegeta", new Date(), 03);
        CatHouse.add(cat);
        // When
        CatHouse.remove(03);
        Integer expected = 0;
        Integer actual = CatHouse.getNumberOfCats();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfCatsTest(){
        // Given 
        Cat cat = new Cat("Goku", new Date(), 05);
        CatHouse.add(cat);
        // When
        Integer expected = 1;
        Integer actual = CatHouse.getNumberOfCats();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearCats(){
        // Given
        Cat cat = new Cat("Gohan", new Date(), 06);
        CatHouse.add(cat);
        // When
        Integer expected = 0;
        CatHouse.clear();
        Integer actual = CatHouse.getNumberOfCats();
        // Then
        Assert.assertEquals(expected, actual);
    }

}
