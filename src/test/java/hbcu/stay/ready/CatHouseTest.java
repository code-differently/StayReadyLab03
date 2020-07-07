package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_storage.CatHouse;

public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    Cat cat;

    @Before
    public void setup() {
        this.cat = new Cat(null, null, null);
    }

@Test
public void addTest(){
    //given 
    Dog dog = new Dog ("Chance", new Date(), 4);

    //when 
    CatHouse.add(Cat);
    Int expected = 1;
    Int actual = CatHouse.getNumberofCats();

    //then
    Assert.assertEquals(expected, actual);

@Test
public void removeIntIdTest(){
    //given
    Cat cat = new Cat ("Oreo", new Date(), 4);

    //When
    CathHouse.add(cat);
    CatHouse.remove(4);
    Int expected = 0;
    Int actual = CatHouse.getNumberofCats();

    //then 
    Assert.assertEquals("See if animal was removed", expectedName, actualName);
    Assert.assertEquals("See if animal was removed", expectedDate, actualDate);
    Assert.assertEquals("See if animal was removed", expectedId, actualId);
)

@Test
public void CatHouseTest(){
    //given 
    CatHouse cat = new CatHouse();
    CatHouse box - new CatHouse();
    int catExpected = 1;

    //when
    box.ass(cat);
    int catActual = box.add(cat);

    //then
    Assert.assertArrayEquals("add cat", catExpected, catActuals);

}

@Test
public void removeTest(){
    //given 
    Cat cat = new Cat ("Oreo", new Date(), 4);
    
    //when
    CatHouse.add(cat);
    CatHouse.remove(4);
    Int expected = 0;
    Int actual = CatHouse.getNumberofCats();

   //then
   Assert.assertEquals(expected, actual);

}
}

