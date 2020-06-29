package hbcu.stay.ready;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

import hbcu.stay.ready.animals.Cat;

import hbcu.stay.ready.animals.animal_storage.CatHouse;
import java.util.Date;

public class CatHouseTest {
    //using only one cat
    String name;
    Date date;
    int id;
    Cat cat;
    @Before
    public void initialize() {
        name = "Zuko";
        date = new Date();
        id = 0;
        cat = new Cat(name, date, id);
    }

    @Test
    public void addTest() {  

        // when
        CatHouse.add(cat);
        Cat actualCat = CatHouse.getCatById(0);
        String actualName = actualCat.getName();
        Date actualDate = actualCat.getBirthDate();
        int actualId = actualCat.getId();

        // then 
        Assert.assertEquals("testing name", name, actualName);
        Assert.assertEquals("testing date", date, actualDate);
        Assert.assertEquals("testing id", id, actualId); 

        //makes it so that the cathouse is empty for the other tests
        CatHouse.remove(cat);
    }

    @Test
    public void removeWithIdTest() {
        CatHouse.add(cat);
        //testing method overriding with id of cat
        CatHouse.remove(0);

        //the id of the cat is 0, so it shouldn't have anything there
        Assert.assertNull("asserting that cat is not in the cat house anymore", CatHouse.getCatById(0));
    }

    @Test
    public void removeWithCatTest() {

        CatHouse.add(cat);
        //testing method overriding with cat object
        CatHouse.remove(cat);

        //the id of the cat is 0, so it shouldn't have anything there
        Assert.assertNull("asserting that cat is not in the cat house anymore", CatHouse.getCatById(0));
    }
    
    @Test
    public void getCatByIdTest() {
        CatHouse.add(cat);
        Cat actualCat = CatHouse.getCatById(0);
        String actualName = actualCat.getName();
        Date actualDate = actualCat.getBirthDate();
        int actualId = actualCat.getId();

        // then 
        Assert.assertEquals("testing name", name, actualName);
        Assert.assertEquals("testing date", date, actualDate);
        Assert.assertEquals("testing id", id, actualId); 

        //makes it so that the cathouse is empty for the other tests
        CatHouse.remove(cat);
    }

    @Test
    public void getNumberOfCatsTest() {
        int expectedNumCatsBefore = 0;
        int expectedNumCats = 1;
        
        int actualNumCatsBefore = CatHouse.getNumberOfCats();
        CatHouse.add(cat);
        int actaulNumCats = CatHouse.getNumberOfCats();

        // then 
        Assert.assertEquals("testing number of cats function with 0 cats", expectedNumCatsBefore, actualNumCatsBefore);
        Assert.assertEquals("testing number of cats function with 1 cat", expectedNumCats, actaulNumCats);

        //makes it so that the cathouse is empty for the other tests
        CatHouse.remove(cat);
    }
}
