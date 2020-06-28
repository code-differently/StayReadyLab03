package hbcu.stay.ready;

import java.util.Date;

import javax.annotation.Generated;

import org.junit.Test;

import hbcu.stay.ready.animals.Cat;
import hbcu.stay.ready.animals.animal_creation.AnimalFactory;
import hbcu.stay.ready.animals.animal_storage.CatHouse;
import junit.framework.Assert;

public class CatHouseTest 
{
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addCatTest()
    {
        //Given
        CatHouse catHouse = new CatHouse();
        int expectedCats = 3;

        //When
        AnimalFactory animalFactory = new AnimalFactory();
        
        catHouse.add(animalFactory.createCat("Sylvester", new Date()));
        catHouse.add(animalFactory.createCat("Cathy", new Date()));
        catHouse.add(animalFactory.createCat("Buttons", new Date()));

        int actualCats = catHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expectedCats, actualCats);
    }

    @Test
    public void removeIdTest()
    {
        //Given
        CatHouse catHouse = new CatHouse();
        int expectedCats = 2;

        //When
        AnimalFactory animalFactory = new AnimalFactory();

        catHouse.add(animalFactory.createCat("Sylvester", new Date()));
        catHouse.add(animalFactory.createCat("Cathy", new Date()));
        catHouse.add(animalFactory.createCat("Buttons", new Date()));

        catHouse.remove(1); //Should remove Cathy, whose Id is 1

        int actualCats = catHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expectedCats, actualCats);
    }

    @Test
    public void removeCatTest()
    {
        //Given
        CatHouse catHouse = new CatHouse();
        int expectedCats = 1;

        //When
        Cat sylvester = new Cat("Sylvester",new Date(),1);
        Cat oreo = new Cat("Oreo",new Date(),2);
        Cat tama = new Cat("Tama",new Date(),1);

        catHouse.add(sylvester);
        catHouse.add(oreo);
        catHouse.add(tama);

        catHouse.remove(tama); 
        catHouse.remove(sylvester);

        int actualCats = catHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expectedCats, actualCats);
    }


    @Test
    public void getCatByIdTest()
    {
        //Given
        Cat expectedCat = new Cat("Expected",new Date(2050, 12, 23),5);
        CatHouse catHouse = new CatHouse();

        //When
        catHouse.add(expectedCat);
        Cat actualCat =catHouse.getCatById(5);

        //Then
        Assert.assertEquals(expectedCat, actualCat);
    }
    

    @Test
    public void getNumberOfCatsTest()
    {
        //Given 
        int expectedAmount = 1;

        //When
        CatHouse catHouse = new CatHouse();
        Cat oliver = new Cat("Oliver",new Date(1988,11,18),23);
        catHouse.add(oliver);

        int actualAmount = catHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expectedAmount, actualAmount);
    }


}
