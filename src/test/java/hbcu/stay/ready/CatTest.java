package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Mammal;

import java.util.Date;


public class CatTest {
    // TODO - Create tests for `void setName(String name)`
   @Test
   public void setNameTest(){
    Cat cat = new Cat("Tina", new Date(), 3);

    cat.setName("Tom");

    String expected = "Tom";
    String actual = cat.getName();
    Assert.assertEquals(expected, actual);

   }
    // TODO - Create tests for `speak`
    @Test 
    public void CatSpeakTest(){
    Cat cat = new Cat("Tina", new Date(), 3);

    String expected = "meow!";
    String actual = cat.speak();
    Assert.assertEquals(expected, actual);


    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void BirthdayTest(){
        Cat cat = new Cat("Tina", new Date(), 3);
        Date birthDay = new Date();

        cat.setBirthDate(birthDay);
        
        Date expected = birthDay;
        Date actual = cat.getBirthDate();

        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        Cat cat = new Cat("Tina", new Date(), 3);
        Food food = new Food();
        
        cat.eat(food);

        int expected = 1; 
        int actual = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getId()`
    @Test 
    public void getIdTest(){
        Cat cat = new Cat("Tina", new Date(), 3);
        
        Integer expected = 3;
        Integer actual = cat.getId();

        Assert.assertEquals(expected, actual);

    }
    
    
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void AnimalTest(){

        Cat cat = new Cat("Tina", new Date(), 1);

        Boolean expected  = true;
        Boolean actual = cat instanceof Animal;

        Assert.assertEquals(expected, actual);

    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void MammalTest(){

        Cat cat = new Cat("Tina", new Date(), 1);

        Boolean expected  = true;
        Boolean actual = cat instanceof Mammal;

        Assert.assertEquals(expected, actual);

    }

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

}
