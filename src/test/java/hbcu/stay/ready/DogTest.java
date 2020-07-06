package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Mammal;


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
    public void speakTest()
    {
        // gievn
        Dog dog = new Dog("Jay", null, 01);

        String expected = "bark!";

        // when 

        String actual = dog.speak();

        // then 

        Assert.assertEquals(expected, actual);

    }

    @Test

    public void setBirthDateTest()
    {
        // given 

        Dog dog = new Dog("Jason", new Date(), 03);

        Date d = new Date();

        dog.setBirthDate(d);

        Date expected = d;

        // when 

        Date actual = dog.getBirthDate();
        
        // then 

        Assert.assertEquals(expected, actual);
    }

    @ Test 
    public void eatTest()
    {
        // Given 

        Dog dog = new Dog("Specer", new Date(), 04);

        // When 

        Food food = new Food();

        dog.eat(food);

        Integer expected = 1;

        Integer actual = dog.getNumberOfMealsEaten();

        // then 

        Assert.assertEquals(expected, actual);
    }

    @Test 
    public void idTest()
    {
        // given 
        Dog dog = new Dog("Susan", new Date(), 05);

        Integer expected = 05; 

        //when 

        Integer actual = dog.getId();

        // Theb 
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void inheritanceAnimalTest()
    {
        Dog dog = new Dog("BO", new Date(), 06);

        Boolean expected = true;

        // when 

        Boolean actual = dog instanceof Animal;

        // then 

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void inheritanceMammalTest()
    {
        Dog dog = new Dog("Guss", new Date(), 07);

        Boolean expected = true;

        // when 

        Boolean actual = dog instanceof Mammal;

        // then 

        Assert.assertEquals(expected, actual);
    }
    
    
}
