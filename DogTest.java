package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import jdk.jfr.Timestamp;


public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    
   
    @Test
        public void newDogTest(){
        //Given

        //When

        //Then
} 

    @Test
    public void speakTest(){
        //Given
        Dog dog = new Dog ("Junior", new Date(), 1);

        //When
        String test = dog.speak();
        test = "bark!";

        //Then
        Assert.assertEquals(expected, actual);
}

    @Test
    public void setBirthDate(){
        //Given
        Dog dog = new Dog ("Junior", new Date(), 1);
        Date birthday = new Date();
        dog.setBirthDate(birthday);

        //When
        Date expected = birthday;
        Date actual = dog.getBirthDate();

        //Then
        Assert.assertEquals(expected, actual);
}

    @Test
    public void eatTest(){
        //Given

        //When
        Food food = new Food();
        dog.eat(food);
        Integer expected = 1;
        Integer actual = dog.getNumberOfMeals();

        //Then
        Assert.assertEquals(expected, actual);
}

    @Test
    public void getIdTest(){
        //Given
        Dog dog = new Dog ("Junior", new Date(), 1);

        //When
        Dog animal = new Dog ("Junior", new Date(), 1);
    
        //Then
        Assert.assertEquals(dog.getId(), animal.getId());
}

    @Test
    public void animalInheritanceTest(){   
        //Given
        Dog dog = new Dog ("Junior", new Date(), 1);

        //When
        Boolean expected = true;
        Boolean actual = dog instanceof Animal;

        //Then
        Assert.assertEquals(expected, actual);
}

    @Test
    public void mammalInheritanceTest(){
        //Given
        Dog dog = new Dog ("Junior", new Date(), 1);

        //When
        Boolean expected = true;
        Boolean actual = dog instanceof Mammal;

        //Then
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
