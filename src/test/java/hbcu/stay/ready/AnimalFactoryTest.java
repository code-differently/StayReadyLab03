package hbcu.stay.ready;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

public class AnimalFactoryTest {
    Date givenBirthDate = new Date();

    @Test
    public void createDogTest(){
        Dog dog = AnimalFactory.createDog("Boss Dog", givenBirthDate); 
        String expectedName = "Boss Dog"; 
        Date expectedDate = givenBirthDate; 

        String actualName = dog.getName(); 
        Date actualDate = dog.getBirthDate();

        Assert.assertEquals(expectedName, actualName); 
        Assert.assertEquals(expectedDate, actualDate);
    }

    @Test 
    public void createCatTest(){
        Cat cat = AnimalFactory.createCat("Boss Cat", givenBirthDate); 
        String expectedName = "Boss Cat"; 
        Date expectedDate = givenBirthDate; 

        String actualName = cat.getName(); 
        Date actualDate = cat.getBirthDate();

        Assert.assertEquals(expectedName, actualName); 
        Assert.assertEquals(expectedDate, actualDate);

    }



}
