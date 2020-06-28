package hbcu.stay.ready;

import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Mammal;


public class DogTest {
    Date givenBirthDate = new Date();
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test 
    public void setBirthdateTest(){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1998);
        cal.set(Calendar.MONTH, Calendar.MARCH);
        cal.set(Calendar.DAY_OF_MONTH, 12);
        Date expected = cal.getTime(); 
        Dog dog = new Dog("Skittles", givenBirthDate, 23);

        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();

        Assert.assertEquals(expected, actual);
    }

    @Test 
    public void speakTest(){
        Dog dog = new Dog("Lucious", givenBirthDate, 26); 
        String expected = "bark!";

        String actual = dog.speak(); 

        Assert.assertEquals(expected, actual);
    }

    @Test 
    public void eatTest(){
        Dog dog = new Dog("Lucious", givenBirthDate, 26); 
        Food food = new Food();
        int expected = 1; 

        dog.eat(food);
        int actual = dog.getNumberOfMealsEaten(); 

        Assert.assertEquals(expected, actual);
    }

    @Test 
    public void getIdTest(){
        Dog dog = new Dog("Skittles", givenBirthDate, 23); 
        int expected = 23; 
        int actual = dog.getId(); 
    
        Assert.assertEquals(expected, actual);
    }

    @Test 
    public void animalInheritanceTest(){
        Dog dog = new Dog("Skittles", givenBirthDate, 23); 
        Boolean expected = true; 

        Boolean actual = dog instanceof Animal;

        Assert.assertEquals(expected, actual);
        //Assert.assertThat(new Dog("Skittles", givenBirthDate, 23), instanceOf(Animal.class));
    }

    @Test 
    public void dogInheritanceTest(){
        Dog dog = new Dog("Skittles", givenBirthDate, 23); 
        Boolean expected = true; 

        Boolean actual = dog instanceof Mammal;

        Assert.assertEquals(expected, actual);
    }

}
