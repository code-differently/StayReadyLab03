package hbcu.stay.ready;

import java.util.Date;
import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest(){
        //Given
        String expectedName = "Muffin";
        Date expectedDate = new Date();

        //Then
        Dog dog = AnimalFactory.createDog("Muffin", expectedDate);
        String actualName = dog.getName();
        Date actualDate = dog.getBirthDate();

        //When
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }

    @Test
    public void createCatTest(){
        // Given
        String expectedName = "Pie";
        Date expectedDate = new Date();

        // When
        Cat cat = AnimalFactory.createCat("Pie", expectedDate);
        String actualName = cat.getName();
        Date actualDate = cat.getBirthDate();

        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }
}
