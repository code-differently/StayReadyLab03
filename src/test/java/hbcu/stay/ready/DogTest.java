package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Mammal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DogTest {
    // Given (dog data)
    String givenName, expectedOutput;
    Date givenBirthDate;
    Integer givenId;
    Dog dog;

    @Before
    public void initialize() {
        givenName = "Peanut";
        givenBirthDate = new Date();
        givenId = 0;
        // Given (a name exists and a dog exists)
        dog = new Dog(givenName, givenBirthDate, givenId);
        expectedOutput = dog.toString();
    }

    @Test
    public void constructorTest() {
        String actualOutput = dog.toString();

        Assert.assertTrue("testing to see if the variables are the same", actualOutput.equals(expectedOutput));
    }

    @Test
    public void toStringTest() {
        String actualOutput = dog.toString();

        Assert.assertTrue("testing to see if the variables are the same", actualOutput.equals(expectedOutput));
    }

    @Test
    public void setNameTest() {
        
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals("setting name", dogName, givenName);
    }

    @Test
    public void setBirthDateTest() {
        //given
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        //July 24, 2025 at 3:32 and 42 seconds pm
        String dateInString = "24-07-2025 15:32:42";
        Date expectedDate = new Date();
		try {
			expectedDate = sdf.parse(dateInString);
		} catch (ParseException e) {
			e.printStackTrace();
        }
        
        //when
        dog.setBirthDate(expectedDate);
        Date actualDate = dog.getBirthDate();

        Assert.assertEquals("testing if the date is the same", expectedDate, actualDate);
    }

    @Test
    public void speakTest() {
        String expectedVal = "bark!";

        String actualVal = dog.speak();

        Assert.assertEquals("testing dog speak", expectedVal, actualVal);
    }

    @Test
    public void testEat() {
        // given
        int expectedNumMeals = 1;
        Food ramen = new Food();

        // when
        dog.eat(ramen);
        int actualNumMeals = dog.getNumberOfMealsEaten();

        //then
        Assert.assertEquals("testing whether arraylist in dog gets updated in size after eating something", expectedNumMeals, actualNumMeals);
    }    

    @Test
    public void getIdTest() {
        // given
        int expectedId = 0;

        // when
        int actualId = dog.getId();

        //then
        Assert.assertEquals("testing dog id", expectedId, actualId);
    }   

    @Test
    public void instanceOfAnimalTest() {
        boolean expectedAns = true;

        boolean actualAns = dog instanceof Animal;

        Assert.assertEquals("tests whether dog is an instance of Animal", expectedAns, actualAns);
    }

    @Test
    public void instanceOfMammalTest() {
        boolean expectedAns = true;

        boolean actualAns = dog instanceof Mammal;

        Assert.assertEquals("tests whether dog is an instance of Mammal", expectedAns, actualAns);
    }

    @After
    public void resetData() {
        dog.setName(givenName);
        dog.setBirthDate(givenBirthDate);
        //can't set id
    }
    
}
