package hbcu.stay.ready;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import org.junit.Test;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_storage.CatHouse;
import org.junit.Assert;
import java.util.Date;



public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test 
    public void addTest(){ 
        Cat cat = new Cat("Tina", new Date(), 3);
        CatHouse.add(cat);

        
        Integer expected = 1;
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);

    }
    // TODO - Create tests for `void remove(Integer id)`
    public void removeCatIdTest(){
        Cat cat = new Cat("Tina", new Date(), 3);
        CatHouse.add(cat);
        CatHouse.remove(3);

        Integer expected = 0;
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test 
    public void removeTestCat(){
        Cat cat = new Cat("Tina", new Date(), 3);
        CatHouse.add(cat);
        CatHouse.remove(3);

        Integer expected = 0;
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest(){
        Cat cat = new Cat("Tina", new Date(), 3);

        Integer expected = 3;
        Integer actual = cat.getId();

        Assert.assertSame(expected, actual);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test 
    public void getNumberOfCats(){
        Cat cat = new Cat("Tina", new Date(), 3);
        CatHouse.add(cat);

        Integer expected = 1; 
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);


    }
}
