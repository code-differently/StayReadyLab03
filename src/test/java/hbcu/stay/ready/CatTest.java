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
    public void setNameTest(){
        // Given
        Cat cat = new Cat("Pablo", new Date(), 01);
        String expected = "Killua";

        // when
        cat.setName("Killua");

        String actual = cat.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void speakTest(){
        // Given
        Cat cat = new Cat("Morel", new Date(), 02);
        String expected = "meow!";

        // When
        String actual = cat.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest(){
        // Given
        Cat cat = new Cat("Gon", new Date(), 03);
        Date birthDate = new Date();
        cat.setBirthDate(birthDate);
        Date expected = birthDate;
        // When
        Date actual = cat.getBirthDate();
        // Then
        Assert.assertEquals(expected, actual);


    }

    @Test

    public void eatTest(){
        // Given
        Cat cat = new Cat("Hisoka", new Date(), 04);
        // When
        Food food = new Food();
        cat.eat(food);
        Integer expected = 1;
        Integer actual = cat.getNumberOfMealsEaten();
        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getIdTest(){
        // Given
        Cat cat = new Cat("Illumi", new Date(), 05);
        Integer expected = 05;
        // When
        Integer actual = cat.getId();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void AnimalInheritanceTest(){
        // Given
        Cat cat = new Cat("Chrollo", new Date(), 06);
        Boolean expected = true;
        // When 
        Boolean actual = cat instanceof Animal;
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void MammalInheritanceTest(){
        // Given
        Cat cat = new Cat("Leorio", new Date(), 07);
        Boolean expected = true;
        // When
        Boolean actual = cat instanceof Mammal;
        // Then
        Assert.assertEquals(expected, actual);
    }

}
