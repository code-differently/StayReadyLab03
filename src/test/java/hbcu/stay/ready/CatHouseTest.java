package hbcu.stay.ready;

import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_storage.CatHouse;

import java.util.Date;
import org.junit.Assert;
import org.junit.Test;


public class CatHouseTest {
    Date birthDate = new Date();


    @Test
    public void addCatTest(){
        // Given
        Cat ct = new Cat("Sassy", birthDate, 5);
        //When
        CatHouse.add(ct);
        Cat expectedV = ct;
        Cat actualV = CatHouse.getCatById(5);
        CatHouse.clear();

        //Then
        Assert.assertEquals(expectedV, actualV);
    } 

    
    @Test
    public void removeCatTest(){
        // Given
        Cat ct = new Cat("Sassy", birthDate, 2);
        //When
        CatHouse.add(ct);
        CatHouse.remove(ct);
        Cat expectedV = null;
        Cat actualV = CatHouse.getCatById(2);
        CatHouse.clear();

        //Then
        Assert.assertEquals(expectedV, actualV);
    } 

    
    @Test
    public void removeCatIdTest(){
        // Given
        Cat ct = new Cat("Sassy", birthDate, 10);
        //When
        CatHouse.add(ct);
        CatHouse.remove(10);
        Cat expectedV = null;
        Cat actualV = CatHouse.getCatById(10);
        CatHouse.clear();

        //Then
        Assert.assertEquals(expectedV, actualV);
    } 

    @Test
    public void getCatIdTest(){
        // Given
        Cat ct = new Cat("Sassy", birthDate, 1);
        //When
        CatHouse.add(ct);
        Cat expectedV = ct;
        Cat actualV = CatHouse.getCatById(1);

        //Then
        Assert.assertEquals(expectedV, actualV);
    } 
    @Test
    public void getNumberOfCatsTest(){
        // Given
        Cat ct = new Cat("Sassy", birthDate, 0);
        Cat ct1 = new Cat("Sassy", birthDate, 1);
        Cat ct2 = new Cat("Sassy", birthDate, 2);
        Cat ct3 = new Cat("Sassy", birthDate, 3);
        //When
        CatHouse.add(ct);
        CatHouse.add(ct1);
        CatHouse.add(ct2);
        CatHouse.add(ct3);
        int expectedV = 4;
        int actualV = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expectedV, actualV);
    } 


}
