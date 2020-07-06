package hbcu.stay.ready;

import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import org.junit.Test;
import hbcu.stay.ready.animals.Cat;
import org.junit.Assert;
import java.util.Date;
import hbcu.stay.ready.animals.Dog;





public class AnimalFactoryTest {

    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest(){

        Date birthday = new Date();
        Dog dog = AnimalFactory.createDog("Jan", birthday);

        Dog actual = dog;
        Dog expected = new Dog("Jan", birthday, 1);

        Assert.assertTrue(expected.toString().equals(actual.toString()));
        System.out.println(actual.toString());
        System.out.println(expected.toString());

    }


    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest(){

        Date birthday = new Date();
        Cat cat = AnimalFactory.createCat("Janille", birthday);
        Cat actual = cat;
        Cat expected = new Cat("Janille", birthday, 1);

        Assert.assertTrue(expected.toString().equals(actual.toString()));


    }
}
