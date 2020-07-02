package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Cat;
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
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Cat cat = new Cat(null, null, null);
        String givenName = "Zula";

        // When (a dog's name is set to the given name)
        cat.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);
    }

    @Test
    public void setcatBday(){

        // Given 
        Cat cat = new Cat(null, null, null);
        Date expectedVal = new Date();
        // When 
        
        cat.setBirthDate(expectedVal);
        Date actualVal = cat.getBirthDate();

        // Then 
        Assert.assertEquals(expectedVal, actualVal);


    }

    @Test
    public void catSpeakTest(){

        // Given 
        Cat cat = new Cat(null, null, null);
        String expectedVal = "meow!";

        // When 
        String actualval = cat.speak();

        // Then 
        Assert.assertEquals(expectedVal, actualval);


    }

    @Test
    public void catEatTest(){

        // Given 
        Food fo = new Food(); 
        Cat cat = new Cat(null, null, null);
        int expectedVal = cat.getNumberOfMealsEaten() + 1;

        // When 
        cat.eat(fo);
        int actualval = cat.getNumberOfMealsEaten();

        // Then 
        Assert.assertEquals(expectedVal, actualval);


    }


    @Test
    public void catInhOfAniTest(){

        // Given 
        Cat cat = new Cat(null, null, null);
        boolean expectedVal = true;

        // When 
        boolean actualval = cat instanceof Animal;

        // Then 
        Assert.assertEquals(expectedVal, actualval);


    }

    @Test
    public void catInhOfMamTest(){

        // Given 
        Cat cat = new Cat(null, null, null);
        boolean expectedVal = true;

        // When 
        boolean actualval = cat instanceof Mammal;
        
        // Then 
        Assert.assertEquals(expectedVal, actualval);


    }


    

}
