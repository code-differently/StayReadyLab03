package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Mammal;

import java.util.Date;
import hbcu.stay.ready.animals.Animal;

public class DogTest {
    //Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void constructorTest()
    {
        //Given
        String name = "Toph";
        Date birthDate = new Date();
        Integer id = 1; 
        Dog dogTest = new Dog(name, birthDate, id);
        //When 
        String actualName = dogTest.getName();
        Date actualDate = dogTest.getBirthDate();
        Integer actualInteger = dogTest.getId();
        //Then 
        Assert.assertEquals(name, actualName);
        Assert.assertEquals(birthDate, actualDate);
        Assert.assertEquals(id, actualInteger);
    }
    // Create tests for `speak`
    @Test
        public void dogSpeakTest()
        {
            //Given
            Dog dogTest = new Dog("fluffy", new Date(), 1);
            //When 
            String expected = "bark!";
            String actual = dogTest.speak();
            //Then
            Assert.assertEquals(expected, actual);
        }

    // Create tests for `setBirthDate(Date birthDate)`
    @Test
        public void setBirthDateTest()
        {
            //Given
            String name = "Rue";
            Date birthDate = new Date();
            Integer id = 2;
            Dog dogtest = new Dog(name, birthDate, id);
            //When 
            Date actual = dogtest.getBirthDate();
            //Then 
            Assert.assertEquals(birthDate, actual);
        }
    // Create tests for `void eat(Food food)`
        @Test
    public void eatTest()
    {
        Dog dogtest = new Dog("Truffles",new Date(), 3);
        Food dogfood = new Food();
        //When 
        dogtest.eat(dogfood);
        Integer expected = 1; 
        Integer actual = dogtest.getNumberOfMealsEaten();
        //Then
        Assert.assertEquals(expected, actual);
    }
    //Create tests for `Integer getId()`
    @Test
        public void getDogId()
        {
            //Given
            Dog dogtest = new Dog ("Dior", new Date(),2);
            //When 
            Integer expected = 2;
            Integer actual = dogtest.getId();
            //Then 
            Assert.assertEquals(expected, actual);
        }
    // Create test to check Animal inheritance; google search `java instanceof keyword`
        @Test
        public void animalTest()
        {
            //Given 
            Dog dogtest = new Dog("Chunks", new Date(), 6);
            //When 
            Boolean expected = true;
            Boolean actual = dogtest instanceof Animal;
            //Then
           Assert.assertEquals(expected, actual);
        }

    //Create test to check Mammal inheritance; google search `java instanceof keyword`
        @Test
        public void mammalTest()
        {
            //Given 
            Dog dogtest = new Dog("Chunks", new Date(), 6);
            //When 
            Boolean expected = true;
            Boolean actual = dogtest instanceof Mammal;
            //Then
           Assert.assertEquals(expected, actual);
        }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
