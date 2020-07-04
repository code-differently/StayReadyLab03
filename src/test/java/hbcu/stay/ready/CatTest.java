package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Mammal;

import java.util.Date;


public class CatTest {
    // Create tests for `void setName(String name)`
    @Test
    public void setnameTest(){
        //Given 
        Cat cattest = new Cat("kitty", new Date(),1);

        //When 
        cattest.setName("fluffy");
        //Then 
        String expected = "fluffy";
        String actual = cattest.getName();
        Assert.assertEquals(expected, actual);
    }

    // Create tests for `speak`
    @Test 
    public void catspeakTest()
    {
        //Given
        Cat cattest = new Cat("kitty", new Date(05052000),2);
        //When
        String expected = "meow!";
        String actual = cattest.speak();
        //Then
        Assert.assertEquals(expected, actual);
    }
    //  Create tests for `setBirthDate(Date birthDate)`
    public void BirthdayTest()
    {
        // Given
         Cat cattest = new Cat("kitty",new Date(),3);
        Date birthDate = new Date();
        // When 
        cattest.setBirthDate(birthDate);
        //Then 
        Date expected = birthDate;
        Date actual = cattest.getBirthDate();
        Assert.assertEquals(expected, actual);
    }
    // Create tests for `void eat(Food food)`
        @Test
        public void eatTest()
        {
            //Given 
            Cat cattest = new Cat("Kitty", new Date(), 4);
            Food catfood = new Food();
            //When
            cattest.eat(catfood);
            //Then
            int expected = 1; 
            int actual = cattest.getNumberOfMealsEaten();
            Assert.assertEquals(expected, actual, 0.0);
        }
    // Create tests for `Integer getId()`
        @Test 
        public void getIdTest()
        {
            //Given 
            Cat cattest= new Cat("Kitty", new Date(),5);
            
            //When 
            Integer expected = 5;
            Integer actual = cattest.getId();
            //Then 
            Assert.assertEquals(expected, actual);
        }
    //Create test to check Animal inheritance; google search `java instanceof keyword`
        @Test 
        public void animalTest()
        {
            //Given 
            Cat cattest = new Cat("Kitty", new Date(), 5);
            //When 
            Boolean expected = true;
            Boolean actual = cattest instanceof Animal;
            //Then
           Assert.assertEquals(expected, actual);
        }

    //Create test to check Mammal inheritance; google search `java instanceof keyword`
        @Test 
        public void MammalTest()
        {
            //Given 
            Cat cattest = new Cat("Kitty", new Date(),6);
            //When 
            Boolean expected = true; 
            Boolean actual = cattest instanceof Mammal;
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
