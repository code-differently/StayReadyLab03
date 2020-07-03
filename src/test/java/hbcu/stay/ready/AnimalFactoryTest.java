package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

import java.util.Date;

public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`


    @Test
    public void createDogTest(){
        //Given
        String name = "Mill";
        Date birthDate = new Date();
        Integer id = 0;
        Dog expectedDog = new Dog(name, birthDate, id);
        String expectedName = expectedDog.getName();
        Date expectedBirth = expectedDog.getBirthDate();
        //When
        AnimalFactory newFact = new AnimalFactory();
        Dog actualDog = newFact.createDog(name, birthDate);
        String actualName = actualDog.getName();
        Date actualBirth = actualDog.getBirthDate();
        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirth, actualBirth);
    }
    @Test
    public void createCatTest(){
        //Given
        String name = "Milla";
        Date birthDate = new Date();
        Integer id = 0;
        Cat expectedCat = new Cat(name, birthDate, id);
        String expectedName = expectedCat.getName();
        Date expectedBirth = expectedCat.getBirthDate();
        //When
        AnimalFactory newFact = new AnimalFactory();
        Cat actualCat = newFact.createCat(name, birthDate);
        String actualName = actualCat.getName();
        Date actualBirth = actualCat.getBirthDate();
        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirth, actualBirth);
    }
}
