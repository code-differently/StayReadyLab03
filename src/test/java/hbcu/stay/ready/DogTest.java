package hbcu.stay.ready;
import java.util.Calendar;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Animal;
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
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setBirthDateTest(){
        //Given
        Dog ct = new Dog("Sassy", givenBirthDate, 2);
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
            Dog ct = new Dog("Sassy", givenBirthDate, 2);
            String expected = "bark!";
            //When
        
            String actual = ct.speak();

            //Then
            Assert.assertEquals(expected, actual);

    }

    @Test
        public void eatTest(){
            //Given
            Dog ct = new Dog("Sassy", givenBirthDate, 2);
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
        Dog ct = new Dog("Sassy", givenBirthDate, 2);
      
        //When
        int expected = 2;
        int actual = ct.getId();

        //Then
        Assert.assertEquals(expected, actual);

}
@Test
    public void animalInheritanceTest(){
        //Given
        Dog dd = new Dog("Sassy", givenBirthDate, 2);
      
        //When
        Boolean expected = true;
        Boolean actual = dd instanceof Animal;

        //Then
        Assert.assertEquals(expected, actual);

}
@Test
    public void mammalInheritanceTest(){
        //Given
        Dog dd = new Dog("Sassy", givenBirthDate, 2);
      
        //When
        Boolean expected = true;
        Boolean actual = dd instanceof Mammal;

        //Then
        Assert.assertEquals(expected, actual);

}
}
