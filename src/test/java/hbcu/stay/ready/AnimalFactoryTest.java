package hbcu.stay.ready;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

public class AnimalFactoryTest {
    
    @Test
    public void createDogTest() {
        // Given
        Dog d = AnimalFactory.createDog("Sajid", new Date(1999, 01, 05));

        // When
        String expectedName = "Sajid";
        Date expectedDate = new Date(1999, 01, 05);
        String actualName = d.getName();
        Date actualDate = d.getBirthDate();

        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }

    @Test
    public void createCatTest() {
        // Given
        Cat c = AnimalFactory.createCat("Sajid", new Date(1999, 01, 05));

        // When
        String expectedName = "Sajid";
        Date expectedDate = new Date(1999, 01, 05);
        String actualName = c.getName();
        Date actualDate = c.getBirthDate();

        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }

}
