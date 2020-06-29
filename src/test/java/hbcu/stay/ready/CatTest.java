package hbcu.stay.ready;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Mammal;

import java.util.Date;


public class CatTest {

    // Given (cat data)
    String givenName;
    Date givenBirthDate;
    Integer givenId;
    Cat cat;
    
    @Before
    public void instantiate() {
        givenName = "Zula";
        givenBirthDate = new Date();
        givenId = 0;
        cat =  new Cat(givenName, givenBirthDate, givenId);
    }

    @Test
    public void constructorTest() {

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
    public void setNameTest() {
        //Given
        String expectedName = "Sam";

        // When
        cat.setName("Sam");
        String actualName = cat.getName();

        // Then
        Assert.assertEquals("Testing .setName", expectedName, actualName);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void testSpeak() {
        String expectedSound = "meow!";

        String actualSound = cat.speak();

        Assert.assertEquals("testing for sound cat makes", expectedSound, actualSound);
    }

    @Test
    public void testEat() {
        // given
        int expectedNumMeals = 1;
        Food chowMix = new Food();

        //when
        cat.eat(chowMix);
        int actualNumMeals = cat.getNumberOfMealsEaten();

        Assert.assertEquals("testing whether arraylist of food increases size by one", expectedNumMeals, actualNumMeals);
    }

    @Test
    public void getIdTest() {
        int expectedId = 0;

        int actualId = cat.getId();

        Assert.assertEquals("tests whether the id returned is correct", expectedId, actualId);
    }
    
    @Test
    public void instanceOfAnimalTest() {
        boolean expectedAns = true;

        boolean actualAns = cat instanceof Animal;

        Assert.assertEquals("tests whether cat is an instance of Animal", expectedAns, actualAns);
    }

    @Test
    public void instanceOfMammalTest() {
        boolean expectedAns = true;

        boolean actualAns = cat instanceof Mammal;

        Assert.assertEquals("tests whether cat is an instance of Mammal", expectedAns, actualAns);
    }


    @After
    public void resetData() {
        cat.setName(givenName);
        cat.setBirthDate(givenBirthDate);
        //can't set id 
    }
    

}
