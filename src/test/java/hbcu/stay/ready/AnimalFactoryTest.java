package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

public class AnimalFactoryTest {

    @Test
    public void creatCatTest(){

        Cat cat = AnimalFactory.createCat("Qwazi", null);

        Assert.assertNotNull(cat);
    }

    @Test
    public void createDogTest(){

        Dog dog = AnimalFactory.createDog("Snow", null);
        
        Assert.assertNotNull(dog);
    }
}
