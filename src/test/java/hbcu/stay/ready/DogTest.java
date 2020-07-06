package hbcu.stay.ready;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Mammal;


public class DogTest {
     // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test 
    public void TestforDog(){
        
        String name = "Mary";
        Date birthDate = new Date();
        Integer id = 2;
        Dog test = new Dog(name, birthDate, id);

        String actName = test.getName();
        Date actDate = test.getBirthDate();
        Integer actId = test.getId();

        Assert.assertEquals(name, actName);
        Assert.assertEquals(birthDate, actDate);
        Assert.assertEquals(id, actId);



    }
    // TODO - Create tests for `speak`
    @Test 
    public void SpeakTest(){
        Dog dog = new Dog("Rufus", new Date(), 01);

        String test = dog.speak();

        test = "bark!";


        assertEquals(dog.speak(), test);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthday(){
        Dog dog = new Dog("Rufus", new Date(), 01);

        Date birthDay = new Date();
        dog.setBirthDate(birthDay);

        Date expected = birthDay;
        Date actual = dog.getBirthDate();
    
        Assert.assertEquals(expected, actual);

    }
    // TODO - Create tests for `void eat(Food food)`
    @Test 
    public void foodEaten(){
        
        Dog dog = new Dog("Harry", new Date(), 01);
        Food food= new Food();

        dog.eat(food);
        Integer expected = 1;
        Integer actual = dog.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);


    }        

    
  
    

    // TODO - Create tests for `Integer getId()`
    @Test 
    public void checkID(){
        Dog dog = new Dog("Rufus", new Date(), 01);

        Dog animal = new Dog("Rufus", new Date(), 01);


        assertEquals(dog.getId(), animal.getId());
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void checkAnimal(){
        Dog d = new Dog("Rufus", new Date(), 01);
        Boolean expected  = true;
        Boolean actual = d instanceof Animal;

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void checkMammal(){
        Dog d = new Dog("Rufus", new Date(), 01);
        Boolean expected  = true;
        Boolean actual = d instanceof Mammal;

        Assert.assertEquals(expected, actual);
    }
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
}
