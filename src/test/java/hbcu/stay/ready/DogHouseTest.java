package hbcu.stay.ready;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import hbcu.stay.ready.animals.animal_storage.CatHouse;
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
    public void addDog(){
        //Given
        DogHouse dogHouse = new DogHouse();
        dogHouse.getNumberOfDogs();

        //When
        Assert.assertEquals(0, dogHouse.getNumberOfDogs(),0);
        dogHouse.add(new Dog("Cali",new Date(), 210));


        //Then
        Assert.assertEquals(1, dogHouse.getNumberOfDogs(),0);

    }

    @Test
    public void removeDogById(){
        //Given
        DogHouse dogHouse = new DogHouse();
        final int ID = 49;


        //When
        dogHouse.add(new Dog("Scooby",new Date(), ID));
        Assert.assertEquals(1, dogHouse.getNumberOfDogs(),0);

        //Then
        dogHouse.remove(ID);
        Assert.assertEquals(0, dogHouse.getNumberOfDogs(),0);

    }

    @Test
    public void removeDogByDog(){
        //Given
        Dog dog = new Dog("Tim", new Date(), 922);
        DogHouse dogHouse = new DogHouse();

        //When
        dogHouse.add(dog);
        Assert.assertEquals(1, dogHouse.getNumberOfDogs(),0);

        //Then
        dogHouse.remove(dog);
        Assert.assertEquals(0, dogHouse.getNumberOfDogs(),0);

    }

    @Test
    public void getDogById(){
        //Given
        DogHouse dogHouse = new DogHouse();
        final int ID = 2892;

        //When
        dogHouse.add(new Dog("Stinky", new Date(), ID));
        Dog retrievedDog = dogHouse.getDogById(ID);

        //Then
        Assert.assertEquals(2892, retrievedDog.getId(),0);

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
