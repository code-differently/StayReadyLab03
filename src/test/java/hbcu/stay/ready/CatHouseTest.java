package hbcu.stay.ready;


import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_storage.CatHouse;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addCat(){
        //Given
        CatHouse catHouse = new CatHouse();
        catHouse.getNumberOfCats();

        //When
        Assert.assertEquals(0, catHouse.getNumberOfCats(),0);
        catHouse.add(new Cat("Cindy",new Date(), 35));


        //Then
        Assert.assertEquals(1, catHouse.getNumberOfCats(),0);

    }

    @Test
    public void removeCatById(){
        //Given
        CatHouse catHouse = new CatHouse();
        final int ID = 271;


        //When
        catHouse.add(new Cat("Phantom",new Date(), ID));
        Assert.assertEquals(1, catHouse.getNumberOfCats(),0);

        //Then
        catHouse.remove(ID);
        Assert.assertEquals(0, catHouse.getNumberOfCats(),0);

    }

    @Test
    public void removeCatByCat(){
        //Given
        Cat cat = new Cat("Freddy", new Date(), 512);
        CatHouse catHouse = new CatHouse();

        //When
        catHouse.add(cat);
        Assert.assertEquals(1, catHouse.getNumberOfCats(),0);

        //Then
        catHouse.remove(cat);
        Assert.assertEquals(0, catHouse.getNumberOfCats(),0);



    }

    @Test
    public void getCatById(){
        //Given
        CatHouse catHouse = new CatHouse();
        final int ID = 108;

        //When
        catHouse.add(new Cat("SkinnyPete", new Date(), ID));
        Cat retrievedCat = catHouse.getCatById(ID);

        //Then
        Assert.assertEquals(108, retrievedCat.getId(),0);

    }

    @Test
    public void getNumberOfCats(){
        //Given
        CatHouse catHouse = new CatHouse();


        //When
        catHouse.add(new Cat("Jerry", new Date(),83 ));

        //Then
        Assert.assertEquals(1,catHouse.getNumberOfCats(),0);

    }
}
