package hbcu.stay.ready;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void creatDogTest(){

        String name = "Cody";
        Date birthDate = new Date();
        Dog dog = AnimalFactory.createDog(name, birthDate);

        String actualName = dog.getName();
        Date actualDate = dog.getBirthDate();

        Assert.assertEquals(name, actualName);
        Assert.assertEquals(birthDate, actualDate);  
    }


    @Test
    public void createCatTest(){

        String name = "Zack";
        Date birthDate = new Date();
        Cat cat = AnimalFactory.createCat(name, birthDate);

        String actualName = cat.getName();
        Date actualDate = cat.getBirthDate();

        Assert.assertEquals(name, actualName);
        Assert.assertEquals(birthDate, actualDate);
    }
}
