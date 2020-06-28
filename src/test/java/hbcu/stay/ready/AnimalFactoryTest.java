package hbcu.stay.ready;

import org.junit.Test;


import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import junit.framework.Assert;

import java.util.Date;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Cat;

public class AnimalFactoryTest 
{
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`


    @Test
    public void createDogTest()
    {
        //Given
        AnimalFactory animalCrossing = new AnimalFactory();
       Dog expectedDog = new Dog("Boney",new Date(1999,12,31),null);
      
       //Then
        Dog actualDog =   animalCrossing.createDog("Boney", new Date(1999,12,31));

        //When
        Assert.assertEquals(expectedDog.getName(), actualDog.getName());
        Assert.assertEquals(expectedDog.getBirthDate(), actualDog.getBirthDate());
    }

    @Test
    public void createCatTest()
    {
        //Given
        AnimalFactory animalCrossing = new AnimalFactory();
       Cat expectedCat = new Cat("Cathy",new Date(2008,2,24),null);
      
       //Then
        Cat actualCat =   animalCrossing.createCat("Cathy", new Date(2008,2,24));

        //When
        Assert.assertEquals(expectedCat.getName(), actualCat.getName());
        Assert.assertEquals(expectedCat.getBirthDate(), actualCat.getBirthDate());
    }
}
