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


    @Test
    public void addDogTest()
    {
        //Given
        DogHouse dogHouse = new DogHouse();
        int expectedDogs = 3;

        //When
        AnimalFactory animalFactory = new AnimalFactory();
        
        dogHouse.add(animalFactory.createDog("Sylvester", new Date()));
        dogHouse.add(animalFactory.createDog("Boney", new Date()));
        dogHouse.add(animalFactory.createDog("Benny", new Date()));

        int actualDogs = dogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(expectedDogs, actualDogs);
    }

    @Test
    public void removeIdTest()
    {
        //Given
        DogHouse dogHouse = new DogHouse();
        int expectedDogs = 2;

        //When
        AnimalFactory animalFactory = new AnimalFactory();

        dogHouse.add(animalFactory.createDog("Spike", new Date()));
        dogHouse.add(animalFactory.createDog("Boney", new Date()));
        dogHouse.add(animalFactory.createDog("Bolo", new Date()));

        dogHouse.remove(2); //Should remove Bolo, whose Id is 2

        int actualDogs = dogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(expectedDogs, actualDogs);
    }

    @Test
    public void removeDogTest()
    {
        //Given
        DogHouse dogHouse = new DogHouse();
        int expectedDogs = 1;

        //When
        Dog bark = new Dog("Bark",new Date(),1);
        Dog hershey = new Dog("Hershey",new Date(),2);
        Dog doggo = new Dog("Doggo",new Date(),1);

        dogHouse.add(bark);
        dogHouse.add(hershey);
        dogHouse.add(doggo);

        dogHouse.remove(doggo); 
        dogHouse.remove(bark);

        int actualDogs = dogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(expectedDogs, actualDogs);
    }


    @Test
    public void getDogByIdTest()
    {
        //Given
        Dog expectedDog = new Dog("Expected",new Date(2050, 12, 23),5);
        DogHouse dogHouse = new DogHouse();

        //When
        dogHouse.add(expectedDog);
        Dog actualDog = dogHouse.getDogById(5);

        //Then
        Assert.assertEquals(expectedDog, actualDog);
    }
    
}
