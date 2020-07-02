package hbcu.stay.ready;

import org.junit.Assert;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import hbcu.stay.ready.animals.Cat;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`


@Test
public void createCatTest(){

    // Given 
    String name = "mil";
    Date birthDate = new Date();
    Cat animal = AnimalFactory.createCat(name, birthDate);
    
    assertEquals(name, animal.getName());
    assertEquals(birthDate, animal.getBirthDate());

}

@Test
public void createDogTest(){

    // Given 
    String name = "Milo";
    Date birthDate = new Date();
    Dog animal = AnimalFactory.createDog(name, birthDate);
    
    assertEquals(name, animal.getName());
    assertEquals(birthDate, animal.getBirthDate());

}


}
