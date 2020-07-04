package hbcu.stay.ready;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;

import hbcu.stay.ready.animals.Dog;

import hbcu.stay.ready.animals.animal_storage.DogHouse;
import java.util.Date;


public class DogHouseTest {

    //using only one dog
    String name, expectedOutput;
    Date date;
    int id;
    Dog dog;

    @Before
    public void initialize() {
        name = "Oliver";
        date = new Date();
        id = 0;
        dog = new Dog(name, date, id);
        expectedOutput = dog.toString();
    }

    @Test
    public void addDogTest() {  
        // when
        DogHouse.add(dog);
        Dog actualDog = DogHouse.getDogById(0);
        String actualOutput = actualDog.toString();

        // then 
        // tests to see if the variables of the dog in the doghouse are the same as the dog before 
        Assert.assertTrue("testing if variables are the same", actualOutput.equals(expectedOutput));
    }

    @Test
    public void removeWithIdTest() {
        DogHouse.add(dog);
        //testing method overriding with id of dog
        DogHouse.remove(0);

        //the id of the dog is 0, so it shouldn't have anything there
        Assert.assertNull("asserting that dog is not in the dog house anymore", DogHouse.getDogById(0));
    }

    @Test
    public void removeWithDogTest() {

        DogHouse.add(dog);
        //testing method overriding with dog object
        DogHouse.remove(dog);

        //the id of the dog is 0, so it shouldn't have anything there
        Assert.assertNull("asserting that dog is not in the dog house anymore", DogHouse.getDogById(0));
    }

    @Test
    public void getDogByIdTest() {
        //when
        DogHouse.add(dog);
        Dog actualDog = DogHouse.getDogById(0);
        String actualOutput = actualDog.toString();

        //then
        // tests to see if the variables of the dog in the doghouse are the same as the dog before 
        Assert.assertTrue("testing if variables are the same", actualOutput.equals(expectedOutput));
    }

    @Test
    public void getNumberOfDogsTest() {
        int expectedNumDogsBefore = 0;
        int expectedNumdogs = 1;
        
        int actualNumDogsBefore = DogHouse.getNumberOfDogs();
        DogHouse.add(dog);
        int actualNumDogs = DogHouse.getNumberOfDogs();

        // then 
        Assert.assertEquals("testing number of dogs function with 0 dogs", expectedNumDogsBefore, actualNumDogsBefore);
        Assert.assertEquals("testing number of dogs function with 1 dog", expectedNumdogs, actualNumDogs);
    }

    @After
    public void reset() {
        //makes it so that the doghouse is empty for the other tests
        DogHouse.clear();
    }
    
}
