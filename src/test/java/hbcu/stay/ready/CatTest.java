package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Mammal;




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
    public void setNameTest()
    {
        // given
        Cat cat = new Cat("jake", new Date(), 01);

        String expected = "Sally";

        // when

        cat.setName("Sally");

        String actual = cat.getName();

        // then 

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest()
    {
        // given 

        Cat cat = new Cat("Naruto", new Date(), 02);

        String expected = "meow!";

        // when 

        String actual = cat.speak();

        // Then

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void setBirthDateTest()
    {
        // given 

        Cat cat = new Cat("Jason", new Date(), 03);

        Date d = new Date();

        cat.setBirthDate(d);

        Date expected = d;

        // when 

        Date actual = cat.getBirthDate();
        
        // then 

        Assert.assertEquals(expected, actual);
    }
    @ Test 
    public void eatTest()
    {
        // Given 

        Cat cat = new Cat("Specer", new Date(), 04);

        // When 

        Food food = new Food();

        cat.eat(food);

        Integer expected = 1;

        Integer actual = cat.getNumberOfMealsEaten();

        // then 

        Assert.assertEquals(expected, actual);
    }

    @Test 
    public void idTest()
    {
        // given 
        Cat cat = new Cat("Susan", new Date(), 05);

        Integer expected = 05; 

        //when 

        Integer actual =cat.getId();

        // Theb 
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void inheritanceAnimalTest()
    {
        Cat cat = new Cat("katy", new Date(), 06);

        Boolean expected = true;

        // when 

        Boolean actual = cat instanceof Animal;

        // then 

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void inheritanceMammalTest()
    {
        Cat cat = new Cat("Anthony", new Date(), 07);

        Boolean expected = true;

        // when 

        Boolean actual = cat instanceof Mammal;

        // then 

        Assert.assertEquals(expected, actual);
    }

    



}
