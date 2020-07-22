package hbcu.stay.ready;

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
    public void setNameTest(){
        //Given
        Cat cat = new Cat ("Suzy", new Date(), 4);
        cat.setName("Jim");

        //When
        String expected = "Jim";
        String actual = cat.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        //Given
        Cat cat = new Cat ("Suzy", new Date(), 4);

        //When
        String expected = "meow";
        String actual = cat.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest(){
        //Given
        Cat cat = new Cat ("Suzy", new Date(), 4);
        Date birthday = new Date();
        cat.setBirthDate(birthday);

        //When
        Date expected = birthday;
        Date actual = cat.getBirthDate();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest(){
        //Given
        Cat cat = new Cat ("Suzy", new Date(), 4);
        Food food = new Food();
        cat.eat(food);

        //When
        int expected = 2;
        int actual = cat.getEatenMeals();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest(){
        //Given
        Cat cat = new Cat ("Suzy", new Date(), 4);

        //When
        Integer expected = 5;
        Integer actual = cat.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void animalInheritanceTest(){
        //Given
        Cat cat = new Cat ("Suzy", new Date(), 4);

        //When
        Boolean expected = true;
        Boolean actual = cat instanceof Animal;

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mammalInheritanceTest(){
        //Given
        Cat cat = new Cat ("Suzy", new Date(), 4);

        //When
        Boolean expected = true;
        Boolean actual = cat instanceof Mammal;

        //Then
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
