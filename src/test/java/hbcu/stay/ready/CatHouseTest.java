package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_storage.CatHouse;

public class CatHouseTest {
    
    @Test
    public void addTest() {
        // Given
        Cat c = new Cat(null, null, null);
        CatHouse.clear();

        // When
        CatHouse.add(c);
        int expected = 1;
        int actual = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByCatTest() {
        // Given
        Cat c1 = new Cat(null, null, null);
        Cat c2 = new Cat(null, null, null);
        Cat c3 = new Cat(null, null, null);
        CatHouse.clear();

        // When
        CatHouse.add(c1);
        CatHouse.add(c2);
        CatHouse.add(c3);
        CatHouse.remove(c1);
        int expected = 2;
        int actual = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByIdTest() {
        // Given
        Cat c1 = new Cat(null, null, 10);
        Cat c2 = new Cat(null, null, 20);
        Cat c3 = new Cat(null, null, 30);
        CatHouse.clear();

        // When
        CatHouse.add(c1);
        CatHouse.add(c2);
        CatHouse.add(c3);
        CatHouse.remove(10);
        int expected = 2;
        int actual = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatByIdTest() {
        // Given
        Cat c1 = new Cat(null, null, 10);
        Cat c2 = new Cat(null, null, 20);
        Cat c3 = new Cat(null, null, 30);
        CatHouse.clear();

        // When
        CatHouse.add(c1);
        CatHouse.add(c2);
        CatHouse.add(c3);
        Cat expected = c2;
        Cat actual = CatHouse.getCatById(20);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfCatsTest() {
        // Given
        Cat c1 = new Cat(null, null, null);
        Cat c2 = new Cat(null, null, null);
        Cat c3 = new Cat(null, null, null);
        CatHouse.clear();

        // When
        CatHouse.add(c1);
        CatHouse.add(c2);
        CatHouse.add(c3);
        int expected = 3;
        int actual = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest() {
        // Given
        Cat c1 = new Cat(null, null, null);
        Cat c2 = new Cat(null, null, null);
        Cat c3 = new Cat(null, null, null);
        CatHouse.clear();

        // When
        CatHouse.add(c1);
        CatHouse.add(c2);
        CatHouse.add(c3);
        CatHouse.clear();
        int expected = 0;
        int actual = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
