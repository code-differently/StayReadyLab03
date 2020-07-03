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
    public void creatDogTest(){
        // Given
        Date date= new Date();
        String name= "Bill";

        // When
        Dog dog = AnimalFactory.createDog("Bill", date);
        String actualName=dog.getName();
        Date actualDate=dog.getBirthDate();

        // Then
        Assert.assertEquals(name, actualName);
        Assert.assertEquals(date, actualDate);

    }

    @Test
    public void creatCatTest(){
        // Given
        Date date= new Date();
        String name= "Bill";

        // When
        Cat cat = AnimalFactory.createCat("Bill", date);
        String actualName=cat.getName();
        Date actualDate=cat.getBirthDate();

        // Then
        Assert.assertEquals(name, actualName);
        Assert.assertEquals(date, actualDate);

    }
}
