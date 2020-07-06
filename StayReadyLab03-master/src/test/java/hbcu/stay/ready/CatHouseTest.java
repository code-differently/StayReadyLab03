package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_storage.CatHouse;

import java.util.Date;

public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addTest(){
        //Given
        String name = "meowster";
        Date birthDate = new Date();
        Integer Id = new Integer(5);
        Cat c1 = new Cat(name,birthDate,Id);
        
        //When
        CatHouse.add(c1);
        Integer actualNum = CatHouse.getNumberOfCats();
        Integer expected = new Integer(0);
        expected++;
        //Then
        Assert.assertEquals(expected, actualNum);
        

    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void RemoveIDTest(){
        //Given
        String name = "meowster";
        Date birthDate = new Date();
        Integer Id = new Integer(5);
        Cat c1 = new Cat(name,birthDate,Id);
        
        //When
        CatHouse.add(c1);
        CatHouse.remove(5);
        boolean isEmpty = CatHouse.getCatById(5) == null;
        
        
        //Then
        Assert.assertEquals(true, isEmpty);
        

    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void RemoveCatTest(){
        //Given
        String name = "meowster";
        Date birthDate = new Date();
        Integer Id = new Integer(5);
        Cat c1 = new Cat(name,birthDate,Id);
        
        //When
        CatHouse.add(c1);
        CatHouse.remove(c1);
        boolean isEmpty = CatHouse.getCatById(5) == null;
            
        
        //Then
        Assert.assertEquals(true, isEmpty);
        

    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void RemoveGetbyID(){
        //Given
        String name = "meowster";
        Date birthDate = new Date();
        Integer Id = new Integer(5);
        Cat c1 = new Cat(name,birthDate,Id);
        
        //When
        CatHouse.add(c1);
        CatHouse.remove(c1);
        boolean isEmpty = CatHouse.getCatById(5) == null;
        //String actualName = c2.getName();

        
        //Then
        Assert.assertEquals(true, isEmpty);
        

    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void numberOfCatsTest(){
        //Given
        String name = "meowster";
        Date birthDate = new Date();
        Integer Id = new Integer(5);
        Cat c1 = new Cat(name,birthDate,Id);
        Cat c2 = new Cat(name,birthDate,Id);
        //When
        Integer expected = new Integer(0);
        CatHouse.add(c1);
        expected++;
        CatHouse.add(c2);
        expected++;
        Integer actualNum = CatHouse.getNumberOfCats();
        
        

        //Then
        Assert.assertEquals(expected, actualNum);
        

    }

}
