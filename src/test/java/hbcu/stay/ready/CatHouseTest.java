package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_storage.CatHouse;

import java.util.Date;

public class CatHouseTest {
    Date givenBirthDate = new Date();

    @Test
    public void addTest() {
        // Given
        Cat catT = new Cat("TestCat", givenBirthDate, 0);

        // When
        CatHouse.add(catT);
        Cat expectedValue = catT;
        Cat actualValue = CatHouse.getCatById(0);
        CatHouse.clear();

        // Then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void removeTest() {
        // Given
        Cat catT = new Cat("TestCat", givenBirthDate, 0);

        // When
        CatHouse.add(catT);
        CatHouse.remove(catT);
        Cat expectedValue = null;
        Cat actualValue = CatHouse.getCatById(0);

        // Then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void removeIdTest() {
        // Given
        Cat catT = new Cat("TestCat", givenBirthDate, 0);

        // When
        CatHouse.add(catT);
        CatHouse.remove(0);
        Cat expectedValue = null;
        Cat actualValue = CatHouse.getCatById(0);

        // Then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getCatByIdTest() {
        // Given
        Cat catT = new Cat("TestCat", givenBirthDate, 0);

        // When
        CatHouse.add(catT);
        Cat expectedValue = catT;
        Cat actualValue = CatHouse.getCatById(0);

        // Then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getNumberOfCats() {
        // Given
        Cat catT = new Cat("TestCat", givenBirthDate, 0);
        Cat catT2 = new Cat("TestCat", givenBirthDate, 1);
        Cat catT3 = new Cat("TestCat", givenBirthDate, 2);

        // When
        CatHouse.add(catT);
        CatHouse.add(catT2);
        CatHouse.add(catT3);
        int expectedValue = 3;
        int actualValue = CatHouse.getNumberOfCats();
        CatHouse.clear();

        // Then
        Assert.assertEquals(expectedValue, actualValue);
    }
}
