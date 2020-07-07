package hbcu.stay.ready;

import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_storage.DogHouse;

import java.util.Date;


public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void addTest(){
        //given
        Dog dog = new Dog ("Chance", new Date(), 4);

        //when 
        DogHouse.add(dog);
        Int expected = 1;
        Int actual = DogHouse.getnumberofDogs();

        //then
        Assert.assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void removeIntIdTest(){
        //given 
        Dog dog = new Dog ("Apollo", new Date(), 4);

        //when
        DogHouse.add(dog);
        DogHouse.remove(1);
        Int expected =0;
        Int actual = DogHouse.getnumberofDogs();

        //then 
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void removeTest(){

        //given 
        Dog dog = new Dog ("Buddy", new Date(), 4);

        //when
        DogHouse.add(dog);
        DogHouse.remove(1);
        Int expected =0;
        Int actual = DogHouse.getnumberofDogs();

        //then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void setBirthDateTest(){

        //given 
        Cat cat = new Cat("Bunny", new Date(),4);
        Date birthdate = new Date();
        cat.setBirthDate(birthdate);

        //when
        Date expected = birthdate;
        Date actual = cat.getBirthDate();

        //then 
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
