package hbcu.stay.ready;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest(){
        // Given
        String name = "benji";
        Date birthDate = new Date();
        AnimalFactory dogFactory = new AnimalFactory();

        // When 
        Dog fido = dogFactory.createDog(name, birthDate);

        String expectedName = "benji";
        Date expectedDate = birthDate;

        String actualName = fido.getName();
        Date actualDate = fido.getBirthDate();

        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest(){
        // Given
        String name = "sylvester";
        Date birthDate = new Date();
        AnimalFactory catFactory = new AnimalFactory();

        // When 
        Cat feline = catFactory.createCat(name, birthDate);

        String expectedName = "sylvester";
        Date expectedDate = birthDate;

        String actualName = feline.getName();
        Date actualDate = feline.getBirthDate();

        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    
    }
}
