package hbcu.stay.ready;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_storage.CatHouse;

public class CatHouseTest {
    Date date = new Date(); 
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test 
    public void addTest(){
        Cat cat = new Cat("Kitty", date, 12); 
        //CatHouse house = new CatHouse(); don't need this because the methods are static
        Cat expected = cat; 
        CatHouse.clear(); 

        CatHouse.add(cat); 
        Cat actual = CatHouse.getCatById(12); 

        Assert.assertEquals(expected, actual);
    }


    @Test 
    public void removeTest(){
        Cat cat = new Cat("Kitty", date, 12); 
        Cat expected = null; 
        CatHouse.clear();

        CatHouse.add(cat); 
        CatHouse.remove(cat);

        Cat actual = CatHouse.getCatById(12); 

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByIdTest(){
        Cat cat = new Cat("Kitty", date, 12); 
        Cat expected = null; 
        CatHouse.clear();

        CatHouse.add(cat); 
        CatHouse.remove(12);

        Cat actual = CatHouse.getCatById(12); 

        Assert.assertEquals(expected, actual);    
    }

    @Test
    public void getByIdTest(){
        Cat cat = new Cat("Kitty", date, 12); 
        Cat expected = cat; 
        CatHouse.clear();

        CatHouse.add(cat); 

        Cat actual = CatHouse.getCatById(12); 

        Assert.assertEquals(expected, actual);   
    }

   @Test 
   public void getNumberofCatsTest(){
    Cat cat = new Cat("Kitty", date, 12); 
    Cat cat2 = new Cat("LuLu", date, 13);
    int expected = 2; 
    CatHouse.clear();

    CatHouse.add(cat); 
    CatHouse.add(cat2);

    int actual = CatHouse.getNumberOfCats();  

    Assert.assertEquals(expected, actual);
   }
}
