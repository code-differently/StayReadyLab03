package hbcu.stay.ready;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.*;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import hbcu.stay.ready.animals.*;

public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    
    @Test
    public void createDogTest(){
    //Given
    Date birthDate = new Date();
    Dog dogman = AnimalFactory.createDog("dogman", birthDate);
    //When
    String actualName = dogman.getName();
    Date actualDate = dogman.getBirthDate();
    //Then
    Assert.assertEquals("dogman", actualName);
    Assert.assertEquals(birthDate, actualDate);
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest(){
    //Given
    Date birthDate = new Date();
    Cat catman = AnimalFactory.createCat("catman", birthDate);
    //When
    String actualName = catman.getName();
    Date actualDate = catman.getBirthDate();
    //Then
    Assert.assertEquals("catman", actualName);
    Assert.assertEquals(birthDate, actualDate);
    }
}
