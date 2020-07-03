package hbcu.stay.ready;

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
    public void addCatTest(){
        // Given
        Cat cat = new Cat(null, null, 14);
        CatHouse.clear();

        // When
        CatHouse.add(cat);
        Cat actualCat=CatHouse.getCatById(14);

        // Then 
        Assert.assertEquals(cat, actualCat);

    }

    @Test
    public void removeCatTest(){
        // Given
        Cat cat = new Cat(null, null, 14);
        CatHouse.clear();

        // When
        CatHouse.add(cat);
        CatHouse.remove(cat);
        Cat actualCat=CatHouse.getCatById(14);

        // Then 
        Assert.assertEquals(null, actualCat);

    }

    @Test
    public void removeCatIDTest(){
        // Given
        Cat cat = new Cat(null, null, 14);
        CatHouse.clear();

        // When
        CatHouse.add(cat);
        CatHouse.remove(14);
        Cat actualCat=CatHouse.getCatById(14);

        // Then 
        Assert.assertEquals(null, actualCat);

    }

    @Test
    public void getCatByIDTest(){
        // Given
        Cat cat = new Cat(null, null, 4);
        CatHouse.clear();

        // When
        CatHouse.add(cat);
        Cat actualCat=CatHouse.getCatById(4);

        // Then 
        Assert.assertEquals(cat, actualCat);

    }

    @Test
    public void getNumCatsTest(){
        // Given
        CatHouse.clear();
        Cat cat1 = new Cat(null, null, null);
        Cat cat2 = new Cat(null, null, null);
        Cat cat3 = new Cat(null, null, null);
        Cat cat4 = new Cat(null, null, null);
        int total=4;

        // When
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        CatHouse.add(cat3);
        CatHouse.add(cat4);
        int actual=CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(total, actual);

    }

    


}
