package hbcu.stay.ready;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Mammal;
import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;

import java.util.Date;


public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
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

    @Test
    public void constructortest(){
        // Given (dog data)
        String givenName = "Sparky";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);

    }

    @Test
    public void speakTest(){
        //Given
        Dog dog = new Dog("Blue", new Date(), 43);

        //When
        dog.speak();

        //Then
        Assert.assertEquals("bark!", dog.speak());


    }

    @Test
    public void setBirthdayTest(){
        //Given
        Dog dog = new Dog("Max", new Date(), 9);
        Date date = new Date();

        //When
        dog.setBirthDate(date);

        //Then
        Assert.assertEquals(date,dog.getBirthDate());

    }

    @Test
    public void eatTest(){
        //Given
        Dog dog = new Dog("Steve", new Date(),315);
        dog.getNumberOfMealsEaten();

        //When
        Assert.assertEquals(0, dog.getNumberOfMealsEaten(),0);
        dog.eat(new Food());

        //Then
        Assert.assertEquals(1, dog.getNumberOfMealsEaten(),0);


    }

    @Test
    public void getIdTest(){
        //Given
        Dog dog = new Dog("Clifford", new Date(), 410);

        //When
        int expected = 410;

        //Then
        Assert.assertEquals(expected, dog.getId(), 0);

    }

    @Test
    public void instanceOfAnimalTest(){
        //Given
        Dog dog = new Dog("Maxwell", new Date(),25);

        //Then
        Assert.assertTrue(dog instanceof Animal);

    }

    @Test
    public void instanceOfMammalTest(){
        //Given
        Dog dog = new Dog("Sheba", new Date(), 19);

        //Then
        Assert.assertTrue(dog instanceof Mammal);

    }
}
