package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Mammal;

import java.lang.invoke.CallSite;
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
            //Given
            Cat ct = new Cat("Sassy", givenBirthDate, 2);
            String expected = "Lousy";
            //When
            ct.setName("Lousy");
            String actual = ct.getName();

            //Then
            Assert.assertEquals(expected, actual);

    }

    @Test
    public void setBirthDateTest(){
        //Given
        Cat ct = new Cat("Sassy", givenBirthDate, 2);
        Calendar cl = Calendar.getInstance();
        cl.set(Calendar.YEAR, 2002);
        cl.set(Calendar.MONTH, Calendar.MAY);
        cl.set(Calendar.DAY_OF_MONTH, 4);
        Date expected = cl.getTime();

        //When
        ct.setBirthDate(expected);
        Date actual = ct.getBirthDate();

        //Then
        Assert.assertEquals(expected, actual);

}
@Test
        public void speakTest(){
            //Given
            Cat ct = new Cat("Sassy", givenBirthDate, 2);
            String expected = "meow!";
            //When
        
            String actual = ct.speak();

            //Then
            Assert.assertEquals(expected, actual);

    }

    @Test
        public void eatTest(){
            //Given
            Cat ct = new Cat("Sassy", givenBirthDate, 2);
            Food fd = new Food();
            int expected = 1;
            //When
            ct.eat(fd);
            int actual = ct.getNumberOfMealsEaten();

            //Then
            Assert.assertEquals(expected, actual);

    }
    @Test
    public void getIdTest(){
        //Given
        Cat ct = new Cat("Sassy", givenBirthDate, 2);
      
        //When
        int expected = 2;
        int actual = ct.getId();

        //Then
        Assert.assertEquals(expected, actual);

}
@Test
    public void animalInheritanceTest(){
        //Given
        Cat ct = new Cat("Sassy", givenBirthDate, 2);
      
        //When
        Boolean expected = true;
        Boolean actual = ct instanceof Animal;

        //Then
        Assert.assertEquals(expected, actual);

}
@Test
    public void mammalInheritanceTest(){
        //Given
        Cat ct = new Cat("Sassy", givenBirthDate, 2);
      
        //When
        Boolean expected = true;
        Boolean actual = ct instanceof Mammal;

        //Then
        Assert.assertEquals(expected, actual);

}



}
