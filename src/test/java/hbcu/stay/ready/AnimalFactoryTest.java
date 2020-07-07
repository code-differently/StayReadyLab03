package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Test;

import hbcu.stay.ready.animals.Cat;


public class AnimalFactoryTest{
// Create test for 'Animal createDog(String name, Date birthdate)'

@Test
public void createCatTest(){
    //given  
    Date birthDate = new Date();
    Cat cat = AnimalFactory.createCat("Oreo", birthDate);

    //when 
    Cat actual = cat;
    Cat expected = new Cat("Oreo", birthDate, 1);
    
    //then
    Assert.assertEquals(expected, actual);

}

@Test
public void createDogTest(){
    //given 
    Date birthDate = new Date();
    Dog dog = AnimalFactory.createDog("Remi", birthDate);

    //when 
    Dog actual = dog;
    Dog expected = new Dog("Remi", birthDate, 1);
    
    //then
    Assert.assertEquals(expected, actual);


