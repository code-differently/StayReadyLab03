package hbcu.stay.ready;

import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
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
        //Given
        Dog dog = new Dog ("Bucky", new Date(), 4);

        //When
        DogHouse.add(dog);
        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expected, actual);
}

    @Test
    public void removeIntegerIdTest(){
        //Given
        Dog dog = new Dog ("Sam", new Date(), 4);

        //When
        DogHouse.add(dog);
        DogHouse.remove(1);
        Integer expected = 0;
        Integer actual = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expected, actual);
}

    @Test
    public void removeTest(){
        //Given
        Dog dog = new Dog ("John", new Date(), 4);

        //When
        DogHouse.add(dog);
        DogHouse.remove(1);
        Integer expected = 0;
        Integer actual = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expected, actual);
}

    @Test
    public void getDogByIdTest(){
        //Given
        Dog dog = new Dog ("Junior", new Date(), 4);

        //When
        DogHouse.add(dog);
        Dog actual = DogHouse.getDogById(1);
        Dog expected = dog;

        //Then
        Assert.assertEquals(expected, actual);
}

    @Test
    public void getNumberOfDogsTest(){
        //Given
        Dog dog = new Dog ("Sonny", new Date(), 4);

        //When
        DogHouse.add(dog);
        Dog actual = DogHouse.getDogById(01);
        Dog expected = dog;

        //Then
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
