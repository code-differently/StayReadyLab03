package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Mammal;

import java.util.Calendar;
import java.util.Date;


public class CatTest {
    Date givenBirthDate = new Date();
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
        Cat cat = new Cat("Skittles", givenBirthDate, 23); 
        String expected = "Casey"; 

        cat.setName("Casey"); 
        String actual = cat.getName(); 

        Assert.assertEquals(expected, actual);
    }

    @Test 
    public void setBirthdateTest(){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1998);
        cal.set(Calendar.MONTH, Calendar.MARCH);
        cal.set(Calendar.DAY_OF_MONTH, 12);
        Date expected = cal.getTime(); 
        Cat cat = new Cat("Skittles", givenBirthDate, 23);

        cat.setBirthDate(expected);
        Date actual = cat.getBirthDate();

        Assert.assertEquals(expected, actual);
    }

    @Test 
    public void speakTest(){
        Cat cat = new Cat("Lucious", givenBirthDate, 26); 
        String expected = "meow!";

        String actual = cat.speak(); 

        Assert.assertEquals(expected, actual);
    }

    @Test 
    public void eatTest(){
        Cat cat = new Cat("Lucious", givenBirthDate, 26); 
        Food food = new Food();
        int expected = 1; 

        cat.eat(food);
        int actual = cat.getNumberOfMealsEaten(); 

        Assert.assertEquals(expected, actual);
    }

    @Test 
    public void getIdTest(){
        Cat cat = new Cat("Skittles", givenBirthDate, 23); 
        int expected = 23; 
        int actual = cat.getId(); 
    
        Assert.assertEquals(expected, actual);
    }

    @Test 
    public void animalInheritanceTest(){
        Cat cat = new Cat("Skittles", givenBirthDate, 23); 
        Boolean expected = true; 

        Boolean actual = cat instanceof Animal;

        Assert.assertEquals(expected, actual);
        //Assert.assertThat(new Cat("Skittles", givenBirthDate, 23), instanceOf(Animal.class));
    }

    @Test 
    public void catInheritanceTest(){
        Cat cat = new Cat("Skittles", givenBirthDate, 23); 
        Boolean expected = true; 

        Boolean actual = cat instanceof Mammal;

        Assert.assertEquals(expected, actual);
    }


}
