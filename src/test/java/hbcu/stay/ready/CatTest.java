package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;
import hbcu.stay.ready.animals.Cat;

import java.util.Date;

@Test
public void setNameTest() {
        
    // Given (cat data)
        Cat cat = new Cat("Oreo", newDate(), 01);
        cat.setName("Honey");

    // When (a cat is constructed)
    String expected = "Honey";
    String actual = cat.getName();

    // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, actual);
}

@Test 
public void setBirthDate() {
    // Given (cat data)
    Cat cat = new Cat("Oreo", newDate(), 01);
    String expected= "Matt";
    // When (a cat is constructed)
    Cat.setName("Matt");
    String actual = cat.getName();

    // Then (we expect the given data, to match the retrieved data)
    Assert.assertEquals("testing the name of the cat", expected, actual);

}

@Test 
public void speakTest() {
    
    // Given (cat data)
    Cat cat = new Cat("Oreo", newDate(), 01);
    // When 
    String expected= "Meow";
    String actual = cat.speak();
    // Then 
    Assert.assertEquals(expected,actual);
}

@Test
public void setBirthDateTest(){

    //given 
    Cat cat = new Cat("Oreo", new Date(), 4);
    Date birthdate = new Date();
    cat.setBirthDate(birthdate);

    //when 
    Date expected = birthdate;
    Date actual = cat.getBirthDate;

    //then
    Assert.assertEquals(expected, actual);
}

@Test
public void eatTest() {

    // Given (cat data)
    Cat cat = new Cat("Oreo", newDate(), 01);
    String expected= "Matt";
    // When (a cat is constructed)
    Cat.setName("Matt");
    String actual = cat.getName();

    // Then (we expect the given data, to match the retrieved data)
    Assert.assertEquals("testing the name of the cat", expected, actual);

@Test 
public void getId() {
    // Given (cat data)
    Cat cat = new Cat("Oreo", newDate(), 01);
    String expected= "Matt";
    // When (a cat is constructed)
    Cat.setName("Matt");
    String actual = cat.getName();

    // Then (we expect the given data, to match the retrieved data)
    Assert.assertEquals("testing the name of the cat", expected, actual);
}

@Test 
public void AnimalInheritanceTest(){
    Cat cat = new Cat(null, null, null);
    boolean expected = true;
    boolean actual = cat instanceof Animal;

    Assert.assertEquals(expected,actual);
}

@Test
public void MammalInheritanceTest(){

    Cat cat = new Cat(null, null, null);
    boolean expected = true;
    boolean actual = cat instanceof Mammal;

    Assert.assertEquals(expected, actual);
}



