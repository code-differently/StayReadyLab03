package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;


import java.util.Date;

public class AnimalFactoryTest {
    @Test
    public void createDogTest() {
        // given (dog)
        String name = "Milo";
        Date date = new Date();
        Dog dog = AnimalFactory.createDog(name, date);
        
        // when
        String actualName = dog.getName();
        Date actualDate = dog.getBirthDate();

        // then
        Assert.assertEquals("testing name", name, actualName);
        Assert.assertEquals("testing date", date, actualDate);

    }
    
    @Test
    public void createCatTest() {
        // given (cat)
        String name = "Harold";
        Date date = new Date();
        Cat cat = AnimalFactory.createCat(name, date);
        
        // when
        String actualName = cat.getName();
        Date actualDate = cat.getBirthDate();

        // then
        Assert.assertEquals("testing name", name, actualName);
        Assert.assertEquals("testing date", date, actualDate);

    }
}
