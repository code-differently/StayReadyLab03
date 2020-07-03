package hbcu.stay.ready;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest(){

        Assert.assertTrue(AnimalFactory.createDog("Croix",new Date()) instanceof Dog);

    }

    @Test
    public void createCatTest(){

        Assert.assertTrue(AnimalFactory.createCat("James",new Date()) instanceof Cat);

    }
}
