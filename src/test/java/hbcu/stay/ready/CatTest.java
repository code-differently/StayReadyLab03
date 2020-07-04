package hbcu.stay.ready;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Mammal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CatTest {

    // Given (cat data)
    String givenName, expectedOutput;
    Date givenBirthDate;
    Integer givenId;
    Cat cat;
    
    @Before
    public void instantiate() {
        givenName = "Zula";
        givenBirthDate = new Date();
        givenId = 0;
        cat =  new Cat(givenName, givenBirthDate, givenId);
        expectedOutput = cat.toString();
    }

    @Test
    public void constructorTest() {
        String actualOutput = cat.toString();

        Assert.assertTrue("testing to see if the variables are the same", actualOutput.equals(expectedOutput));
    }

    @Test
    public void toStringTest() {
        String actualOutput = cat.toString();

        Assert.assertTrue("testing to see if the variables are the same", actualOutput.equals(expectedOutput));
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

    @Test
    public void setBirthDateTest() {
        //given
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        //June 28, 2056 at 2:12 and 32 seconds pm
        String dateInString = "28-06-2056 14:12:32";
        Date expectedDate = new Date();
		try {
			expectedDate = sdf.parse(dateInString);
		} catch (ParseException e) {
			e.printStackTrace();
        }
        
        //when
        cat.setBirthDate(expectedDate);
        Date actualDate = cat.getBirthDate();

        Assert.assertEquals("testing if the date is the same", expectedDate, actualDate);
    }

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
