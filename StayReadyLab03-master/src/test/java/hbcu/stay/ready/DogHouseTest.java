package hbcu.stay.ready;

import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import org.junit.Test;
import org.junit.Assert;
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
    public void addTest(){
        //Given
        String name = "meowster";
        Date birthDate = new Date();
        Integer Id = new Integer(5);
        Dog c1 = new Dog(name,birthDate,Id);
        
        //When
        DogHouse.add(c1);
        Integer actualNum = DogHouse.getNumberOfDogs();
        Integer expected = new Integer(0);
        expected++;
        //Then
        Assert.assertEquals(expected, actualNum);
        

    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void RemoveIDTest(){
        //Given
        String name = "meowster";
        Date birthDate = new Date();
        Integer Id = new Integer(5);
        Dog c1 = new Dog(name,birthDate,Id);
        
        //When
        DogHouse.add(c1);
        DogHouse.remove(5);
        boolean isEmpty = DogHouse.getDogById(5) == null;
        
        
        //Then
        Assert.assertEquals(true, isEmpty);
        

    }

    // TODO - Create tests for `void remove(Dog Dog)`
    @Test
    public void RemoveDogTest(){
        //Given
        String name = "meowster";
        Date birthDate = new Date();
        Integer Id = new Integer(5);
        Dog c1 = new Dog(name,birthDate,Id);
        
        //When
        DogHouse.add(c1);
        DogHouse.remove(c1);
        boolean isEmpty = DogHouse.getDogById(5) == null;
            
        
        //Then
        Assert.assertEquals(true, isEmpty);
        

    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void RemoveGetbyID(){
        //Given
        String name = "meowster";
        Date birthDate = new Date();
        Integer Id = new Integer(5);
        Dog c1 = new Dog(name,birthDate,Id);
        
        //When
        DogHouse.add(c1);
        DogHouse.remove(c1);
        boolean isEmpty = DogHouse.getDogById(5) == null;
        //String actualName = c2.getName();

        
        //Then
        Assert.assertEquals(true, isEmpty);
        

    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void numberOfDogsTest(){
        //Given
        String name = "meowster";
        Date birthDate = new Date();
        Integer Id = new Integer(5);
        Dog c1 = new Dog(name,birthDate,Id);
        Dog c2 = new Dog(name,birthDate,Id);
        //When
        Integer expected = new Integer(0);
        DogHouse.add(c1);
        expected++;
        DogHouse.add(c2);
        expected++;
        Integer actualNum = DogHouse.getNumberOfDogs();
        
        

        //Then
        Assert.assertEquals(expected, actualNum);
        

    }
}
