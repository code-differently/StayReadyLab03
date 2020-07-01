package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_storage.CatHouse;

public class CatHouseTest {

    Cat cat;
    @Before
    public void initiliaze() {
        this.cat = new Cat(null, null, 12);
        CatHouse.clear();
    }

    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addTest() {
        // Given
        Cat expectedCat;

        // When
        CatHouse.add(cat);
        expectedCat = CatHouse.getCatById(12);

        // Then
        Assert.assertEquals(expectedCat, cat);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIdTest() {
        // Given
        Cat expectedCat = null;

        // When
        CatHouse.add(cat);
        CatHouse.remove(12);

        Cat actualCat = CatHouse.getCatById(12);

        // Then
        Assert.assertEquals(expectedCat, actualCat);
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatTest() {
        // Given
        Cat expectedCat = null;

        // When
        CatHouse.add(cat);
        CatHouse.remove(cat);

        Cat actualCat = CatHouse.getCatById(12);

        // Then
        Assert.assertEquals(expectedCat, actualCat);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest() {
        // Given
        Cat expectedCat = cat;

        // When
        CatHouse.add(expectedCat);
        Cat actualCat = CatHouse.getCatById(12);

        // Then
        Assert.assertEquals(expectedCat, actualCat);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest() {
        // Given
        int expectedNumOfCats = 1;

        // When
        CatHouse.add(cat);
        int actualNumOfCats = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expectedNumOfCats, actualNumOfCats);
    }

}
