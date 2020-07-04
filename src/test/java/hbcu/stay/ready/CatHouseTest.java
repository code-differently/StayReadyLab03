package hbcu.stay.ready;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_storage.CatHouse;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class CatHouseTest {
    //Create tests for `void add(Cat cat)`
    @Test
    public void addTest()
    {  
        //Given 
        Cat cat = new Cat("Scratchy", new Date(), 1);
        //When
        CatHouse.add(cat);
        Integer expected = 1;
        Integer actual = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expected, actual);

    }
    // Create tests for `void remove(Integer id)`
        @Test
        public void removeTest()
        {
            //Given
            Cat cat = new Cat("Princess", new Date(), 1);
            CatHouse.add(cat);
            //When
            CatHouse.remove(cat);
            Integer expected = 0;
            Integer actual = CatHouse.getNumberOfCats();
            //Then
            Assert.assertEquals(expected, actual);
        }    

    //Create tests for `void remove(Cat cat)`
        @Test
        public void removeByIdTest()
        {
            //Given
            Cat cat = new Cat("Princess", new Date(), 1);
            CatHouse.add(cat);
            //When
            CatHouse.remove(1);
            Integer expected = 0;
            Integer actual = CatHouse.getNumberOfCats();
            //Then
            Assert.assertEquals(expected, actual);
        }
    //Create tests for `Cat getCatById(Integer id)`
        @Test
            public void getCatByIdTest()
            {
                //Given 
                Cat cat = new Cat("Maple", new Date(),2);
                CatHouse.add(cat);
                //When
              Cat actual = CatHouse.getCatById(2);
              Cat expected = cat;
                //Then
                Assert.assertEquals(expected, actual);
            }

    // Create tests for `Integer getNumberOfCats()`
    @Test
            public void getNumberOfCatsTest()
            {
                //Given
                Cat cat = new Cat("Snuffles", new Date(), 3);
                CatHouse.add(cat); 
                //When 
                Integer expected = 1;
                Integer actual = CatHouse.getNumberOfCats();
                //Then
                Assert.assertEquals(expected, actual);
            }
}
