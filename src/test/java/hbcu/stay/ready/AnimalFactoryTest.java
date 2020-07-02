package hbcu.stay.ready;
import org.junit.Assert;
import org.junit.Test; 

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Dog; 
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

import java.util.Date;



public class AnimalFactoryTest {
    @Test

    public void createDogTest(){
        //TODO - Create Test for `Animal createDog(String name, Date birthDate)`

    //Given
    String name = "coco";
    Date date = new Date();
    Date birthdate = date;
    Dog dog = AnimalFactory.createDog("coco", date);

    //When
    String getNameResult = dog.getName();
    Date getDateResult = dog.getBirthDate();

    //Then
    Assert.assertEquals(name, getNameResult);
    Assert.assertEquals(birthdate, getDateResult);


    }

    @Test

    public void createCatTest(){
       //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    //Given
    String name = "sassy";
    Date date = new Date();
    Date birthdate = date;
    Cat cat = AnimalFactory.createCat("sassy", date);

    //When
    String getNameResult = cat.getName();
    Date getDateResult = cat.getBirthDate();

    //Then
    Assert.assertEquals(name, getNameResult);
    Assert.assertEquals(birthdate, getDateResult);

    }

}
