package hbcu.stay.ready;


public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addTest(){
        Dog dog = new Dog ("Trina", new Date(), 4);

        //When
        CatHouse.add(Cat);
        Integer expected = 1;
        Integer actual = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expected, actual);
}

    @Test
    public void removeIntegerIdTest(){
        Cat cat = new Cat ("Sam", new Date(), 4);

        //When
        CatHouse.add(cat);
        CatHouse.remove(4);
        Integer expected = 0;
        Integer actual = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expected, actual);
}

    @Test
    public void removeTest(){
        Cat cat = new Cat ("Sam", new Date(), 4);

        //When
        CatHouse.add(cat);
        CatHouse.remove(4);
        Integer expected = 0;
        Integer actual = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expected, actual);
}

    @Test
    public void getCatByIdTest(){
        //Given
        Cat cat = new Cat ("Sam", new Date(), 4);

        //When
        Integer expected = 4;
        Integer actual = cat.getId();

        //Then
        Assert.assertEquals(expected, actual);
}

    @Test
    public void getNumberOfCatsTest(){
        //Given
        Cat cat = new Cat ("Sam", new Date(), 4);
        CatHouse.add(cat);

        //When
        Integer expected = 1;
        Integer actual = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expected, actual);
}

}
