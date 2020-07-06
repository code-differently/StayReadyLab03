package hbcu.stay.ready;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import org.junit.Test;
import org.junit.Assert;
import java.util.Date;

public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`


    @Test
    public void createDogTest(){
        // Given
        Date birthDate = new Date();
        Dog dog = AnimalFactory.createDog("Meliodas", birthDate);
        // When
        Dog actual = dog;
        Dog expected = new Dog("Meliodas", birthDate, 1);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void createCatTest(){
        // Given
        Date birthDate = new Date();
        Cat cat = AnimalFactory.createCat("Escanor", birthDate);
        // When
        Cat actual = cat;
        Cat expected = new Cat("Escanor", birthDate, 1);
        //Then
        Assert.assertEquals(expected, actual);
    }

}


