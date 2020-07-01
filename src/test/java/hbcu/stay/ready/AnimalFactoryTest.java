package hbcu.stay.ready;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import hbcu.stay.ready.animals.Cat;
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest(){
        String expName = "Douglas";
        Date expDate =  new Date();
        
        Dog dog = AnimalFactory.createDog("Douglas", new Date());

        assertEquals(expName, dog.getName());
        assertEquals(expDate, dog.getBirthDate());
    }

    @Test
    public void createCatTest(){
        String expName = "Christine";
        Date expDate =  new Date();
        
        Cat cat = AnimalFactory.createCat("Christine", new Date());
        
        assertEquals(expName, cat.getName());
        assertEquals(expDate, cat.getBirthDate());
    }
}
