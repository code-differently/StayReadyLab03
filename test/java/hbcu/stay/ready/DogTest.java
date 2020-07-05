package hbcu.stay.ready;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Mammal;
import hbcu.stay.ready.animals.Animal;


public class DogTest {
    // Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // Create tests for `speak`
    // Create tests for `setBirthDate(Date birthDate)`
    // Create tests for `void eat(Food food)`
    // Create tests for `Integer getId()`
    // Create test to check Animal inheritance; google search `java instanceof keyword`
    // Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog("Beethoven", new Date(), 9);
        String expected = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName("Milo");
        String actual = dog.getName();

        // Then (we expect to get the given name from the dog)
        Assert.assertEquals("testing set name of dog object", expected, actual);
    }
    //create test for speak
    @Test
    public void speakDogTest(){
        //Given 
        Dog dog = new Dog("Beethoven", new Date(), 9);
        String expected = "bark!";
        //When 
        dog.speaks("bark!");
        String actual = Animal.speaks();
        //Then
        Assert.assertEquals("testing bark statement of dog object", expected, actual);
    }
    //Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateDogTest(){
        //Given
        Dog dog = new Dog("Beethoven", new Date(121209), 9);
        Date expected = new Date(121409);
        //When 
        dog.setBirthDate(new Date(121409));
        Date actual = dog.getBirthDate();
        //Then 
        Assert.assertEquals("testing set birthdate of dog object", expected, actual);
    }
    //Create tests for `void eat(Food food)`
    @Test
    public void eatDogTest(){
        //Given 
        Dog dog = new Dog("Beethoven", new Date(), 9);
        Food dogFood = new Food();
        //When 
        dog.eat(dogFood);
        //Then
        int expected = 1;
        int actual = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual, 0.0);
    }
    //Create tests for `Integer getId()`
    @Test
    public void idDogTest(){
        //Given 
        Dog dog = new Dog("Beethoven", new Date(), 9);
         Integer expected = 9;
         //When 
         Integer actual = dog.getId();
         //Integer actual = 15;
         //Then 
        Assert.assertEquals("testing getter ID", expected, actual);
     }
    //Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test 
    public void animalInheritanceDogTest(){
        //Given
        Dog dog = new Dog("Beethoven", new Date(), 9);
        //When 
        Boolean expected = true;
        Boolean actual  = dog instanceof Animal;
        //Then
        Assert.assertEquals(expected, actual);
        }
    //Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceDogTest(){
        //Given
        Dog dog = new Dog("Beethoven", new Date(), 9);
        //When 
        Boolean expected = true;
        Boolean actual = dog instanceof Mammal;
        //Then 
        Assert.assertEquals(expected, actual);
    }  
}
    

