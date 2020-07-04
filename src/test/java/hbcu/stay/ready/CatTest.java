package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Mammal;

import java.util.Date;


public class CatTest {

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
        Cat cat = new Cat("Pablo", new Date(), 01);
        
        cat.setName("Zeus");
        String actual = cat.getName();
        String expected = "Zeus";

        Assert.assertEquals(expected, actual);
    }

   @Test
    public void setBirthDateTest(){
        Cat cat = new Cat("Smoke", null, 02);

        cat.setBirthDate(new Date());
        Date actual = cat.getBirthDate();
        Date expected = new Date();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        Cat cat = new Cat("Smoke", new Date(), 02);

        String actual = cat.speak();
        String expected = "meow!";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest(){
        Cat cat = new Cat("kitty", new Date(), 01);
        Food catFood = new Food();

        cat.eat(catFood);
        int actual = cat.getNumberOfMealsEaten();
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest(){
        Cat cat = new Cat("Smoke", new Date(), 02);

        Integer actual = cat.getId();
        Integer expected = 02;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkAnimalInheritance(){
        Cat cat = new Cat("Smoke", new Date(), 01);

        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void checkMammalInheritance(){
        Cat cat = new Cat("Smoke", new Date(), 01);

        Assert.assertTrue(cat instanceof Mammal);
    }
}
