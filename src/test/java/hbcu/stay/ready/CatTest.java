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
    Cat catT;

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
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
        catT = new Cat("TestCat", givenBirthDate, 0);

        // When
        String expectedName = "namaste";
        catT.setName(expectedName);
        String actualName = catT.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setBirthDateTest() {
        // Given
        catT = new Cat("TestCat", givenBirthDate, 0);

        // When
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1998);
        cal.set(Calendar.MONTH, Calendar.OCTOBER);
        cal.set(Calendar.DAY_OF_MONTH, 15);
        Date expectedDate = cal.getTime();;
        catT.setBirthDate(expectedDate);
        Date actualDate = catT.getBirthDate();

        // Then
        Assert.assertEquals(expectedDate, actualDate);
    }

    @Test
    public void speakTest() {
        // Given
        catT = new Cat("TestCat", givenBirthDate, 0);

        // When
        String expectedValue = "meow!";
        catT.speak();
        String actualValue = catT.speak();

        // Then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void eatTest() {
        // Given
        catT = new Cat("TestCat", givenBirthDate, 0);
        Food apple = new Food();

        // When
        int expectedValue = 1;
        catT.eat(apple);
        int actualValue = catT.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expectedValue, actualValue);
    }

    public void getIdTest() {
        // Given
        catT = new Cat("TestCat", givenBirthDate, 0);

        // When
        int expectedValue = 0;
        int actualValue = catT.getId();

        // Then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void animalInheritanceTest() {
        // Given
        catT = new Cat("TestCat", givenBirthDate, 0);

        // When
        Boolean expectedValue = true;
        Boolean actualValue = catT instanceof Animal;

        // Then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void mammalInheritanceTest() {
        // Given
        catT = new Cat("TestCat", givenBirthDate, 0);

        // When
        Boolean expectedValue = true;
        Boolean actualValue = catT instanceof Mammal;

        // Then
        Assert.assertEquals(expectedValue, actualValue);
    }

}
