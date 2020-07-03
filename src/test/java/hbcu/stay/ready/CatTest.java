package hbcu.stay.ready;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Mammal;
import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Cat;

import java.util.Date;


public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest(){
        //Given
        Cat cat = new Cat("Geralt",new Date(), 50);
        String newName = "V";

        //When
        cat.setName(newName);

        //Then
        Assert.assertEquals("V", cat.getName());
    }

    @Test
    public void speakTest(){
        //Given
        Cat cat = new Cat("Paul", new Date(), 1);

        //When
        cat.speak();

        //Then
        Assert.assertEquals("meow!", cat.speak());

    }

    @Test
    public void setBirthdayTest(){
        //Given
        Cat cat = new Cat("Tigger", new Date(), 8);
        Date date = new Date();

        //When
        cat.setBirthDate(date);

        //Then
        Assert.assertEquals(date,cat.getBirthDate());

    }

    @Test
    public void eatTest(){
        //Given
        Cat cat = new Cat("Goeffery", new Date(),99);
        cat.getNumberOfMealsEaten();

        //When
        Assert.assertEquals(0, cat.getNumberOfMealsEaten(),0);
        cat.eat(new Food());

        //Then
        Assert.assertEquals(1, cat.getNumberOfMealsEaten(),0);


    }

    @Test
    public void getIdTest(){
        //Given
        Cat cat = new Cat("Geoff", new Date(), 75);

        //When
        int expected = 75;

        //Then
        Assert.assertEquals(expected, cat.getId(), 0);


    }

    @Test
    public void instanceOfAnimalTest(){
        //Given
        Cat cat = new Cat("Lamp", new Date(),500);

        //Then
        Assert.assertTrue(cat instanceof Animal);

    }

    @Test
    public void instanceOfMammalTest(){
        //Given
        Cat cat = new Cat("Mattis", new Date(), 13);

        //Then
        Assert.assertTrue(cat instanceof Mammal);

    }
}
