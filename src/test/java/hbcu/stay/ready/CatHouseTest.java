package hbcu.stay.ready;

import org.junit.Test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import hbcu.stay.ready.animals.Cat;

import hbcu.stay.ready.animals.animal_storage.CatHouse;
import java.util.Date;

public class CatHouseTest {
    //using only one cat
    String name, expectedOutput;
    Date date;
    int id;
    Cat cat;

    @Before
    public void initialize() {
        name = "Zuko";
        date = new Date();
        id = 0;
        cat = new Cat(name, date, id);
        expectedOutput = cat.toString();
    }

    @Test
    public void addCatTest() {  

        // when
        CatHouse.add(cat);
        Cat actualCat = CatHouse.getCatById(0);
        String actualOutput = actualCat.toString();

        Assert.assertTrue("testing if variables are the same", actualOutput.equals(expectedOutput));
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
    public void removeWithIdTest() {
        CatHouse.add(cat);
        //testing method overriding with id of cat
        CatHouse.remove(0);

        //the id of the cat is 0, so it shouldn't have anything there
        Assert.assertNull("asserting that cat is not in the cat house anymore", CatHouse.getCatById(0));
    }
    
    @Test
    public void getCatByIdTest() {
        CatHouse.add(cat);
        Cat actualCat = CatHouse.getCatById(0);
        String actualOutput = actualCat.toString();

        Assert.assertTrue("testing if variables are the same", actualOutput.equals(expectedOutput));
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
    }

    @After
    public void reset() {
        //makes it so that the cathouse is empty for the other tests
        CatHouse.clear();
    }
}
