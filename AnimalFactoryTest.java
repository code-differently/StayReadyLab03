package hbcu.stay.ready;


public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest(){
        //Given
        Date birthday = new Date();
        Dog dog = ANimalFactory.createDog("Rex", birthday);
        
        //When
        Dog actual = dog;
        Dog expected = new Dog("Rex", birthday, 1);

        //Then
        Assert.assertEquals(expected, actual);
}

    @Test
    public void createCatTest(){
        //Given
        Date birthday = new Date();
        Cat cat = AnimalFactory.createCat("Susan", birthday, 1);

        //When
        Cat actual = cat; 
        Cat expected = new Cat("Susan", birthday, 1);

        //Then
        Assert.assertEquals(expected, actual);
}

}
