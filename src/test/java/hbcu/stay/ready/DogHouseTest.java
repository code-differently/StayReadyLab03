package hbcu.stay.ready;

import hbcu.stay.ready.animals.animal_creation.AnimalFactory;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.animal_storage.DogHouse;
import java.util.Date;


public class DogHouseTest {
    Date birthDate = new Date();
  
    @Test
    public void addDogTest(){
        // Given
        Dog dd = new Dog("Sassy", birthDate, 5);
        //When
        DogHouse.add(dd);
        Dog expectedV = dd;
        Dog actualV = DogHouse.getDogById(5);
        DogHouse.clear();

        //Then
        Assert.assertEquals(expectedV, actualV);
    } 

    
    @Test
    public void removeDogTest(){
        // Given
        Dog dd = new Dog("Sassy", birthDate, 2);
        //When
        DogHouse.add(dd);
        DogHouse.remove(dd);
        Dog expectedV = null;
        Dog actualV = DogHouse.getDogById(2);
        DogHouse.clear();

        //Then
        Assert.assertEquals(expectedV, actualV);
    } 

    
    @Test
    public void removeDogIdTest(){
        // Given
        Dog dd = new Dog("Sassy", birthDate, 10);
        //When
        DogHouse.add(dd);
        DogHouse.remove(10);
        Dog expectedV = null;
        Dog actualV = DogHouse.getDogById(10);
        DogHouse.clear();

        //Then
        Assert.assertEquals(expectedV, actualV);
    } 

    @Test
    public void getDogIdTest(){
        // Given
        Dog dd = new Dog("Sassy", birthDate, 1);
        //When
        DogHouse.add(dd);
        Dog expectedV = dd;
        Dog actualV = DogHouse.getDogById(1);

        //Then
        Assert.assertEquals(expectedV, actualV);
    } 



    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        int expected = 1;
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
        
    }
}
