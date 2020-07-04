package hbcu.stay.ready;

import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_storage.DogHouse;
import java.util.Date;


public class DogHouseTest {
    //Create tests for `void add(Dog dog)`
    @Test
    public void addTest()
    {
        //Given 
        Dog dog = new Dog("chubby",new Date(), 3);
        //When
        DogHouse.add(dog);
        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(expected, actual);
    }
    //Create tests for `void remove(Integer id)`
        @Test
        public void removeByIdDogTest()
        {
            //Given 
        Dog dog = new Dog("chubby",new Date(),1);
        DogHouse.add(dog);
        //When
        DogHouse.remove(1);
        Integer expected = 0;
        Integer actual = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(expected, actual);
        }
    
    //Create tests for `void remove(Dog dog)`
    @Test
    public void removeTest ()
    {
        //Given 
        Dog dog = new Dog("chubby",new Date(), 3);
        DogHouse.add(dog);
        //When
        DogHouse.remove(dog);
        Integer expected = 0;
        Integer actual = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(expected, actual);
    }

    //Create tests for `Dog getDogById(Integer id)`
        @Test
        public void getDogById()
        {
            //Given
            Dog dog = new Dog("Thomas",new Date(), 2);
            DogHouse.add(dog);
            //When
            Dog actual = DogHouse.getDogById(2);
            Dog expected = dog;
            //Then
            Assert.assertEquals(expected, actual);
        }
    //Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfDogsTest()
    {
        Dog dog = new Dog("Snuggles", new Date(), 5);
        DogHouse.add(dog);
        //When 
        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs();
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
