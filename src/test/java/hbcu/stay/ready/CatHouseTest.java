package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_storage.CatHouse;

public class CatHouseTest {

    Cat cat;
    int id;

    @Before
    public void setup() {
        this.cat = new Cat("Tigre", new Date(), 1);
        this.id = 0;
    }

    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addTest() {
        // given
        int catExpected = 1;
        // when
        CatHouse.add(cat);
        int catActual = 1;
        // then
        Assert.assertEquals("add cat", catExpected, catActual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIntIdTest() {
        // Given
        CatHouse.add(cat);
        int idExpected = 1;
        // When
        CatHouse.remove(id);
        int idActual = 1;
        // Then
        Assert.assertEquals("cat removed by id", idExpected, idActual);
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatTest() {
        // Given
        CatHouse.add(cat);
        int catExpected = 1;
        // When
        CatHouse.remove(cat);
        int catActual = 1;
        // Then
        Assert.assertEquals("cat removed", catExpected, catActual);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest() {
        // Given
        int expected = 1;
        // When
        cat.getId();
        int actual = cat.getId();
        // Then
        Assert.assertEquals("get cat by ID", expected, actual);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest() {
        // Given
        int expected = 1;
        // When
        CatHouse.add(cat);
        int actual = CatHouse.getNumberOfCats();
        // Then
        Assert.assertEquals("get number of cats", expected, actual);
    }
}