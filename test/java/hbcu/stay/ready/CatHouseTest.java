package hbcu.stay.ready;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_storage.CatHouse;

public class CatHouseTest {
    // Create tests for `void add(Cat cat)`
    // Create tests for `void remove(Integer id)`
    // Create tests for `void remove(Cat cat)`
    // Create tests for `Cat getCatById(Integer id)`
    // Create tests for `Integer getNumberOfCats()`

    // Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest() {
        // Given
        Cat cat = new Cat("Lizzie", new Date(), 7);
        //When
        CatHouse.add(cat);
        Integer expected = 2;
        Integer actual = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expected, actual);
    }
    // Create tests for `void remove(Integer id)`
    @Test
    public void removeCatNumberTest(){
        //Given
        Cat cat = new Cat("Bonita", new Date(), 4);
        //When
        CatHouse.add(cat);
        CatHouse.remove(4);
        Integer expected = 3;
        Integer actual = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expected, actual);
    }
    //Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatNameTest(){
        //Given
        Cat cat = new Cat("Zeus", new Date(), 2);
        //When
        CatHouse.add(cat);
        CatHouse.remove(cat);
        Integer expected = 3;
        Integer actual = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expected, actual);
    }
    //Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest2(){
        //Given 
        Cat cat = new Cat("Texas", new Date(), 10);
        Cat expected = cat;
        //When 
        CatHouse.add(cat);
        //CatHouse.getCatById(10);
        Cat actual = CatHouse.getCatById(10);
        //Then 
        Assert.assertEquals(expected, actual);
    }
    //Create tests for `Integer getNumberOfCats()`
    @Test 
    public void getNumberOfCatsTest(){
        Cat cat = new Cat("Hunnie", new Date(), 3);
        CatHouse.add(cat);
        //String name = "Stitch";
        Integer expected = 3;
        Integer actual = CatHouse.getNumberOfCats();
        //Date birthDate = new Date();
        //Cat animal = AnimalFactory.createCat(name, birthDate);
        //
       // CatHouse.add(animal);
        //CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
}
