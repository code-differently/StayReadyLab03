package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;
import java.util.Date;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

public class AnimalFactoryTest {
    //Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest()
    {
        //Given
        //When 
        Date birthDate = new Date();
        Dog dog = AnimalFactory.createDog("Poncho", birthDate);
        Dog actual = dog;
        Dog expected = new Dog("Poncho", birthDate, 1);
        //Then
        Assert.assertTrue(expected.toString().equals(actual.toString()));
    }
    //Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest()
    {
        //Given
        //When 
        Date birthDate = new Date();
        Cat cat = AnimalFactory.createCat("Marissa", birthDate);
        Cat actual = cat;
        Cat expected = new Cat("Marissa", birthDate, 1);
        //Then
        Assert.assertTrue(expected.toString().equals(actual.toString()));
    }
}   
