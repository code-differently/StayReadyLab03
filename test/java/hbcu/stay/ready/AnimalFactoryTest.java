package hbcu.stay.ready;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

public class AnimalFactoryTest {
    //Create Test for `Animal createDog(String name, Date birthDate)`
    //Create Test for `Animal createCat(String name, Date birthDate)`


//Create Test for `Animal createDog(String name, Date birthDate)`
@Test
public void createDogTest(){
        // Given
        Dog dog = AnimalFactory.createDog("Quavo", new Date());
        //When 
        Dog actual = dog;
        Date birthDate = new Date();
        //Then 
        Dog expected = new Dog("Quavo", birthDate, 2);
        Assert.assertEquals(expected.getName(), actual.getName());
    }
//Create Test for `Animal createCat(String name, Date birthDate)`
@Test
public void createCatTest(){
    // Given
    Cat cat = AnimalFactory.createCat("Offset", new Date());
    //When 
    Cat actual = cat;
    Date birthDate = new Date();
    //Then 
    Cat expected = new Cat("Offset", birthDate, 2);
    Assert.assertEquals(expected.getName(), actual.getName());

}
}