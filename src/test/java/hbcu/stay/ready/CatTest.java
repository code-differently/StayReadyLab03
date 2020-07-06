package hbcu.stay.ready;


import org.junit.Assert;
import org.junit.Before;
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

    // Given ( data)
    String expectedName;
    Date expectedBirthDate;
    Integer expectedId;
    Cat cat;
    @Before

    public void setUp(){
        expectedName = "Juju";
        expectedBirthDate = new Date();
        expectedId = 3;
        cat = new Cat(expectedName, expectedBirthDate, expectedId);
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

    @Test
    public void setNameTest() {
        // Given
        String expectedName = "Julia";

        // When
        cat.setName(expectedName);
        String actualName = cat.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest() {
        //Given
        String expected = "meow!";

        //when
        String actual = cat.speak();
        
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest() {
        // Given
        Date expectedBirthDate = new Date();

        //When
        cat.setBirthDate(expectedBirthDate);
        Date actualBirthDate = cat.getBirthDate();

        //Then
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }

    @Test
    public void eatTest() {
        //Given
        Food cherries = new Food();
        int expected = 1;

        //When
        cat.eat(cherries);
        int actual = cat.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest() {
        //Given
        Integer expectedId = 404;

        //When
        Cat cat = new Cat(expectedName, expectedBirthDate, expectedId);
        Integer actualId = cat.getId();

        //Then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void animalInheritenceTest() {
        // Given
        boolean expected= true;

        // When
        boolean actual = cat instanceof Animal;

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mammmalInheritenceTest() {
        // Given
        boolean expected = true;

        // When
        boolean actual = cat instanceof Mammal;

        // Then
        Assert.assertEquals(expected, actual);
    }
}
